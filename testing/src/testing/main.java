package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

import gsht.EmergencyDrone;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmergencyDrone m = new EmergencyDrone();
		HashMap<String, Object> globalProps = new HashMap<>() {
			{
			put("Charge", 0.1);
			put("ErrorCode", "Operational");
			put("DefibrillatorIsDepleted", false);
			}
		};
		m.setGlobalProps(globalProps);
		m.processEvent("BatteryCharged");
		assertEquals("Charging",m.getCurrentState().getName());
		
	}

}
