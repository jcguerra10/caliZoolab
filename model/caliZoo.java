package model;

	public class caliZoo{
		//atributos
		
		private int zone;
		
		//relaciones
		
		private kangarooZone zone1;
		
		private	boaredDragonZone zone2;
		
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
		
		public kangarooZone getZone1 () {
			return zone1;
		}
		
		public void setZone1 (kangarooZone zone1) {
			this.zone1 = zone1;
		}
		
		public boaredDragonZone getZone2 () {
			return zone2;
		}
		
		public void setZone2 (boaredDragonZone zone2) {
			this.zone2 = zone2;
		}
		
		//metodos
		
		public String totalAFood () {
			String CFood = "";
			
			CFood = "la cantidad de comida es:" + zone1.calcTotFood();
		}
	}
	