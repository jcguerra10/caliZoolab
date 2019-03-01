package model;

	//constantes
	
	
	//atributos
	
	public class kangaroo {
		
		private String name;
		
		private double weight;
		
		private double height;
		
		private int gender;
		
		private String typeOfBlood;
		
		
	//relaciones
	
	private dated kgbirth;
	
	//metodos
	
	public kangaroo(String name, double weight, double height, int gender, String typeOfBlood, dated Kgbirth){
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.gender = gender;
		this.typeOfBlood = typeOfBlood;
		this.kgbirth = kgbirth;
	}
	
	public String getName () {
		return name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public double getWeight () {
		return weight;
	}
	
	public void setWeight (double weight) {
		this.weight = weight;
	}
	
	public double getHeight () {
		return height;
	}
	
	public void setHeight (double height) {
		this.height = height;
	}
	
	public  int getGender () {
		return gender;
	}
	
	public void setGender (int gender) {
		this.gender = gender;
	}
	
	
	public String getTypeOfBlood () {
		return typeOfBlood;
	}
	
	public void setTypeOfBlood (String typeOfBlood) {
		this.typeOfBlood = typeOfBlood;
	}
	
	public dated getKgbirth () {
		return kgbirth;
	}
	
	public void setKgbirth (dated kgbirth) {
		this.kgbirth = kgbirth;
	}
	

	
	
	//metodos
	
	//borrar atributo para solo mostrar la comida en el main
	
	public double calcFood () {
		double food = 0.0;
		
		if (weight < 30){
			
			food = weight * 0.8;	
		}
		else if (weight >= 30 && weight <= 48) 
		{
			food =(weight * 1.10);
		}
		else 
		{
			food = (40 + (0.4 * (weight - 48)));
		}
		
		return food;
	}
	
	public double calcIMC() {
		//peso sobre altura al cuadrado
		double IMC = 0.0;
		
		IMC = weight / (height * height);
		
		return IMC;
	}
	
	public String calcHeartRisk() {
		
		String heartRisk = "";
		
		if (calcIMC() < 18 && typeOfBlood.equals ("a")|| typeOfBlood.equals("ab")) {
			
			heartRisk.equals ("Riesgo Bajo");
			
		}
		if(calcIMC() < 18 && typeOfBlood != ("a")||typeOfBlood != ("ab")){
			
			heartRisk.equals ("Riesgo Bajo");
			
		}
		//
		
		if (calcIMC() >= 18 && calcIMC() <=25){
			
			heartRisk.equals ("riesgo bajo");
			
		} 
		
		//
		
		if (calcIMC() >= 25 && typeOfBlood.equals("a") || typeOfBlood.equals("b") || typeOfBlood.equals("o")) {
			
			heartRisk.equals ("riesgo alto");
			
		}
		if (calcIMC() >= 25 && typeOfBlood.equals("ab")) {
			
			heartRisk.equals ("riesgo moderado");
			
		}
		return heartRisk;
	}
	
	public String vocalKangaroo(){
		
		String tname = "";
		String n = name.toLowerCase ();
	
		if (n.charAt (0) == 'a')
			tname = n;
		if (n.charAt (0) == 'e')
			tname = n;
		if (n.charAt (0) == 'i')
			tname = n;
		if (n.charAt (0) == 'o')
			tname = n;
		if (n.charAt (0) == 'u')
			tname = n;
		//
		if (n.charAt (n.length() - 1) == 'a')
			tname = n;
		if (n.charAt (n.length() - 1) == 'e')
			tname = n;
		if (n.charAt (n.length() - 1) == 'i')
			tname = n;
		if (n.charAt (n.length() - 1) == 'o')
			tname = n;
		if (n.charAt (n.length() - 1) == 'u')
			tname = n;
		return tname;
		
	}
}