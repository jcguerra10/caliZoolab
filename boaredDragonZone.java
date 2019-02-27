package model;

	public class boaredDragonZone{
		// constants	

		public static final double kilosMin = 8;
		
		//attributes
		
		private double heatSouruce;
		
		private double humidity;
		
		private double temperature;
		
		private double filtration;
		
		private double waterLiter;
		
		//relaxations
		
		private boaredDragon Bdragon1;
		
		private boaredDragon Bdragon2;
		
		//constructor
		
		public boaredDragonZone (double heatSouruce, double humidity, double temperature, double filtration, double waterLiter, boaredDragon Bdragon1, boaredDragon Bdragon2) {
			this.heatSouruce = heatSouruce;
			this.humidity = humidity;
			this.temperature = temperature;
			this.filtration = filtration;
			this.waterLiter = waterLiter;
			this.Bdragon1 = Bdragon1;
			this.Bdragon2 = Bdragon2;
		}
		
		public double getHeatSouruce() {
			return heatSouruce;
		}
		
		public void setHeatSouruce (double heatSouruce) {
			this.heatSouruce = heatSouruce;
		}
		
		public double getHumidity () {
			return humidity;
		}
		
		public void setHumidity (double humidity) {
			this.humidity = humidity;
		}
		
		public double getTemperature () {
			return temperature;
		}
		
		public void setTemperature (double temperature) {
			this.temperature = temperature;
		}
		
		public double getFiltration () {
			return filtration;
		}
		
		public void setFiltration (double filtration) {
			this.filtration = filtration;
		}
		
		public double getWaterLiter () {
			return waterLiter;
		}
		
		public void setWaterLiter (double waterLiter) {
			this.waterLiter = waterLiter;
		}
		
		public boaredDragon getBdragon1 () {
			return Bdragon1;
		}
		
		public void setBdragon1 (boaredDragon Bdragon1) {
			this.Bdragon1 = Bdragon1;
		}
		
		public boaredDragon getBdragon2 () {
			return Bdragon2;
		}
		
		public void setBdragon2 (boaredDragon Bdragon2) {
			this.Bdragon2 = Bdragon2;
		}
		//methods
		
		public double calcWaterLiter (double waterLiter){
			waterLiter = ((Bdragon1.getIMC() * 0.75) + (Bdragon2.getIMC() * 0.75));
			
			return waterLiter;	
		}
		
		public double calcFood () {
			
			String warningAdvice = "";


			if (calcFood = (Bdragon1.getFood() + Bdragon1.getFood()) < kilosMin){
				String warningAdvice = "hay menos de" kilosMin "kilos, se necesita mas comida";
			}
			else{
				String warningAdvice = "hay mas de" kilos min "kilos de alimento";

			}
		}
	}