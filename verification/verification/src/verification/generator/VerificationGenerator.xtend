/*
 * generated by Xtext 2.30.0
 */
package verification.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import verification.verification.Model
import verification.verification.State
import org.eclipse.emf.common.util.EList
import java.util.ArrayList

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class VerificationGenerator extends AbstractGenerator {


	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		resource.allContents.filter(typeof(Model)).forEach[it.generateFile(fsa)]
		resource.allContents.filter(typeof(Model)).forEach[it.generateUppaal(fsa)]
	}
		
	def void generateFile(Model model, IFileSystemAccess2 fsa){
		fsa.generateFile(model+'.java', model.generate)
	}
	def generate(Model model){
		'''
			public class «model.name» {
				
				private State currentState;
				
				«FOR event: model.events»
					private String «event.name» = "«event.name»";
				«ENDFOR»
				
				«FOR state: model.states»
					public State «state.generateState»
				«ENDFOR»
				
				«FOR alter: model.alters»
					«alter»;
				«ENDFOR»
		}
		'''
	}
		
	def generateState(State state){
		'''
		«state.name»() {
		 	
			«FOR local: state.locals»
			private «local.type» «local.name»;
			«ENDFOR»
				
			«FOR local: state.locals»
			public «local.type» get«local.name»() {
				return this.«local.name»;
			}
				
			public void set«local.name»(«local.type» name){
				this.«local.name» = name;
			}
			«ENDFOR»
			public void onEvent(String event) {
				«FOR transition : state.transitions»
				if («transition.event.name».Equals(event)) {
					this.currentState = «transition.state.name»
				}
				«ENDFOR»
			}	
		}
		'''
	}
	
	def void generateUppaal(Model model, IFileSystemAccess2 fsa){
		var automata = model.automaton
		
		
		var CharSequence context = '''
		«FOR global: model.globals»
		«global.type» «global.name»;
		«ENDFOR»
		
		«FOR automaton: automata»
		«var channels = new ArrayList()»
		«var edges = new ArrayList()»
		process «automaton.name»(	
		« /*saving all events into channels */
		for(location:automaton.location){
			for(transition: location.state.transitions){
				channels.add(transition.event.name)
			}
		}
		»
		«FOR chan: channels SEPARATOR ','»
		chan &«chan»
		«ENDFOR»
		){
			state
				«FOR location: automaton.location SEPARATOR ',' AFTER ';'»
					«location.state.name»
				«ENDFOR»
				
				init «automaton.location.get(0).state.name»;
				
			trans
				«FOR location: automaton.location»
				«var state = location.state»
				«
				if(!state.transitions.isEmpty()){
					for(transition : state.transitions){
						var edge = state.name + " -> " + transition.state.name + "{"
						var condition = transition.condition
						if(condition !== null){edge += " guard " + condition.left.variable.name + condition.operator + condition.right.toLowerCase() +";"}
						edge += " sync " + transition.event.name + "!;"
						edges.add(edge += " }")
					}	
				}
				»		
				«ENDFOR»
				«FOR edge: edges SEPARATOR ',' AFTER ';'»
				«edge»
				«ENDFOR»
				}
		«ENDFOR»
		
		«FOR event: model.events»
		chan «event.name»;
		«ENDFOR»
		
		«FOR automaton: automata»
		«var channels = new ArrayList()»
		« /*saving all events into channels */
			for(location:automaton.location){
				for(transition: location.state.transitions){
					channels.add(transition.event.name)
				}
			}
		»
		«automaton.name»1 = «automaton.name»(
		«FOR chan: channels SEPARATOR ','»
		«chan» 
		«ENDFOR»
		);
		«ENDFOR»
		
		«FOR automaton: model.automaton»
		system «automaton.name»1;
		«ENDFOR»
		'''
		
		fsa.generateFile(model+'.xta', context)
		
		
	}
}
