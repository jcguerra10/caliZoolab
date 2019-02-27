package model;

	public class kangarooZone{
		//atributos
		
		private double heatSouruce;
		
		private double humidity;
		
		private double temperature;
		
		private double filtration;
		
		private double waterLiters;
		
		//relaciones
		
		private kangarooEnvioriment KEnvo1;
		
		private kangarooEnvioriment KEnvo2;
		
		private kangarooEnvioriment KEnvo3;	
		
		//metodos
		
		public kangarooZone (double heatSouruce, double humidity, double temperature, double filtration, double waterLiters, kangarooEnvioriment KEnvo1, kangarooEnvioriment KEnvo2, kangarooEnvioriment KEnvo3) {
			this.heatSouruce = heatSouruce;
			this.humidity = humidity;
			this.temperature = temperature;
			this.filtration = filtration;
			this.waterLiters = waterLiters;
			this.KEnvo1 = KEnvo1;
			this.KEnvo2 = KEnvo2;
			this.KEnvo3 = KEnvo3;
		}
		
		public double getHeatSouruce () {
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
		
		public double getFlitration () {
			return filtration;
		}
		
		public void setFiltration (double filtration) {
			this.filtration = filtration;
		}
		
		public double getWaterLiters () {
			return waterLiters;
		}
		
		public void setWaterLiters (double waterLiters) {
			this.waterLiters = waterLiters;
		}
		
		public kangarooEnvioriment getKEnvo1 () {
			return KEnvo1;
		}
		
		public void setKEnvo1 (kangarooEnvioriment KEnvo1) {
			this.KEnvo1 = KEnvo1;
		}
		
		public kangarooEnvioriment getKEnvo2 () {
			return KEnvo2;
		}
		
		public void setKEnvo2 (kangarooEnvioriment KEnvo2) {
			this.KEnvo2 = KEnvo2;
		}
		
		public kangarooEnvioriment getKEnvo3 () {
			return KEnvo3;
		}
		
		public void setKEnvo3 (kangarooEnvioriment KEnvo3) {
			this.KEnvo3 = KEnvo3;
		}
	}