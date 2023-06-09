/**
 * generated by Xtext 2.29.0
 */
package org.xtext.gsht.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.util.EmfFormatter;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.xtext.gsht.gSelfOperatingHeuristicText.Model;

@ExtendWith(InjectionExtension.class)
@InjectWith(GSelfOperatingHeuristicTextInjectorProvider.class)
@SuppressWarnings("all")
public class GSelfOperatingHeuristicTextParsingTest {
  @Inject
  private ParseHelper<Model> parseHelper;

  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("DRONE EmergencyDrone");
      _builder.newLine();
      _builder.append("GLOBAL ");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Charge as double = 0.9");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("ErrorCode as String = \"Operational\"");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("DefibrillatorIsDepleted as boolean = false");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("EVENTS ");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("BatteryCharged");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("MissionReceived");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("StandbyFailure");
      _builder.newLine();
      _builder.append("   \t");
      _builder.append("FlyToTarget");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("AbortMission");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("AirborneFailure");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Landing");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("ArrivedFailure");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("TakingOff");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("LandedFailure");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("Returned");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("ReturningFailure");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("DefibrillatorDepleted");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("DefibrillatorNotDepleted");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("INIT STATE Charging");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("TRANSITIONS ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ON BatteryCharged TO Standby IF Charge >= 0.7");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("STATE Standby");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("PROPS");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ReceivedMission as boolean = false");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Error as boolean = false");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("TRANSITIONS");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ON MissionReceived TO Airborne IF ReceivedMission ==  TRUE");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ON StandbyFailure TO Failed IF Error == TRUE SET ErrorCode = \'Standby Failure\'");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("STATE Airborne");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("PROPS");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ArrivedAtCoordinates as boolean = false");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Abort as boolean = false");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Error as boolean = false");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("TRANSITIONS");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ON FlyToTarget TO Arrived IF ArrivedAtCoordinates == TRUE");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ON AbortMission TO Returning IF Abort == TRUE");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ON AirborneFailure TO Failed IF Error == TRUE SET ErrorCode = \'Airborne Failure\'");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("STATE Arrived");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("PROPS");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("FoundLandingPlace as boolean = false");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Abort as boolean = false");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Error as boolean = false");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("TRANSITIONS");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ON Landing TO Landed IF FoundLandingPlace == TRUE");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ON AbortMission TO Returning IF Abort == TRUE");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ON ArrivedFailure TO Failed IF Error == TRUE SET ErrorCode = \'Arrived Failure\'");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("STATE Landed");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("PROPS");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Recall as boolean = true");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Error as boolean = false");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("TRANSITIONS");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ON TakingOff TO Returning IF Recall == TRUE");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ON LandedFailure TO Failed IF Error == True SET ErrorCode = \'Landed Failure\'");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("STATE Returning");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("PROPS");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ArrivedAtBase as boolean = false");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Error as boolean = false");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("TRANSITIONS");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ON Returned TO Returned IF ArrivedAtBase == TRUE");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ON ReturningFailure TO Failed IF Error == True SET ErrorCode = \'Returning Failure\'");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("STATE Returned");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("TRANSITIONS");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ON DefibrillatorDepleted TO Maintenance IF DefibrillatorIsDepleted == TRUE");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("ON DefibrillatorNotDepleted TO Charging IF DefibrillatorIsDepleted == FALSE");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      InputOutput.<String>println(EmfFormatter.objToStr(result));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
