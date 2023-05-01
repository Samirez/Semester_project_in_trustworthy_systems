package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

import gsht.EmergencyDrone;

import org.junit.jupiter.api.Test;

class Testing_loop {

	public void reachStateStandby() {
		EmergencyDrone m = new EmergencyDrone();
		m.processEvent("BatteryCharged");
		assertEquals("Standby",m.getCurrentState().getName());
	}
	@Test
	public void reachStateAirborne() {
		EmergencyDrone m = new EmergencyDrone();
		m.processEvent("BatteryCharged");
		assertEquals("Standby",m.getCurrentState().getName());
		
		m.processEvent("MissionRecieved");
		assertEquals("Airborne",m.getCurrentState().getName());
	}
	@Test
	public void reachStateArrived() {
		EmergencyDrone m = new EmergencyDrone();
		m.processEvent("BatteryCharged");
		assertEquals("Standby",m.getCurrentState().getName());
		
		m.processEvent("MissionRecieved");
		assertEquals("Airborne",m.getCurrentState().getName());
		
		m.processEvent("FlyToTarget");
		assertEquals("Arrived",m.getCurrentState().getName());
	}
	@Test
	public void reachStateLanded() {
		EmergencyDrone m = new EmergencyDrone();
		m.processEvent("BatteryCharged");
		assertEquals("Standby",m.getCurrentState().getName());
		
		m.processEvent("MissionRecieved");
		assertEquals("Airborne",m.getCurrentState().getName());
		
		m.processEvent("FlyToTarget");
		assertEquals("Arrived",m.getCurrentState().getName());
		
		m.processEvent("Landing");
		assertEquals("Landed",m.getCurrentState().getName());
	}
	@Test
	public void reachStateReturning() {
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
	}
	@Test
	public void reachStateReturned() {
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
		
		m.processEvent("Returned");
		assertEquals("Returned",m.getCurrentState().getName());
	}
	
	@Test
	public void reachStateMaintenance() {
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
		
		m.processEvent("Returned");
		assertEquals("Returned",m.getCurrentState().getName());
		
		m.setGlobalProp("DefibrillatorIsDepleted", true);
		
		m.processEvent("DefibrillatorDepleted");
		assertEquals("Maintenance",m.getCurrentState().getName());
	}
	
	@Test
	public void reachStateCharging() {
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
		
		m.processEvent("Returned");
		assertEquals("Returned",m.getCurrentState().getName());
		
		m.processEvent("DefibrillatorNotDepleted");
		assertEquals("Charging",m.getCurrentState().getName());
	}
	
}
