package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;


import gsht.EmergencyDrone;

import org.junit.jupiter.api.Test;

class Testing_Abort {
	@Test
	public void abortMissionAirborne() {
		EmergencyDrone m = new EmergencyDrone();
		m.processEvent("BatteryCharged");
		assertEquals("Standby",m.getCurrentState().getName());
		
		m.processEvent("MissionRecieved");
		assertEquals("Airborne",m.getCurrentState().getName());
		
		
		m.getCurrentState().addProp("Abort", true);
		m.processEvent("AbortMission");
		assertEquals("Returning",m.getCurrentState().getName());
	}
	
	@Test
	public void abortMissionArrived() {
		EmergencyDrone m = new EmergencyDrone();
		m.processEvent("BatteryCharged");
		assertEquals("Standby",m.getCurrentState().getName());
		
		m.processEvent("MissionRecieved");
		assertEquals("Airborne",m.getCurrentState().getName());
		
		m.processEvent("FlyToTarget");
		assertEquals("Arrived",m.getCurrentState().getName());
		
		
		m.getCurrentState().addProp("Abort", true);
		m.processEvent("AbortMission");
		assertEquals("Returning",m.getCurrentState().getName());
	}

}
