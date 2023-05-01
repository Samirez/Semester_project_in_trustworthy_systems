package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

import gsht.EmergencyDrone;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmergencyDrone m = new EmergencyDrone();
		m.setGlobalProp("Charge", 0.1);
		m.processEvent("BatteryCharged");
		assertEquals("Charging",m.getCurrentState().getName());
		
	}

}
