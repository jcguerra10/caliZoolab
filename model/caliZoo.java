package model;

	public class caliZoo{
		//atributos
		
		private int zone;
		
		//relaciones
		
		private caliZoo zone1;
		
		private	caliZoo zone2;
		
		//metodos
		
		public caliZoo (int zone, caliZoo zone1, caliZoo zone2) {
			this.zone = zone;
		}
		
		public int getZone () {
			return zone;
		}
		
		public void setZone (int zone) {
			this.zone = zone;
		}
		
		public caliZoo getZone1 () {
			return zone1;
		}
		
		public void setZone1 (caliZoo zone1) {
			this.zone1 = zone1;
		}
		
		public caliZoo getZone2 () {
			return zone2;
		}
		
		public void setZone2 (caliZoo zone2) {
			this.zone2 = zone2;
		}
	}
	