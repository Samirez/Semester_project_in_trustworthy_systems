package org;

import java.util.HashMap;

public class State {

    private String name;
    private HashMap<String, Object> props = new HashMap<>();
    private HashMap<String, Transition> transitions = new HashMap<>();
    private HashMap<String, Object> tmpGlobalProps = new HashMap<>();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addProp(String key, Object value) {
        props.put(key, value);
    }

    public void addTransition(String event, Transition transition) {
        transitions.put(event, transition);
    }

    public void setGlobalProps(HashMap<String, Object> tempPropReturner) {
        tmpGlobalProps = tempPropReturner;
    }

    public void setNewGlobalProp(String key, Object value) {
        tmpGlobalProps.put(key, value);
    }

    public HashMap<String, Object> returnGlobalProps(){
        return tmpGlobalProps;
    }

    public Object getEvalGlobalProp(String key) {
        return tmpGlobalProps.get(key);
    }

    public int getGlobalPropsSize() {
        return tmpGlobalProps.size();
    }

    public void clearGlobalProps() {
        tmpGlobalProps.clear();
    }


    public String onEvent(String event) {
        if (transitions.containsKey(event)) {
            Transition t = transitions.get(event);
            // Transition can have a condition and a set action
            if (t.hasCondition() && t.hasSetAction()) {
                return performControlFlow(t, true);
            }
            // Transition can have a condition only
            if (t.hasCondition()) {
                return performControlFlow(t, false);
            }
            // Transition can have a set action only
            if (t.hasSetAction()) {
                assign(t);
                return t.getToState();
            }
        }
        return name;
    }

    private String performControlFlow(Transition t, boolean hasAssignment) {
        if(t.isEvaluatedValueGlobal()){
            var tmpProp = getEvalGlobalProp(t.getEvaluatedValueName());
            if (t.evaluateCondition(tmpProp)) {
                if (hasAssignment) { assign(t); }
                return t.getToState();
            } else {
                return name;
            }
        }
        else {
            if (t.evaluateCondition(props.get(t.getEvaluatedValueName()))) {
                if (hasAssignment) { assign(t); }
                return t.getToState();
            } else {
                return name;
            }
        }
    }

    private void assign(Transition t) {
        if (t.assignmentIsGlobal()){
            setNewGlobalProp(t.getAssignmentName(), t.getAssignmentValue());
        }
        else {
            addProp(t.getAssignmentName(), t.getAssignmentValue());
        }
    }


    public void printState() {
        this.props.entrySet().forEach(entry -> {
            System.out.println(String.format("%s\t%s", entry.getKey(), entry.getValue().toString()));
        });
    }
}