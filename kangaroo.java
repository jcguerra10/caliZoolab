package model;

	//constantes
	
	

	//atributos
	
	public class kangaroo {
		
		private String name;
		
		private double weight;
		
		private double height;
		
		private int gender;
		
		private double food;
		
		private String typeOfBlood;
		
		private double IMC;
		
		private String heartRisk;
		
		private vacunationDate
		
	//relaciones
	
	private dated kgbirth;
	
	//metodos
	
	public kangaroo(String name, double weight, double height, int gender, double food, String typeOfBlood, dated Kgbirth, double IMC){
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.gender = gender;
		this.food = food;
		this.typeOfBlood = typeOfBlood;
		this.kgbirth = kgbirth;
		this.IMC = IMC;
		this.heartRisk = heartRisk;
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
	
	public double getFood (){
		return food;
	}
	
	public void setFood (double food) {
		this.food = food;
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
	
	public double getIMC () {
		return IMC;
	}
	
	public void setIMC (double IMC) {
		this.IMC = IMC;
	}
	
	public String getHeartRisk () {
		return heartRisk;
	}
	
	public void setHeartRisk (String heartRisk) {
		this.heartRisk = heartRisk;
	}
	
	
	//metodos
	
	
	public double calcFood (double weight) {
		
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
	
	public double calcIMC(double weight, double height) {
		//peso sobre altura al cuadrado
		IMC = weight / (height * height);
		return IMC;
	}
	
	public String calcHeartRisk(String heartRisk, double IMC, String typeOfBlood) {
		
		if (IMC < 18 && typeOfBlood.equals ("a")|| typeOfBlood.equals("ab")) {
			
			heartRisk.equals ("Riesgo Bajo");
			
		}
		if(IMC < 18 && typeOfBlood != ("a")||typeOfBlood != ("ab")){
			
			heartRisk.equals ("Riesgo Bajo");
			
		}
		//
		
		if (IMC >= 18 && IMC <=25){
			
			heartRisk.equals ("riesgo bajo");
			
		} 
		
		//
		
		if (IMC >= 25 && typeOfBlood.equals("a") || typeOfBlood.equals("b") || typeOfBlood.equals("o")) {
			
			heartRisk.equals ("riesgo alto");
			
		}
		if (IMC >= 25 && typeOfBlood.equals("ab")) {
			
			heartRisk.equals ("riesgo moderado");
			
		}
		return heartRisk;
	}
}