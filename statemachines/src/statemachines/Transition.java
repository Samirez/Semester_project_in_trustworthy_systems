package statemachines;

public class Transition {

    private String toState;
    private String event;
    private String operatorType;
    private String evaluatedValueName;
    private boolean hasCondition = false;
    private boolean hasSetAction = false;
    private Object operatingValue;
    private Object setValue;

    public Transition() {
    }

    public void setToState(String toState) {
        this.toState = toState;
    }

    public String getToState() {
        return toState;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public void setOperatorType(String operatorType) {
        this.operatorType = operatorType;
    }

    public void setEvaluatedValueName(String evaluatedValueName) {
        this.evaluatedValueName = evaluatedValueName;
    }

    public String getEvaluatedValueName() {
        return evaluatedValueName;
    }

    public void setHasCondition(boolean hasCondition) {
        this.hasCondition = hasCondition;
    }

    public void setHasSetAction(boolean hasSetAction) {
        this.hasSetAction = hasSetAction;
    }

    public void setOperatingValue(Object operatingValue) {
        this.operatingValue = operatingValue;
    }

    public void setSetValue(Object setValue) {
        this.setValue = setValue;
    }

    public Object getSetValue() {
        return setValue;
    }
    
	public boolean hasCondition() {
		return hasCondition;
	}


    public boolean hasSetAction() {
        return hasSetAction;
    }

    public boolean evaluateCondition(Object evaluatedValue) {
        switch (this.operatorType){
            case "EQUALS":
                return this.operatingValue.equals(evaluatedValue);

            case "NOT_EQUALS":
                return !this.operatingValue.equals(evaluatedValue);

            case "GREATER_THAN_OR_EQUALS":
                return (double)this.operatingValue >= (double)evaluatedValue;

            case "GREATER_THAN":
                return (double)this.operatingValue > (double)evaluatedValue;

            case "LESS_THAN":
                return (double)this.operatingValue < (double)evaluatedValue;

            case "LESS_THAN_OR_EQUALS":
                return (double)this.operatingValue <= (double)evaluatedValue;

            default:
                return false;
        }
    }
}