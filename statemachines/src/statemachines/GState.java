package statemachines;

import java.util.HashMap;

public class GState {
	
	private String name;
    private HashMap<String, Object> props = new HashMap<String, Object>();
    private HashMap<String, Transition> transitions = new HashMap<String, Transition>();

    private HashMap<String, Object> propReturner = new HashMap<>();

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

    public void setPropReturner(String key, Object value) {
        propReturner.put(key, value);
    }

    public HashMap<String, Object> getPropReturner() {
        return propReturner;
    }

    public Object getPropReturnerValue(String key) {
        return propReturner.get(key);
    }

    public int propsReturnerSize() {
        return propReturner.size();
    }

    public void clearPropReturner() {
        propReturner.clear();
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
            if (t.hasCondition() && t.hasSetAction()) {
                return conditionAndSetAction(t.evaluateCondition(props.get(t.getEvaluatedValueName())), t, name);
            } else if (t.hasCondition()) {
                return conditionOnly(t);
            } else if (t.hasSetAction()) {
                return setActionOnly(t);
            } else {
                return t.getToState();
            }
        }
        return name;
    }

    private String setActionOnly(Transition t) {
        setPropReturner(t.getEvaluatedValueName(), t.getSetValue());
        return t.getToState();
    }

    private String conditionOnly(Transition t) {
        if (t.evaluateCondition(props.get(t.getEvaluatedValueName()))) {
            return t.getToState();
        } else {
            return name;
        }
    }

    private String conditionAndSetAction(boolean t, Transition t1, String name) {
        if (t) {
            setPropReturner(t1.getEvaluatedValueName(), t1.getSetValue());
            return t1.getToState();
        } else {
            return name;
        }
    }
}