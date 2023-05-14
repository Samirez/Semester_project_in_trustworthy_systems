package testing;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;
import gsht.EmergencyDrone;

class testOne {
	// Testing the failing of transitions
	
	@Test
	public void failToReachStateStandby() {
		EmergencyDrone m = new EmergencyDrone();
		m.setGlobalProp("Charge", 0.1);
		m.processEvent("BatteryCharged");
		assertEquals("Charging",m.getCurrentState().getName());
	}
	@Test
	public void failToReachStateMaintenance() {
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
		
		m.processEvent("HasReturned");
		assertEquals("Returned",m.getCurrentState().getName());
		
		m.processEvent("DefibrillatorDepleted");
		assertEquals("Returned",m.getCurrentState().getName());
	}

}
