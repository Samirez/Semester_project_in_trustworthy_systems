/* Autogenerated Code */
package gsht;

import org.State;
import org.Transition;
import java.util.ArrayList;
import java.util.HashMap;


public class EmergencyDrone {
	
	private State currentState;
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
	
	private HashMap<String, State> states = new HashMap<>() {
		{
			put("Charging", new State() {
				{
					setName("Charging");
					addTransition("BatteryCharged", new Transition() {
						{
							setEvent("BatteryCharged");
							setToState("Standby");
							setHasCondition(true);
							setEvaluatedValueName("Charge", true);
							setOperatorType(">=");
							setOperatingValue(0.7);
						}
					});
				}
			});
			put("Standby", new State() {
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
							createAssignment("ErrorCode", "Standby Failure", true);
						}
					});
				}
			});
			put("Airborne", new State() {
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
							createAssignment("ErrorCode", "Airborne Failure", true);
						}
					});
				}
			});
			put("Arrived", new State() {
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
							createAssignment("ErrorCode", "Arrived Failure", true);
						}
					});
				}
			});
			put("Landed", new State() {
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
							createAssignment("ErrorCode", "Landed Failure", true);
						}
					});
				}
			});
			put("Returning", new State() {
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
							createAssignment("ErrorCode", "Returning Failure", true);
						}
					});
				}
			});
			put("Returned", new State() {
				{
					setName("Returned");
					addTransition("DefibrillatorDepleted", new Transition() {
						{
							setEvent("DefibrillatorDepleted");
							setToState("Maintenance");
							setHasCondition(true);
							setEvaluatedValueName("DefibrillatorIsDepleted", true);
							setOperatorType("==");
							setOperatingValue(true);
						}
					});
					addTransition("DefibrillatorNotDepleted", new Transition() {
						{
							setEvent("DefibrillatorNotDepleted");
							setToState("Charging");
							setHasCondition(true);
							setEvaluatedValueName("DefibrillatorIsDepleted", true);
							setOperatorType("==");
							setOperatingValue(false);
						}
					});
				}
			});
			put("Maintenance", new State() {
				{
					setName("Maintenance");
				}
			});
			put("Failed", new State() {
				{
					setName("Failed");
				}
			});
		}
	};
	
	public EmergencyDrone() {
		currentState = states.get("Charging");
	}
	
	public HashMap<String, Object> getGlobalProps() {
		return globalProps;
	}
	
	public void setGlobalProps(HashMap<String, Object> globalProps) {
		this.globalProps = globalProps;
	}
	
	public void setGlobalProp(String key, Object value) {
		this.globalProps.put(key, value);
	}
	
	public void processEvent(String event) {
		printEvent(event);
		currentState.setGlobalProps(new HashMap<>(globalProps));
		String nextStateName = currentState.onEvent(event);
		if (currentState.getGlobalPropsSize() > 0) {
			this.globalProps = new HashMap<>(currentState.returnGlobalProps());
		}
		currentState = states.get(nextStateName);
		printGlobalProps();
		printCurrentState(currentState);
	};

	private void printEvent(String event) {
		System.out.println();
		System.out.println("==================================");
		System.out.println(String.format("Processing event: '%s'...", event));
		System.out.println("==================================");
		System.out.println();
	}

	private void printGlobalProps() {
		System.out.println("Global props:");
		globalProps.entrySet().forEach(entry -> {
			System.out.println(String.format("%s\t%s", entry.getKey(), entry.getValue().toString()));
		});
		System.out.println();
	}

	private void printCurrentState(State state) {
		System.out.println(String.format("Current state: %s", state.getName()));
		state.printState();
	}
	public State getCurrentState() {
	    return currentState;
	}
}
