/**
 * generated by Xtext 2.30.0
 */
package org.xtext.gsht.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import java.util.ArrayList;
import java.util.HashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.gsht.gSelfOperatingHeuristicText.Alter;
import org.xtext.gsht.gSelfOperatingHeuristicText.Assignment;
import org.xtext.gsht.gSelfOperatingHeuristicText.Automaton;
import org.xtext.gsht.gSelfOperatingHeuristicText.ComparisonOperator;
import org.xtext.gsht.gSelfOperatingHeuristicText.Condition;
import org.xtext.gsht.gSelfOperatingHeuristicText.DataType;
import org.xtext.gsht.gSelfOperatingHeuristicText.Event;
import org.xtext.gsht.gSelfOperatingHeuristicText.Global;
import org.xtext.gsht.gSelfOperatingHeuristicText.Local;
import org.xtext.gsht.gSelfOperatingHeuristicText.Location;
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
    final Procedure1<Model> _function_1 = (Model it) -> {
      this.generateUppaal(it, fsa);
    };
    IteratorExtensions.<Model>forEach(Iterators.<Model>filter(resource.getAllContents(), Model.class), _function_1);
  }

  public void generateFile(final Model model, final IFileSystemAccess2 fsa) {
    String _plus = (model + ".java");
    fsa.generateFile(_plus, this.generate(model));
  }

  public CharSequence generate(final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("public class ");
    String _name = model.getName();
    _builder.append(_name, "\t");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("private State currentState;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    {
      EList<Event> _events = model.getEvents();
      for(final Event event : _events) {
        _builder.append("\t\t");
        _builder.append("private String ");
        String _name_1 = event.getName();
        _builder.append(_name_1, "\t\t");
        _builder.append(" = \"");
        String _name_2 = event.getName();
        _builder.append(_name_2, "\t\t");
        _builder.append("\";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    {
      EList<State> _states = model.getStates();
      for(final State state : _states) {
        _builder.append("\t\t");
        _builder.append("public State ");
        CharSequence _generateState = this.generateState(state);
        _builder.append(_generateState, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    {
      EList<Alter> _alters = model.getAlters();
      for(final Alter alter : _alters) {
        _builder.append("\t\t");
        _builder.append(alter, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  public CharSequence generateState(final State state) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = state.getName();
    _builder.append(_name);
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append(" \t");
    _builder.newLine();
    {
      EList<Local> _locals = state.getLocals();
      for(final Local local : _locals) {
        _builder.append("\t");
        _builder.append("private ");
        DataType _type = local.getType();
        _builder.append(_type, "\t");
        _builder.append(" ");
        String _name_1 = local.getName();
        _builder.append(_name_1, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    {
      EList<Local> _locals_1 = state.getLocals();
      for(final Local local_1 : _locals_1) {
        _builder.append("\t");
        _builder.append("public ");
        DataType _type_1 = local_1.getType();
        _builder.append(_type_1, "\t");
        _builder.append(" get");
        String _name_2 = local_1.getName();
        _builder.append(_name_2, "\t");
        _builder.append("() {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return this.");
        String _name_3 = local_1.getName();
        _builder.append(_name_3, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public void set");
        String _name_4 = local_1.getName();
        _builder.append(_name_4, "\t");
        _builder.append("(");
        DataType _type_2 = local_1.getType();
        _builder.append(_type_2, "\t");
        _builder.append(" name){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("this.");
        String _name_5 = local_1.getName();
        _builder.append(_name_5, "\t\t");
        _builder.append(" = name;");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("public void onEvent(String event) {");
    _builder.newLine();
    {
      EList<Transition> _transitions = state.getTransitions();
      for(final Transition transition : _transitions) {
        _builder.append("\t\t");
        _builder.append("if (");
        String _name_6 = transition.getEvent().getName();
        _builder.append(_name_6, "\t\t");
        _builder.append(".Equals(event)) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("this.currentState = ");
        String _name_7 = transition.getState().getName();
        _builder.append(_name_7, "\t\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("}\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  public void generateUppaal(final Model model, final IFileSystemAccess2 fsa) {
    EList<Automaton> automata = model.getAutomaton();
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
      for(final Automaton automaton : automata) {
        ArrayList<String> channels = new ArrayList<String>();
        _builder.newLineIfNotEmpty();
        ArrayList<String> edges = new ArrayList<String>();
        _builder.newLineIfNotEmpty();
        _builder.append("process ");
        String _name = automaton.getName();
        _builder.append(_name);
        _builder.append("(\t");
        _builder.newLineIfNotEmpty();
        EList<Location> _location = automaton.getLocation();
        for (final Location location : _location) {
          EList<Transition> _transitions = location.getState().getTransitions();
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
        EList<Location> _location_1 = automaton.getLocation();
        for (final Location location_1 : _location_1) {
          EList<Local> _locals = location_1.getState().getLocals();
          for (final Local prop : _locals) {
            {
              DataType _type = prop.getType();
              String type = (_type + "");
              boolean _notEquals = (!Objects.equal(type, "String"));
              if (_notEquals) {
                boolean _equals = Objects.equal(type, "boolean");
                if (_equals) {
                  String _name_1 = prop.getName();
                  String _name_2 = prop.getName();
                  String _plus = ("bool " + _name_2);
                  String _plus_1 = (_plus + ";");
                  propsMap.put(_name_1, _plus_1);
                } else {
                  String _name_3 = prop.getName();
                  String _name_4 = prop.getName();
                  String _plus_2 = ((type + " ") + _name_4);
                  String _plus_3 = (_plus_2 + ";");
                  propsMap.put(_name_3, _plus_3);
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
          EList<Location> _location_2 = automaton.getLocation();
          boolean _hasElements_1 = false;
          for(final Location location_2 : _location_2) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",", "\t\t");
            }
            _builder.append("\t\t");
            String _name_1 = location_2.getState().getName();
            _builder.append(_name_1, "\t\t");
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
        String _name_2 = automaton.getLocation().get(0).getState().getName();
        _builder.append(_name_2, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("trans");
        _builder.newLine();
        {
          EList<Location> _location_3 = automaton.getLocation();
          for(final Location location_3 : _location_3) {
            _builder.append("\t\t");
            State state = location_3.getState();
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            boolean _isEmpty = state.getTransitions().isEmpty();
            boolean _not = (!_isEmpty);
            if (_not) {
              EList<Transition> _transitions_1 = state.getTransitions();
              for (final Transition transition_1 : _transitions_1) {
                {
                  String _name_3 = state.getName();
                  String _plus = (_name_3 + " -> ");
                  String _name_4 = transition_1.getState().getName();
                  String _plus_1 = (_plus + _name_4);
                  String edge = (_plus_1 + "{");
                  Condition condition = transition_1.getCondition();
                  if ((condition != null)) {
                    String _edge = edge;
                    String _name_5 = condition.getLeft().getVariable().getName();
                    String _plus_2 = (" guard " + _name_5);
                    ComparisonOperator _operator = condition.getOperator();
                    String _plus_3 = (_plus_2 + _operator);
                    String _lowerCase = condition.getRight().toLowerCase();
                    String _plus_4 = (_plus_3 + _lowerCase);
                    String _plus_5 = (_plus_4 + ";");
                    edge = (_edge + _plus_5);
                  }
                  String _edge_1 = edge;
                  String _name_6 = transition_1.getEvent().getName();
                  String _plus_6 = (" sync " + _name_6);
                  String _plus_7 = (_plus_6 + "!;");
                  edge = (_edge_1 + _plus_7);
                  Assignment assignment = transition_1.getAssignment();
                  if ((assignment != null)) {
                    DataType _type = assignment.getCurrentVar().getVariable().getType();
                    String type = (_type + "");
                    boolean _contains = type.contains("String");
                    boolean _not_1 = (!_contains);
                    if (_not_1) {
                      String _edge_2 = edge;
                      String _name_7 = assignment.getCurrentVar().getVariable().getName();
                      String _plus_8 = (" assign " + _name_7);
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
        String _name_3 = event.getName();
        _builder.append(_name_3);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      for(final Automaton automaton_1 : automata) {
        ArrayList<String> channels_1 = new ArrayList<String>();
        _builder.newLineIfNotEmpty();
        EList<Location> _location_4 = automaton_1.getLocation();
        for (final Location location_4 : _location_4) {
          EList<Transition> _transitions_2 = location_4.getState().getTransitions();
          for (final Transition transition_2 : _transitions_2) {
            channels_1.add(transition_2.getEvent().getName());
          }
        }
        _builder.newLineIfNotEmpty();
        String _name_4 = automaton_1.getName();
        _builder.append(_name_4);
        _builder.append("1 = ");
        String _name_5 = automaton_1.getName();
        _builder.append(_name_5);
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
      EList<Automaton> _automaton = model.getAutomaton();
      for(final Automaton automaton_2 : _automaton) {
        _builder.append("system ");
        String _name_6 = automaton_2.getName();
        _builder.append(_name_6);
        _builder.append("1;");
        _builder.newLineIfNotEmpty();
      }
    }
    CharSequence context = _builder;
    String _plus = (model + ".xta");
    fsa.generateFile(_plus, context);
  }
}
