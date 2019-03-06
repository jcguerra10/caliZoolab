package model;

public class caliZoo{
		//atributos
		
		private String name;
		
		//relaciones
		
		private kangarooZone zone1;
		
		private	boaredDragonZone zone2;
		
		//metodos
		
		public caliZoo (String name, kangarooZone zone1, boaredDragonZone zone2) {
			this.name = name;
			this.zone1 = zone1;
			this.zone2 = zone2;
		}
		
		public String getName () {
			return name;
		}
		
		public void setName (String name) {
			this.name = name;
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
		
		public String addKgoo(kangaroo nuevokgo, int opEnvironment){
	
			String msg = "";
			if (zone1 != null)
				msg += zone1.addKangaroo(nuevokgo, opEnvironment);
			return msg;
		}
		
		public String showZoo(){
			String msg = "\n";
			
			if (zone1 != null){
				msg += "==========================================================================================================================\n";
				msg += "La zona de los canguros tiene un area de "+zone1.totalZone()+" metros cuadrados y cuenta con los siguientes ambientes: \n";
				msg += zone1.showZone()+"\n";
				msg += "==========================================================================================================================\n";
				msg += "La zona de los dragones barbados cuenta con la zona:\n";
				msg += zone2.SEvioriment()+"\n";
				msg += "==========================================================================================================================\n";
				
			}	
			return msg;
		}
		
		public String shozoo(){
			
			String msg = " ";
			
			msg +=  zone1.showZone();
			
			return msg;
		}
		
		public String removeKgo(int kang, int opEnvironment){
			String msj = "";
			if (zone1 != null){
				msj += zone1.removeKgo(kang, opEnvironment);
			}
			return msj;
		}	
		
		
		public String changeKangaroo(int kang, int opEnvironment1, int opEnvironment2){
			String msg = "";
			
			msg += zone1.changeKangaroo(kang, opEnvironment1, opEnvironment2);
			
			return msg;
		}
}