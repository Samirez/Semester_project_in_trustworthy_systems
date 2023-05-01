/**
 * generated by Xtext 2.30.0
 */
package org.xtext.gsht.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
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
import org.xtext.gsht.gSelfOperatingHeuristicText.Automaton;
import org.xtext.gsht.gSelfOperatingHeuristicText.ComparisonOperator;
import org.xtext.gsht.gSelfOperatingHeuristicText.Condition;
import org.xtext.gsht.gSelfOperatingHeuristicText.DataType;
import org.xtext.gsht.gSelfOperatingHeuristicText.Event;
import org.xtext.gsht.gSelfOperatingHeuristicText.Global;
import org.xtext.gsht.gSelfOperatingHeuristicText.Local;
import org.xtext.gsht.gSelfOperatingHeuristicText.Model;
import org.xtext.gsht.gSelfOperatingHeuristicText.State;
import org.xtext.gsht.gSelfOperatingHeuristicText.Transition;
import org.xtext.gsht.gSelfOperatingHeuristicText.Variable;

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
    final Procedure1<Model> _function_1 = (Model it) -> {
      this.generateUppaal(it, fsa);
    };
    IteratorExtensions.<Model>forEach(Iterators.<Model>filter(resource.getAllContents(), Model.class), _function_1);
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
    _builder.append("import org.State;");
    _builder.newLine();
    _builder.append("import org.Transition;");
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
    _builder.append("private State currentState;");
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
        _builder.append(");");
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
    _builder.append("private HashMap<String, State> states = new HashMap<>() {");
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
          boolean _isInit = s.isInit();
          if (_isInit) {
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
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public HashMap<String, Object> getGlobalProps() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return globalProps;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void setGlobalProps(HashMap<String, Object> globalProps) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.globalProps = globalProps;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void setGlobalProp(String key, Object value) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.globalProps.put(key, value);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void processEvent(String event) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("printEvent(event);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("currentState.setGlobalProps(new HashMap<>(globalProps));");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("String nextStateName = currentState.onEvent(event);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (currentState.getGlobalPropsSize() > 0) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("this.globalProps = new HashMap<>(currentState.returnGlobalProps());");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("currentState = states.get(nextStateName);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("printGlobalProps();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("printCurrentState(currentState);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("};");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private void printEvent(String event) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("System.out.println();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("System.out.println(\"==================================\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("System.out.println(String.format(\"Processing event: \'%s\'...\", event));");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("System.out.println(\"==================================\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("System.out.println();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private void printGlobalProps() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("System.out.println(\"Global props:\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("globalProps.entrySet().forEach(entry -> {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("System.out.println(String.format(\"%s\\t%s\", entry.getKey(), entry.getValue().toString()));");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("});");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("System.out.println();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private void printCurrentState(State state) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("System.out.println(String.format(\"Current state: %s\", state.getName()));");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("state.printState();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public State getCurrentState() {");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("return currentState;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
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
        _builder.append("\", new State() {");
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
                {
                  Variable _variable = t.getCondition().getLeft().getVariable();
                  if ((_variable instanceof Global)) {
                    _builder.append("\t\t");
                    _builder.append("setEvaluatedValueName(\"");
                    String _name_3 = t.getCondition().getLeft().getVariable().getName();
                    _builder.append(_name_3, "\t\t");
                    _builder.append("\", true);");
                    _builder.newLineIfNotEmpty();
                  } else {
                    _builder.append("\t\t");
                    _builder.append("setEvaluatedValueName(\"");
                    String _name_4 = t.getCondition().getLeft().getVariable().getName();
                    _builder.append(_name_4, "\t\t");
                    _builder.append("\");");
                    _builder.newLineIfNotEmpty();
                  }
                }
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
                {
                  Variable _variable_1 = t.getAssignment().getCurrentVar().getVariable();
                  if ((_variable_1 instanceof Global)) {
                    _builder.append("\t\t");
                    _builder.append("createAssignment(\"");
                    String _name_5 = t.getAssignment().getCurrentVar().getVariable().getName();
                    _builder.append(_name_5, "\t\t");
                    _builder.append("\", ");
                    String _value = t.getAssignment().getValue();
                    _builder.append(_value, "\t\t");
                    _builder.append(", true);");
                    _builder.newLineIfNotEmpty();
                  } else {
                    _builder.append("\t\t");
                    _builder.append("createAssignment(\"");
                    String _name_6 = t.getAssignment().getCurrentVar().getVariable().getName();
                    _builder.append(_name_6, "\t\t");
                    _builder.append("\", ");
                    String _value_1 = t.getAssignment().getValue();
                    _builder.append(_value_1, "\t\t");
                    _builder.append(", false);");
                    _builder.newLineIfNotEmpty();
                  }
                }
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

  public void generateUppaal(final Model model, final IFileSystemAccess2 fsa) {
    HashMap<String, List<State>> automata = new HashMap<String, List<State>>();
    boolean _isEmpty = model.getAutomaton().isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      EList<Automaton> _automaton = model.getAutomaton();
      for (final Automaton a : _automaton) {
        automata.put(a.getName(), a.getStates());
      }
    } else {
      automata.put(model.getName(), model.getStates());
    }
    StringConcatenation _builder = new StringConcatenation();
    ArrayList<String> globals = new ArrayList<String>();
    _builder.newLineIfNotEmpty();
    EList<Global> _globals = model.getGlobals();
    for (final Global global : _globals) {
      {
        DataType _type = global.getType();
        String type = (_type + "");
        boolean _notEquals = (!Objects.equal(type, "String"));
        if (_notEquals) {
          boolean _equals = Objects.equal(type, "boolean");
          if (_equals) {
            String _name = global.getName();
            String _plus = ("bool " + _name);
            String _plus_1 = (_plus + ";");
            globals.add(_plus_1);
          } else {
            String _name_1 = global.getName();
            String _plus_2 = ((type + " ") + _name_1);
            String _plus_3 = (_plus_2 + ";");
            globals.add(_plus_3);
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    {
      for(final String global_1 : globals) {
        _builder.append(global_1);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      Set<String> _keySet = automata.keySet();
      for(final String automaton : _keySet) {
        ArrayList<String> channels = new ArrayList<String>();
        _builder.newLineIfNotEmpty();
        ArrayList<String> edges = new ArrayList<String>();
        _builder.newLineIfNotEmpty();
        List<State> locations = automata.get(automaton);
        _builder.newLineIfNotEmpty();
        _builder.append("process ");
        _builder.append(automaton);
        _builder.append("(\t");
        _builder.newLineIfNotEmpty();
        List<State> _get = automata.get(automaton);
        for (final State location : _get) {
          EList<Transition> _transitions = location.getTransitions();
          for (final Transition transition : _transitions) {
            channels.add(transition.getEvent().getName());
          }
        }
        _builder.newLineIfNotEmpty();
        {
          boolean _hasElements = false;
          for(final String chan : channels) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            _builder.append("chan &");
            _builder.append(chan);
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("){");
        _builder.newLine();
        _builder.append("\t");
        HashMap<String, String> propsMap = new HashMap<String, String>();
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        for (final State location_1 : locations) {
          EList<Local> _locals = location_1.getLocals();
          for (final Local prop : _locals) {
            {
              DataType _type = prop.getType();
              String type = (_type + "");
              boolean _notEquals = (!Objects.equal(type, "String"));
              if (_notEquals) {
                boolean _equals = Objects.equal(type, "boolean");
                if (_equals) {
                  String _name = prop.getName();
                  String _name_1 = prop.getName();
                  String _plus = ("bool " + _name_1);
                  String _plus_1 = (_plus + ";");
                  propsMap.put(_name, _plus_1);
                } else {
                  String _name_2 = prop.getName();
                  String _name_3 = prop.getName();
                  String _plus_2 = ((type + " ") + _name_3);
                  String _plus_3 = (_plus_2 + ";");
                  propsMap.put(_name_2, _plus_3);
                }
              }
            }
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        Object[] props = propsMap.values().toArray();
        _builder.newLineIfNotEmpty();
        {
          for(final Object prop_1 : props) {
            _builder.append("\t");
            _builder.append(prop_1, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("state");
        _builder.newLine();
        {
          boolean _hasElements_1 = false;
          for(final State location_2 : locations) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",", "\t\t");
            }
            _builder.append("\t\t");
            String _name = location_2.getName();
            _builder.append(_name, "\t\t");
            _builder.newLineIfNotEmpty();
          }
          if (_hasElements_1) {
            _builder.append(";", "\t\t");
          }
        }
        _builder.append("\t\t");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("init ");
        String _name_1 = locations.get(0).getName();
        _builder.append(_name_1, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("trans");
        _builder.newLine();
        {
          for(final State location_3 : locations) {
            _builder.append("\t\t");
            boolean _isEmpty_1 = location_3.getTransitions().isEmpty();
            boolean _not_1 = (!_isEmpty_1);
            if (_not_1) {
              EList<Transition> _transitions_1 = location_3.getTransitions();
              for (final Transition transition_1 : _transitions_1) {
                {
                  String _name_2 = location_3.getName();
                  String _plus = (_name_2 + " -> ");
                  String _name_3 = transition_1.getState().getName();
                  String _plus_1 = (_plus + _name_3);
                  String edge = (_plus_1 + "{");
                  Condition condition = transition_1.getCondition();
                  if ((condition != null)) {
                    String _edge = edge;
                    String _name_4 = condition.getLeft().getVariable().getName();
                    String _plus_2 = (" guard " + _name_4);
                    ComparisonOperator _operator = condition.getOperator();
                    String _plus_3 = (_plus_2 + _operator);
                    String _lowerCase = condition.getRight().toLowerCase();
                    String _plus_4 = (_plus_3 + _lowerCase);
                    String _plus_5 = (_plus_4 + ";");
                    edge = (_edge + _plus_5);
                  }
                  String _edge_1 = edge;
                  String _name_5 = transition_1.getEvent().getName();
                  String _plus_6 = (" sync " + _name_5);
                  String _plus_7 = (_plus_6 + "!;");
                  edge = (_edge_1 + _plus_7);
                  Assignment assignment = transition_1.getAssignment();
                  if ((assignment != null)) {
                    DataType _type = assignment.getCurrentVar().getVariable().getType();
                    String type = (_type + "");
                    boolean _contains = type.contains("String");
                    boolean _not_2 = (!_contains);
                    if (_not_2) {
                      String _edge_2 = edge;
                      String _name_6 = assignment.getCurrentVar().getVariable().getName();
                      String _plus_8 = (" assign " + _name_6);
                      String _plus_9 = (_plus_8 + " = ");
                      String _lowerCase_1 = assignment.getValue().toLowerCase();
                      String _plus_10 = (_plus_9 + _lowerCase_1);
                      String _plus_11 = (_plus_10 + ";");
                      edge = (_edge_2 + _plus_11);
                    }
                  }
                  String _edge_3 = edge;
                  String _plus_12 = edge = (_edge_3 + " }");
                  edges.add(_plus_12);
                }
              }
            }
            _builder.append("\t\t");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          boolean _hasElements_2 = false;
          for(final String edge : edges) {
            if (!_hasElements_2) {
              _hasElements_2 = true;
            } else {
              _builder.appendImmediate(",", "\t\t");
            }
            _builder.append("\t\t");
            _builder.append(edge, "\t\t");
            _builder.newLineIfNotEmpty();
          }
          if (_hasElements_2) {
            _builder.append(";", "\t\t");
          }
        }
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.newLine();
    {
      EList<Event> _events = model.getEvents();
      for(final Event event : _events) {
        _builder.append("chan ");
        String _name_2 = event.getName();
        _builder.append(_name_2);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      Set<String> _keySet_1 = automata.keySet();
      for(final String automaton_1 : _keySet_1) {
        ArrayList<String> channels_1 = new ArrayList<String>();
        _builder.newLineIfNotEmpty();
        List<State> _get_1 = automata.get(automaton_1);
        for (final State location_4 : _get_1) {
          EList<Transition> _transitions_2 = location_4.getTransitions();
          for (final Transition transition_2 : _transitions_2) {
            channels_1.add(transition_2.getEvent().getName());
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append(automaton_1);
        _builder.append("1 = ");
        _builder.append(automaton_1);
        _builder.append("(");
        _builder.newLineIfNotEmpty();
        {
          boolean _hasElements_3 = false;
          for(final String chan_1 : channels_1) {
            if (!_hasElements_3) {
              _hasElements_3 = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            _builder.append(chan_1);
            _builder.append(" ");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append(");");
        _builder.newLine();
      }
    }
    _builder.newLine();
    {
      EList<Automaton> _automaton_1 = model.getAutomaton();
      for(final Automaton automaton_2 : _automaton_1) {
        _builder.append("system ");
        String _name_3 = automaton_2.getName();
        _builder.append(_name_3);
        _builder.append("1;");
        _builder.newLineIfNotEmpty();
      }
    }
    CharSequence context = _builder;
    String _plus = (model + ".xta");
    fsa.generateFile(_plus, context);
  }
}
