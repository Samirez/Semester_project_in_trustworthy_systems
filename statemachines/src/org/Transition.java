package org;

public class Transition {

    private String event;
    private String toState;
    private String operatorType;
    private String evaluatedValueName;
    private boolean hasCondition = false;
    private boolean hasSetAction = false;
    private boolean evaluatedValueIsGlobal = false;
    private Object operatingValue;
    private Object setValue;
    private Assignment assignment;

    public Transition() {
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getEvent() {
        return this.event;
    }

    public void setToState(String toState) {
        this.toState = toState;
    }

    public String getToState() {
        return toState;
    }

    public void setOperatorType(String operatorType) {
        this.operatorType = operatorType;
    }

    public void setEvaluatedValueName(String evaluatedValueName) {
        this.evaluatedValueName = evaluatedValueName;
    }

    public void setEvaluatedValueName(String evaluatedValueName, boolean isGlobal) {
        this.evaluatedValueName = evaluatedValueName;
        this.evaluatedValueIsGlobal = isGlobal;
    }

    public boolean isEvaluatedValueGlobal() {
        return evaluatedValueIsGlobal;
    }

    public String getEvaluatedValueName() {
        return evaluatedValueName;
    }

    public void setHasCondition(boolean hasCondition) {
        this.hasCondition = hasCondition;
    }

    public void setOperatingValue(Object operatingValue) {
        this.operatingValue = operatingValue;
    }

    public void createAssignment(String name, Object value) {
        hasSetAction = true;
        assignment = new Assignment() {
            {
                setName(name);
                setValue(value);
            }
        };
    }

    public void createAssignment(String name, Object value, boolean isGlobal) {
        hasSetAction = true;
        assignment = new Assignment() {
            {
                setName(name);
                setValue(value);
                setGlobal(isGlobal);
            }
        };
    }

    public String getAssignmentName() {
        return assignment.getName();
    }

    public Object getAssignmentValue() {
        return assignment.getValue();
    }

    public boolean assignmentIsGlobal() {
        return assignment.isGlobal();
    }

    public boolean hasCondition() {
        return hasCondition;
    }

    public boolean hasSetAction() {
        return hasSetAction;
    }

    public boolean evaluateCondition(Object evaluatedValue) {
        switch (this.operatorType){
            case "==":
                return this.operatingValue.equals(evaluatedValue);

            case "!=":
                return !this.operatingValue.equals(evaluatedValue);

            case ">=":
                return (double)evaluatedValue >= (double)this.operatingValue;

            case ">":
                return (double)evaluatedValue > (double)this.operatingValue;

            case "<":
                return (double)evaluatedValue < (double)this.operatingValue;

            case "<=":
                return (double)evaluatedValue <= (double)this.operatingValue;

            default:
                return false;
        }
    }
}