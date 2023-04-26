/**
 * generated by Xtext 2.30.0
 */
package org.xtext.gsht.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.gsht.gSelfOperatingHeuristicText.Assignment;
import org.xtext.gsht.gSelfOperatingHeuristicText.ComparisonOperator;
import org.xtext.gsht.gSelfOperatingHeuristicText.Condition;
import org.xtext.gsht.gSelfOperatingHeuristicText.Event;
import org.xtext.gsht.gSelfOperatingHeuristicText.Global;
import org.xtext.gsht.gSelfOperatingHeuristicText.Initial;
import org.xtext.gsht.gSelfOperatingHeuristicText.Local;
import org.xtext.gsht.gSelfOperatingHeuristicText.Model;
import org.xtext.gsht.gSelfOperatingHeuristicText.State;
import org.xtext.gsht.gSelfOperatingHeuristicText.Transition;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class GSelfOperatingHeuristicTextGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final Procedure1<Model> _function = (Model it) -> {
      this.generateFile(it, fsa);
    };
    IteratorExtensions.<Model>forEach(Iterators.<Model>filter(resource.getAllContents(), Model.class), _function);
  }

  public void generateFile(final Model model, final IFileSystemAccess2 fsa) {
    String _name = model.getName();
    String _plus = ("gsht/" + _name);
    String _plus_1 = (_plus + ".java");
    fsa.generateFile(_plus_1, this.generate(model));
  }

  public CharSequence generate(final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/* Autogenerated Code */");
    _builder.newLine();
    _builder.append("package gsht;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import statemachines.GState;");
    _builder.newLine();
    _builder.append("import statemachines.Transition;");
    _builder.newLine();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.append("import java.util.HashMap;");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name = model.getName();
    _builder.append(_name);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private GState currentState;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private HashMap<String, Object> globalProps = new HashMap<>() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("{");
    _builder.newLine();
    {
      EList<Global> _globals = model.getGlobals();
      for(final Global p : _globals) {
        _builder.append("\t\t");
        _builder.append("put(\"");
        String _name_1 = p.getName();
        _builder.append(_name_1, "\t\t");
        _builder.append("\", ");
        String _value = p.getValue();
        _builder.append(_value, "\t\t");
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("};");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private ArrayList<String> events = new ArrayList<>() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("{");
    _builder.newLine();
    {
      EList<Event> _events = model.getEvents();
      for(final Event event : _events) {
        _builder.append("\t\t\t");
        _builder.append("add(\"");
        String _name_2 = event.getName();
        _builder.append(_name_2, "\t\t\t");
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("};");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private HashMap<String, GState> states = new HashMap<>() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t");
    CharSequence _generateState = this.generateState(model);
    _builder.append(_generateState, "\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("};");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _name_3 = model.getName();
    _builder.append(_name_3, "\t");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    {
      EList<State> _states = model.getStates();
      for(final State s : _states) {
        {
          Initial _init = s.getInit();
          boolean _notEquals = (!Objects.equal(_init, null));
          if (_notEquals) {
            _builder.append("\t\t");
            _builder.append("currentState = states.get(\"");
            String _name_4 = s.getName();
            _builder.append(_name_4, "\t\t");
            _builder.append("\");");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void processEvent(String event) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("String nextStateName = currentState.onEvent(event);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if(nextStateName.equals(currentState.getName())) return;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (currentState.propsReturnerSize() > 0) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("for (String key : currentState.getPropReturner().keySet()) {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("globalProps.put(key, currentState.getPropReturnerValue(key));");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("currentState.clearPropReturner();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("currentState = states.get(nextStateName);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("};");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  public CharSequence generateState(final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<State> _states = model.getStates();
      for(final State state : _states) {
        _builder.append("put(\"");
        String _name = state.getName();
        _builder.append(_name);
        _builder.append("\", new GState() {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("{");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("setName(\"");
        String _name_1 = state.getName();
        _builder.append(_name_1, "\t\t");
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
        {
          int _length = ((Object[])Conversions.unwrapArray(state.getLocals(), Object.class)).length;
          boolean _greaterThan = (_length > 0);
          if (_greaterThan) {
            {
              EList<Local> _locals = state.getLocals();
              for(final Local p : _locals) {
                _builder.append("\t\t");
                _builder.append("addProp(\"");
                String _name_2 = p.getName();
                _builder.append(_name_2, "\t\t");
                _builder.append("\", ");
                String _value = p.getValue();
                _builder.append(_value, "\t\t");
                _builder.append(");");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        _builder.append("\t\t");
        CharSequence _generateTransition = this.generateTransition(state);
        _builder.append(_generateTransition, "\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("});");
        _builder.newLine();
      }
    }
    return _builder;
  }

  public CharSequence generateTransition(final State state) {
    StringConcatenation _builder = new StringConcatenation();
    {
      int _length = ((Object[])Conversions.unwrapArray(state.getTransitions(), Object.class)).length;
      boolean _greaterThan = (_length > 0);
      if (_greaterThan) {
        {
          EList<Transition> _transitions = state.getTransitions();
          for(final Transition t : _transitions) {
            _builder.append("addTransition(\"");
            String _name = t.getEvent().getName();
            _builder.append(_name);
            _builder.append("\", new Transition() {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("{");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("setEvent(\"");
            String _name_1 = t.getEvent().getName();
            _builder.append(_name_1, "\t\t");
            _builder.append("\");");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("setToState(\"");
            String _name_2 = t.getState().getName();
            _builder.append(_name_2, "\t\t");
            _builder.append("\");");
            _builder.newLineIfNotEmpty();
            {
              Condition _condition = t.getCondition();
              boolean _notEquals = (!Objects.equal(_condition, null));
              if (_notEquals) {
                _builder.append("\t\t");
                _builder.append("setHasCondition(true);");
                _builder.newLine();
                _builder.append("\t\t");
                _builder.append("setEvaluatedValueName(\"");
                String _name_3 = t.getCondition().getLeft().getVariable().getName();
                _builder.append(_name_3, "\t\t");
                _builder.append("\");");
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t");
                _builder.append("setOperatorType(\"");
                ComparisonOperator _operator = t.getCondition().getOperator();
                _builder.append(_operator, "\t\t");
                _builder.append("\");");
                _builder.newLineIfNotEmpty();
                {
                  String _right = t.getCondition().getRight();
                  boolean _equals = Objects.equal(_right, "TRUE");
                  if (_equals) {
                    _builder.append("\t\t");
                    _builder.append("setOperatingValue(true);");
                    _builder.newLine();
                  } else {
                    String _right_1 = t.getCondition().getRight();
                    boolean _equals_1 = Objects.equal(_right_1, "FALSE");
                    if (_equals_1) {
                      _builder.append("\t\t");
                      _builder.append("setOperatingValue(false);");
                      _builder.newLine();
                    } else {
                      _builder.append("\t\t");
                      _builder.append("setOperatingValue(");
                      String _right_2 = t.getCondition().getRight();
                      _builder.append(_right_2, "\t\t");
                      _builder.append(");");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                }
              }
            }
            {
              Assignment _assignment = t.getAssignment();
              boolean _notEquals_1 = (!Objects.equal(_assignment, null));
              if (_notEquals_1) {
                _builder.append("\t\t");
                _builder.append("setHasSetAction(true);");
                _builder.newLine();
                _builder.append("\t\t");
                _builder.append("setGlobalPropName(\"");
                String _name_4 = t.getAssignment().getCurrentVar().getVariable().getName();
                _builder.append(_name_4, "\t\t");
                _builder.append("\");");
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t");
                _builder.append("setSetValue(\"");
                String _value = t.getAssignment().getValue();
                _builder.append(_value, "\t\t");
                _builder.append("\");");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
            _builder.append("});");
            _builder.newLine();
          }
        }
      }
    }
    return _builder;
  }
}
