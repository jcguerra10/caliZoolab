package model;

	public class boaredDragon{
		//atributos
		
		private String name;
		
		private double weight;
		
		private double height;
		
		private int gender;
		
		private double food;
		
		private double IMC;
		
		//metodos
	
		
		public boaredDragon(String name, double weight, double height, int gender, double food, double IMC) {
			
			this.name = name;
			this.weight = weight;
			this.height = height;
			this.gender = gender;
			this.food = food;
			this.IMC = IMC;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName (String name) {
			this.name = name;
		}
		
		public double getWeight() {
			return weight;
		}
		
		public void setWeight (double weight){
			this.weight = weight;
		}
		
		public double getHeight () {
			return height;
		}
		
		public void setHeight (double height) {
			this.height = height;
		}
		
		public int getGender () {
			return gender;
		}
		
		public void setGender (int gender){
			this.gender = gender;
		}
		
		public double getFood() {
			return food;
		}
		
		public void setFood(double food){
			this.food = food;
		}
		
		public double getIMC (){
			return IMC;
		}

		public void setIMC (double IMC) {
			this.IMC = IMC;	
		}
		
		//metodos
		
		public double calcIMC (double weight, double height) {
			//peso sobre altura al cuadrado
			IMC = weight / (height * height);
			return IMC;
		}
		
		
	}