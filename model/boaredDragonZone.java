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
		
		public double calcWaterLiter (){
			waterLiter = ((Bdragon1.calcIMC() * 0.75) + (Bdragon2.calcIMC() * 0.75));
			
			return waterLiter;	
		}
		
		public String calcFood () {
			
			String warningAdvice = "";


			if (Bdragon1.getFood() + Bdragon2.getFood() < kilosMin){
				warningAdvice = "hay menos de " + kilosMin + " kilos, se necesita mas comida";
			}
			else{
				warningAdvice = "hay mas de " + kilosMin + " kilos de alimento";

			}
			return warningAdvice;
		}
		public String SEvioriment() {
		String msg = "";
		
		if(Bdragon2 != null)
		{
		msg += "El primer dragon barbado de este ambiente es:\n \n"+Bdragon1.sDragon()+"\n";
		msg += "-------------------------------------------------------------------- \n";
		}
		if(Bdragon2 != null)
		{
		msg += "El segundo dragon barbado de este ambiente es:\n \n"+Bdragon2.sDragon()+"\n";
		msg += "-------------------------------------------------------------------- \n";
		}
		
		
		msg += "Este ambiente cuenta con "+calcFood()+" kg de comida \n";
		msg += "Este ambiente cuenta con "+calcWaterLiter()+" litros de agua \n";
		
		return msg;
	}
}