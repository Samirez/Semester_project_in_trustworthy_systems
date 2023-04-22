/*
 * generated by Xtext 2.30.0
 */
package org.xtext.gsht.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.gsht.gSelfOperatingHeuristicText.Model
import org.xtext.gsht.gSelfOperatingHeuristicText.State
import org.xtext.gsht.gSelfOperatingHeuristicText.Local

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class GSelfOperatingHeuristicTextGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		resource.allContents.filter(typeof(Model)).forEach[it.generateFile(fsa)]
	}
		
	def void generateFile(Model model, IFileSystemAccess2 fsa){
		fsa.generateFile(model+'.java', model.generate)
	}
	def generate(Model model){
		'''
			public class «model» {
				«FOR event: model.events»
					private String «event»;
				«ENDFOR»
				«FOR states: model.states»
					public class «states.generateState»;
				«ENDFOR»
				«FOR alter: model.alters»
					«alter»;
				«ENDFOR»
			}
		'''
	}
		
	def generateState(State state){
		'''
			{
				«FOR local: state.locals»
					private «local.type» «local.name»;
				«ENDFOR»
				«FOR local: state.locals»
				
				public «local.type» get«local.name»(){
						return «local.name»;
				}
				
				public void set«local.name»(«local.type» name){
					«local.name»=name;
				}
				«ENDFOR»
				
			}
		'''
	}
}
