	public class EmergencyDrone {
		
		private State currentState;
		
		private String BatteryCharged = "BatteryCharged";
		private String MissionReceived = "MissionReceived";
		private String StandbyFailure = "StandbyFailure";
		private String FlyToTarget = "FlyToTarget";
		private String AbortMission = "AbortMission";
		private String AirborneFailure = "AirborneFailure";
		private String Landing = "Landing";
		private String ArrivedFailure = "ArrivedFailure";
		private String TakingOff = "TakingOff";
		private String LandedFailure = "LandedFailure";
		private String HasReturned = "HasReturned";
		private String ReturningFailure = "ReturningFailure";
		private String DefibrillatorDepleted = "DefibrillatorDepleted";
		private String DefibrillatorNotDepleted = "DefibrillatorNotDepleted";
		private String DefibrillatorReady = "DefibrillatorReady";
		private String DefibrillatorUsed = "DefibrillatorUsed";
		
		public State Charging() {
		 	
				
			public void onEvent(String event) {
				if (BatteryCharged.Equals(event)) {
					this.currentState = Standby
				}
			}	
		}
		public State Standby() {
		 	
			private boolean ReceivedMission;
			private boolean Error;
				
			public boolean getReceivedMission() {
				return this.ReceivedMission;
			}
				
			public void setReceivedMission(boolean name){
				this.ReceivedMission = name;
			}
			public boolean getError() {
				return this.Error;
			}
				
			public void setError(boolean name){
				this.Error = name;
			}
			public void onEvent(String event) {
				if (MissionReceived.Equals(event)) {
					this.currentState = Airborne
				}
				if (StandbyFailure.Equals(event)) {
					this.currentState = Failed
				}
			}	
		}
		public State Airborne() {
		 	
			private boolean ArrivedAtCoordinates;
			private boolean Abort;
			private boolean Error;
				
			public boolean getArrivedAtCoordinates() {
				return this.ArrivedAtCoordinates;
			}
				
			public void setArrivedAtCoordinates(boolean name){
				this.ArrivedAtCoordinates = name;
			}
			public boolean getAbort() {
				return this.Abort;
			}
				
			public void setAbort(boolean name){
				this.Abort = name;
			}
			public boolean getError() {
				return this.Error;
			}
				
			public void setError(boolean name){
				this.Error = name;
			}
			public void onEvent(String event) {
				if (FlyToTarget.Equals(event)) {
					this.currentState = Arrived
				}
				if (AbortMission.Equals(event)) {
					this.currentState = Returning
				}
				if (AirborneFailure.Equals(event)) {
					this.currentState = Failed
				}
			}	
		}
		public State Arrived() {
		 	
			private boolean FoundLandingPlace;
			private boolean Abort;
			private boolean Error;
				
			public boolean getFoundLandingPlace() {
				return this.FoundLandingPlace;
			}
				
			public void setFoundLandingPlace(boolean name){
				this.FoundLandingPlace = name;
			}
			public boolean getAbort() {
				return this.Abort;
			}
				
			public void setAbort(boolean name){
				this.Abort = name;
			}
			public boolean getError() {
				return this.Error;
			}
				
			public void setError(boolean name){
				this.Error = name;
			}
			public void onEvent(String event) {
				if (Landing.Equals(event)) {
					this.currentState = Landed
				}
				if (AbortMission.Equals(event)) {
					this.currentState = Returning
				}
				if (ArrivedFailure.Equals(event)) {
					this.currentState = Failed
				}
			}	
		}
		public State Landed() {
		 	
			private boolean Recall;
			private boolean Error;
				
			public boolean getRecall() {
				return this.Recall;
			}
				
			public void setRecall(boolean name){
				this.Recall = name;
			}
			public boolean getError() {
				return this.Error;
			}
				
			public void setError(boolean name){
				this.Error = name;
			}
			public void onEvent(String event) {
				if (TakingOff.Equals(event)) {
					this.currentState = Returning
				}
				if (LandedFailure.Equals(event)) {
					this.currentState = Failed
				}
			}	
		}
		public State Returning() {
		 	
			private boolean ArrivedAtBase;
			private boolean Error;
				
			public boolean getArrivedAtBase() {
				return this.ArrivedAtBase;
			}
				
			public void setArrivedAtBase(boolean name){
				this.ArrivedAtBase = name;
			}
			public boolean getError() {
				return this.Error;
			}
				
			public void setError(boolean name){
				this.Error = name;
			}
			public void onEvent(String event) {
				if (HasReturned.Equals(event)) {
					this.currentState = Returned
				}
				if (ReturningFailure.Equals(event)) {
					this.currentState = Failed
				}
			}	
		}
		public State Returned() {
		 	
				
			public void onEvent(String event) {
				if (DefibrillatorDepleted.Equals(event)) {
					this.currentState = Maintenance
				}
				if (DefibrillatorNotDepleted.Equals(event)) {
					this.currentState = Charging
				}
			}	
		}
		public State Maintenance() {
		 	
				
			public void onEvent(String event) {
			}	
		}
		public State Failed() {
		 	
				
			public void onEvent(String event) {
			}	
		}
		public State Defibrillation() {
		 	
			private boolean DefibrillatorIsUsed;
				
			public boolean getDefibrillatorIsUsed() {
				return this.DefibrillatorIsUsed;
			}
				
			public void setDefibrillatorIsUsed(boolean name){
				this.DefibrillatorIsUsed = name;
			}
			public void onEvent(String event) {
				if (DefibrillatorUsed.Equals(event)) {
					this.currentState = Landed
				}
			}	
		}
		
}
