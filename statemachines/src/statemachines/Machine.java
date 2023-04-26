package statemachines;

import java.util.ArrayList;
import java.util.HashMap;

public class Machine {
	
	private GState currentState;
	private HashMap<String, Object> globalProps = new HashMap<>() {
		{
		put("Charge", 0.9);
		put("ErrorCode", "Operational");
		put("DefibrillatorIsDepleted", false);
		}
	};
	
	private ArrayList<String> events = new ArrayList<>() {
		{
			add("BatteryCharged");
			add("MissionRecieved");
			add("StandbyFailure");
			add("FlyToTarget");
			add("AbortMission");
			add("AirborneFailure");
			add("Landing");
			add("ArrivedFailure");
			add("TakingOff");
			add("LandedFailure");
			add("Returned");
			add("ReturningFailure");
			add("DefibrillatorDepleted");
			add("DefibrillatorNotDepleted");
			add("DefibrillatorReady");
			add("DefibrillatorUsed");
		}
	};
	
	private HashMap<String, GState> states = new HashMap<>() {
		{
			put("Charging", new GState() {
				{
					setName("Charging");
					addTransition("BatteryCharged", new Transition() {
						{
							setEvent("BatteryCharged");
							setToState("Standby");
							setHasCondition(true);
							setEvaluatedValueName("Charge");
							setOperatorType(">=");
							setOperatingValue(0.7);
						}
					});
				}
			});			
			put("Standby", new GState() {
				{
					setName("Standby");
					addProp("ReceivedMission", true);
					addProp("Error", false);
					addTransition("MissionRecieved", new Transition() {
						{
							setEvent("MissionRecieved");
							setToState("Airborne");
							setHasCondition(true);
							setEvaluatedValueName("ReceivedMission");
							setOperatorType("==");
							setOperatingValue(true);
						}
					});
					addTransition("StandbyFailure", new Transition() {
						{
							setEvent("StandbyFailure");
							setToState("Failed");
							setHasCondition(true);
							setEvaluatedValueName("Error");
							setOperatorType("==");
							setOperatingValue(true);
							setHasSetAction(true);
							setGlobalPropName("org.xtext.gsht.gSelfOperatingHeuristicText.impl.VariableReferenceImpl@42f39493");
							setSetValue("'Standby Failure'");
						}
					});
				}
			});
			put("Airborne", new GState() {
				{
					setName("Airborne");
					addProp("ArrivedAtCoordinates", true);
					addProp("Abort", false);
					addProp("Error", false);
					addTransition("FlyToTarget", new Transition() {
						{
							setEvent("FlyToTarget");
							setToState("Arrived");
							setHasCondition(true);
							setEvaluatedValueName("ArrivedAtCoordinates");
							setOperatorType("==");
							setOperatingValue(true);
						}
					});
					addTransition("AbortMission", new Transition() {
						{
							setEvent("AbortMission");
							setToState("Returning");
							setHasCondition(true);
							setEvaluatedValueName("Abort");
							setOperatorType("==");
							setOperatingValue(true);
						}
					});
					addTransition("AirborneFailure", new Transition() {
						{
							setEvent("AirborneFailure");
							setToState("Failed");
							setHasCondition(true);
							setEvaluatedValueName("Error");
							setOperatorType("==");
							setOperatingValue(true);
							setHasSetAction(true);
							setGlobalPropName("org.xtext.gsht.gSelfOperatingHeuristicText.impl.VariableReferenceImpl@fc9fec");
							setSetValue("'Airborne Failure'");
						}
					});
				}
			});
			put("Arrived", new GState() {
				{
					setName("Arrived");
					addProp("FoundLandingPlace", true);
					addProp("Abort", false);
					addProp("Error", false);
					addTransition("Landing", new Transition() {
						{
							setEvent("Landing");
							setToState("Landed");
							setHasCondition(true);
							setEvaluatedValueName("FoundLandingPlace");
							setOperatorType("==");
							setOperatingValue(true);
						}
					});
					addTransition("AbortMission", new Transition() {
						{
							setEvent("AbortMission");
							setToState("Returning");
							setHasCondition(true);
							setEvaluatedValueName("Abort");
							setOperatorType("==");
							setOperatingValue(true);
						}
					});
					addTransition("ArrivedFailure", new Transition() {
						{
							setEvent("ArrivedFailure");
							setToState("Failed");
							setHasCondition(true);
							setEvaluatedValueName("Error");
							setOperatorType("==");
							setOperatingValue(true);
							setHasSetAction(true);
							setGlobalPropName("org.xtext.gsht.gSelfOperatingHeuristicText.impl.VariableReferenceImpl@137e906a");
							setSetValue("'Arrived Failure'");
						}
					});
				}
			});
			put("Landed", new GState() {
				{
					setName("Landed");
					addProp("Recall", true);
					addProp("Error", false);
					addTransition("TakingOff", new Transition() {
						{
							setEvent("TakingOff");
							setToState("Returning");
							setHasCondition(true);
							setEvaluatedValueName("Recall");
							setOperatorType("==");
							setOperatingValue(true);
						}
					});
					addTransition("LandedFailure", new Transition() {
						{
							setEvent("LandedFailure");
							setToState("Failed");
							setHasCondition(true);
							setEvaluatedValueName("Error");
							setOperatorType("==");
							setOperatingValue(true);
							setHasSetAction(true);
							setGlobalPropName("org.xtext.gsht.gSelfOperatingHeuristicText.impl.VariableReferenceImpl@468be55f");
							setSetValue("'Landed Failure'");
						}
					});
				}
			});
			put("Returning", new GState() {
				{
					setName("Returning");
					addProp("ArrivedAtBase", true);
					addProp("Error", false);
					addTransition("Returned", new Transition() {
						{
							setEvent("Returned");
							setToState("Returned");
							setHasCondition(true);
							setEvaluatedValueName("ArrivedAtBase");
							setOperatorType("==");
							setOperatingValue(true);
						}
					});
					addTransition("ReturningFailure", new Transition() {
						{
							setEvent("ReturningFailure");
							setToState("Failed");
							setHasCondition(true);
							setEvaluatedValueName("Error");
							setOperatorType("==");
							setOperatingValue(true);
							setHasSetAction(true);
							setGlobalPropName("org.xtext.gsht.gSelfOperatingHeuristicText.impl.VariableReferenceImpl@7ae45f69");
							setSetValue("'Returning Failure'");
						}
					});
				}
			});
			put("Returned", new GState() {
				{
					setName("Returned");
					addTransition("DefibrillatorDepleted", new Transition() {
						{
							setEvent("DefibrillatorDepleted");
							setToState("Maintenance");
							setHasCondition(true);
							setEvaluatedValueName("DefibrillatorIsDepleted");
							setOperatorType("==");
							setOperatingValue(true);
						}
					});
					addTransition("DefibrillatorNotDepleted", new Transition() {
						{
							setEvent("DefibrillatorNotDepleted");
							setToState("Charging");
							setHasCondition(true);
							setEvaluatedValueName("DefibrillatorIsDepleted");
							setOperatorType("==");
							setOperatingValue(false);
						}
					});
				}
			});
			put("Maintenance", new GState() {
				{
					setName("Maintenance");
				}
			});
			put("Failed", new GState() {
				{
					setName("Failed");
				}
			});
			put("Defibrillation", new GState() {
				{
					setName("Defibrillation");
					addProp("DefibrillatorIsUsed", false);
				}
			});
			put("Returned", new GState() {
				{
					setName("Returned");
					addTransition("DefibrillatorDepleted", new Transition() {
						{
							setEvent("DefibrillatorDepleted");
							setToState("Maintenance");
							setHasCondition(true);
							setEvaluatedValueName("DefibrillatorIsDepleted");
							setOperatorType("==");
							setOperatingValue(true);
						}
					});
					addTransition("DefibrillatorNotDepleted", new Transition() {
						{
							setEvent("DefibrillatorNotDepleted");
							setToState("Charging");
							setHasCondition(true);
							setEvaluatedValueName("DefibrillatorIsDepleted");
							setOperatorType("==");
							setOperatingValue(false);
						}
					});
				}
			});
		}
	};
	
	public Machine() {
		this.currentState = states.get("Charging");
	}
	

    public void processEvent(String event) {
    	printEvent(event);
        String nextStateName = currentState.onEvent(event);
        if(nextStateName.equals(currentState.getName())) return;
        if (currentState.propsReturnerSize() > 0) {
            for (String key : currentState.getPropReturner().keySet()) {
                globalProps.put(key, currentState.getPropReturnerValue(key));
            }
            currentState.clearPropReturner();
        }
        currentState = states.get(nextStateName);
        printGlobalProps(currentState);
        printCurrentState(currentState);
    };
    
    private void printEvent(String event) {
    	System.out.println(String.format("Processing event: '%s'...", event));
    	System.out.println("==================================");
    	System.out.println();
    }
    
    private void printGlobalProps(GState state) {
    	System.out.println("Global props:");
    	globalProps.entrySet().forEach(entry -> {
    		System.out.println(String.format("%s\t%s", entry.getKey(), entry.getValue().toString()));
    	});
    	System.out.println();
    }
    
    private void printCurrentState(GState state) {
    	System.out.println(String.format("Current state: %s", state.getName()));
    	state.printState();
    }

}
