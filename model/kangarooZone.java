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
		
		//metodos 
		
		public double calcTotFood (){
			double TFood = 0.0;
			
			TFood = KEnvo1.calcTFood()+KEnvo2.calcTFood()+KEnvo3.calcTFood();
			
			return TFood;
		}
		
		
		public String addKangaroo (kangaroo nuevokgo, int opEnvioriment){
			String msj = "";
			
			if (opEnvioriment == 1) {
				msj += KEnvo1.addKgo(nuevokgo);
			}else if (opEnvioriment == 2) {
				msj += KEnvo2.addKgo(nuevokgo);
			}else if (opEnvioriment == 3) {
				msj += KEnvo3.addKgo(nuevokgo);
			}
			return msj;
		}
		
	public String showZone(){
		String msg = "";
		
		if (KEnvo1 != null){
			msg += "=================================================================== \n";
			msg += "=================================================================== \n";
			msg += "El primer ambiente tiene las siguientes caracteristicas: \n";
			msg += KEnvo1.SEvioriment()+"\n";
			msg += "=================================================================== \n";
			msg += "=================================================================== \n";
		}
		if (KEnvo2 != null){
			msg += "=================================================================== \n";
			msg += "=================================================================== \n";
			msg += "El segundo ambiente tiene las siguientes caracteristicas: \n";
			msg += KEnvo2.SEvioriment()+"\n";
			msg += "=================================================================== \n";
			msg += "=================================================================== \n";
		}
		if (KEnvo3 != null){
			msg += "=================================================================== \n";
			msg += "=================================================================== \n";
			msg += "El tercer ambiente tiene las siguientes caracteristicas: \n";
			msg += KEnvo3.SEvioriment()+"\n";
			msg += "=================================================================== \n";
			msg += "=================================================================== \n";
		}
		
		
		return msg;
	}
		
		public double totalZone (){
			double total = 0.0;
				if (KEnvo1.calcSize() != 0.0)
					total += KEnvo1.calcSize(); 
				if (KEnvo2.calcSize() != 0.0)
					total += KEnvo2.calcSize();
				if (KEnvo3.calcSize() != 0.0)
					total += KEnvo3.calcSize();
			return total;
		}
		
		public String removeKgo (int kang, int opEnvioriment){
			String msj = "";
			
			if (opEnvioriment == 1){
				msj += KEnvo1.removeKgo(kang);
			}else if (opEnvioriment == 2){
				msj += KEnvo2.removeKgo(kang);
			}else if (opEnvioriment == 3){
				msj += KEnvo3.removeKgo(kang);
			}else{
				msj += "opcion no valida";
			}
			return msj;
	
		}
	
		
	public kangarooEnvioriment getEnvironment(int opEnvironment1){
		kangarooEnvioriment x = null;
		
		if(opEnvironment1 == 1)
		{
			x = KEnvo1;
		}
		if(opEnvironment1 == 2)
		{
			x = KEnvo2;
		}
		if(opEnvironment1 == 3)
		{
			x = KEnvo3;
		}
		
		return x;
	}
	
	public String changeKangaroo(int kang, int opEnvironment1, int opEnvironment2){
		String msg = "";

		kangarooEnvioriment eliminateKofEnvironment = getEnvironment(opEnvironment1);
		kangarooEnvioriment addKtoEnvironment = getEnvironment(opEnvironment2);
		kangaroo x = eliminateKofEnvironment.selectedKangaroo(kang);
		msg += addKtoEnvironment.addChangeKgo(x);
		if(addKtoEnvironment.addChangeKgo(x).equals("Ambiente lleno. No se cambio el canguro") || addKtoEnvironment.addChangeKgo(x).equals("Ya hay un macho en el ambiente. No se cambio el canguro")){
			msg += "";
		}else{
			msg += eliminateKofEnvironment.removeChangeKangaroo(kang);
		}
		return msg;
	}
	
}