package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import gsht.EmergencyDrone;

class Test_Error {

	@Test
	public void errorStandby() {
		EmergencyDrone m = new EmergencyDrone();
		m.processEvent("BatteryCharged");
		assertEquals("Standby",m.getCurrentState().getName());
		
		m.getCurrentState().addProp("Error", true);
		m.processEvent("StandbyFailure");
		assertEquals("Failed",m.getCurrentState().getName());
		
		assertEquals("Standby Failure",m.getGlobalProps().get("ErrorCode"));
		
	}
	
	@Test
	public void errorAirborne() {
		EmergencyDrone m = new EmergencyDrone();
		m.processEvent("BatteryCharged");
		assertEquals("Standby",m.getCurrentState().getName());
		
		m.processEvent("MissionRecieved");
		assertEquals("Airborne",m.getCurrentState().getName());
		
		m.getCurrentState().addProp("Error", true);
		m.processEvent("AirborneFailure");
		assertEquals("Failed",m.getCurrentState().getName());
		
		assertEquals("Airborne Failure",m.getGlobalProps().get("ErrorCode"));
	}
	
	@Test
	public void errorArrived() {
		EmergencyDrone m = new EmergencyDrone();
		m.processEvent("BatteryCharged");
		assertEquals("Standby",m.getCurrentState().getName());
		
		m.processEvent("MissionRecieved");
		assertEquals("Airborne",m.getCurrentState().getName());
		
		m.processEvent("FlyToTarget");
		assertEquals("Arrived",m.getCurrentState().getName());
		
		m.getCurrentState().addProp("Error", true);
		m.processEvent("ArrivedFailure");
		assertEquals("Failed",m.getCurrentState().getName());
		
		assertEquals("Arrived Failure",m.getGlobalProps().get("ErrorCode"));
	}
	
	@Test
	public void errorLanded() {
		EmergencyDrone m = new EmergencyDrone();
		m.processEvent("BatteryCharged");
		assertEquals("Standby",m.getCurrentState().getName());
		
		m.processEvent("MissionRecieved");
		assertEquals("Airborne",m.getCurrentState().getName());
		
		m.processEvent("FlyToTarget");
		assertEquals("Arrived",m.getCurrentState().getName());
		
		m.processEvent("Landing");
		assertEquals("Landed",m.getCurrentState().getName());
		
		m.getCurrentState().addProp("Error", true);
		m.processEvent("LandedFailure");
		assertEquals("Failed",m.getCurrentState().getName());
		
		assertEquals("Landed Failure",m.getGlobalProps().get("ErrorCode"));
	}
	
	@Test
	public void errorReturning() {
		EmergencyDrone m = new EmergencyDrone();
		m.processEvent("BatteryCharged");
		assertEquals("Standby",m.getCurrentState().getName());
		
		m.processEvent("MissionRecieved");
		assertEquals("Airborne",m.getCurrentState().getName());
		
		m.processEvent("FlyToTarget");
		assertEquals("Arrived",m.getCurrentState().getName());
		
		m.processEvent("Landing");
		assertEquals("Landed",m.getCurrentState().getName());
		
		m.processEvent("TakingOff");
		assertEquals("Returning",m.getCurrentState().getName());
		
		m.getCurrentState().addProp("Error", true);
		m.processEvent("ReturningFailure");
		assertEquals("Failed",m.getCurrentState().getName());
		
		assertEquals("Returning Failure",m.getGlobalProps().get("ErrorCode"));
	}

}
