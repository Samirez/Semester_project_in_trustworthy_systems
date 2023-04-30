/*
 * generated by Xtext 2.29.0
 */
package org.xtext.gsht.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
//import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.xtext.gsht.gSelfOperatingHeuristicText.Model
import org.eclipse.xtext.util.EmfFormatter

@ExtendWith(InjectionExtension)
@InjectWith(GSelfOperatingHeuristicTextInjectorProvider)
class GSelfOperatingHeuristicTextParsingTest {
	@Inject
	ParseHelper<Model> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			DRONE EmergencyDrone
			GLOBAL 
			{
				Charge as double
				ErrorCode as String
				DefibrillatorIsDepleted as boolean
			}
			
			EVENT BatteryCharged
			
			EVENT MissionReceived
			EVENT StandbyFailure
			    
			EVENT FlyToTarget
			EVENT AbortMission
			EVENT AirborneFailure
			    
			EVENT Landing
			EVENT ArrivedFailure
			    
			EVENT TakingOff
			EVENT LandedFailure
			    
			EVENT Returned
			EVENT ReturningFailure
			    
			EVENT DefibrillatorDepleted
			EVENT DefibrillatorNotDepleted
			
			STATE Charging
				TRANSITIONS 
				{
					ON BatteryCharged TO Standby IF Charge >= 0.7
				}
			
			STATE Standby
				PROPS
				{
					ReceivedMission as boolean
					Error as boolean
				}
				TRANSITIONS
				{
					ON MissionReceived TO Airborne IF ReceivedMission ==  TRUE
					ON StandbyFailure TO Failed IF Error == TRUE SET ErrorCode = 'Standby Failure'
				}
				
			STATE Airborne
				PROPS
				{
					ArrivedAtCoordinates as boolean
					Abort as boolean
					Error as boolean
				}
				TRANSITIONS
				{
					ON FlyToTarget TO Arrived IF ArrivedAtCoordinates == TRUE
					ON AbortMission TO Returning IF Abort == TRUE
					ON AirborneFailure TO Failed IF Error == TRUE SET ErrorCode = 'Airborne Failure'
				}
			
			STATE Arrived
				PROPS
				{
					FoundLandingPlace as boolean
					Abort as boolean
					Error as boolean
					}
				TRANSITIONS
				{
					ON Landing TO Landed IF FoundLandingPlace == TRUE
					ON AbortMission TO Returning IF Abort == TRUE
					ON ArrivedFailure TO Failed IF Error == TRUE SET ErrorCode = 'Arrived Failure'
				}
			
			STATE Landed
				PROPS
				{
					Recall as boolean
					Error as boolean
				}
				TRANSITIONS
				{
					ON TakingOff TO Returning IF Recall == TRUE
					ON LandedFailure TO Failed IF Error == True SET ErrorCode = 'Landed Failure'
				}
			
			STATE Returning
				PROPS
				{
					ArrivedAtBase as boolean
					Error as boolean
				}
				TRANSITIONS
				{
					ON Returned TO Returned IF ArrivedAtBase == TRUE
					ON ReturningFailure TO Failed IF Error == True SET ErrorCode = 'Returning Failure'
				}
			
			STATE Returned
				TRANSITIONS
				{
					ON DefibrillatorDepleted TO Maintenance IF DefibrillatorIsDepleted == TRUE
					ON DefibrillatorNotDepleted TO Charging IF DefibrillatorIsDepleted == FALSE
				}
			
			STATE Maintenance
			
			STATE Failed
			
			EVENT DefibrillatorReady
										
			EVENT DefibrillatorUsed
			
			ALTER STATE Landed
				PROPS
				{
					DefibrillatorIsReady as boolean
				}
				TRANSITIONS
				{
					ON DefibrillatorReady TO Defibrillation IF DefibrillatorIsReady == TRUE
				}
			
			STATE Defibrillation
				PROPS
				{
					DefibrillatorIsUsed as boolean
				}
				TRANSITIONS
				{
					ON DefibrillatorUsed TO Landed IF DefibrillatorIsUsed == TRUE SET DefibrillatorIsDepleted = TRUE
				}
		''')
		println(EmfFormatter.objToStr(result))
		//Assertions.assertNotNull(result)
		//val errors = result.eResource.errors
		//Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
}