package statemachines;

public class Transition {

	private String event;
    private String toState;
    private String operatorType;
    private String evaluatedValueName;
    private String globalPropName;
    private boolean hasCondition = false;
    private boolean hasSetAction = false;
    private Object operatingValue;
    private Object setValue;

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
    
    public void setGlobalPropName(String globalPropName) {
    	this.globalPropName = globalPropName;
    }
    
    public String getGlobalPropName() {
    	return this.globalPropName;
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
                return (double)this.operatingValue >= (double)evaluatedValue;

            case ">":
                return (double)this.operatingValue > (double)evaluatedValue;

            case "<":
                return (double)this.operatingValue < (double)evaluatedValue;

            case "<=":
                return (double)this.operatingValue <= (double)evaluatedValue;

            default:
                return false;
        }
    }
}