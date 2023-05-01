package statemachines;

import java.util.HashMap;

public class GState {

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

    public int propsReturnerSize() {
        return tmpGlobalProps.size();
    }

    public void clearGlobalProps() {
        tmpGlobalProps.clear();
    }

    public Object getProp(String key) {
        return props.get(key);
    }

    public HashMap<String, Object> getProps() {
        return props;
    }

    public String onEvent(String event) {
        if (transitions.containsKey(event)) {
            Transition t = transitions.get(event);
            // Transition can have a condition and a set action
            if (t.hasCondition() && t.hasSetAction()) {
                if (t.hasEvaluatedGlobalProp()) {
                    var tmpProp = getEvalGlobalProp(t.getEvaluatedValueName());
                    if (t.evaluateCondition(tmpProp)) {
                        setNewGlobalProp(t.getGlobalPropName(), t.getSetValue());
                        return t.getToState();
                    } else {
                        return name;
                    }
                } else {
                    if (t.evaluateCondition(t.getEvaluatedValueName())) {
                        addProp(t.getGlobalPropName(), t.getSetValue());
                        return t.getToState();
                    } else {
                        return name;
                    }
                }
            }
            // Transition can have a condition only
            if (t.hasCondition()) {
                if (t.hasEvaluatedGlobalProp()) {
                    var tmpProp = getEvalGlobalProp(t.getEvaluatedValueName());
                    if (t.evaluateCondition(tmpProp)) {
                        return t.getToState();
                    } else {
                        return name;
                    }
                }
                else {
                    if (t.evaluateCondition(props.get(t.getEvaluatedValueName()))) {
                        return t.getToState();
                    } else {
                        return name;
                    }
                }
            }
            // Transition can have a set action only
            if (t.hasSetAction()) {
                if (t.hasGlobalPropName()) {
                    setNewGlobalProp(t.getGlobalPropName(), t.getSetValue());
                    return t.getToState();
                }
                else {
                    addProp(t.getGlobalPropName(), t.getSetValue());
                    return t.getToState();
                }
            }
        }
        return name;
    }


    public void printState() {
        this.props.entrySet().forEach(entry -> {
            System.out.println(String.format("%s\t%s", entry.getKey(), entry.getValue().toString()));
        });
    }
}