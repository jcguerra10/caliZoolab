package model;
import java.time.*;
import java.util.*;
import java.time.temporal.ChronoUnit;

	public class kangaroo {
		
		//atributos
		
		private String name;
		
		private double weight;
		
		private double height;
		
		private int gender;
		
		private String typeOfBlood;
		
		
	//relaciones
	
	private dated kgbirth;
	
	//constantes
	
	public final static int DAY_YEARS = 365;
	public final static int DAY_WEEK= 7;
	
	//metodos
	
	public kangaroo(String name, double weight, double height, int gender, String typeOfBlood, dated Kgbirth){
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.gender = gender;
		this.typeOfBlood = typeOfBlood;
		this.kgbirth = Kgbirth;
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
	
	
	public double calcIMC() {
		//peso sobre altura al cuadrado
		double IMC = 0.0;
		
		IMC = weight / (height * height);
		
		return IMC;
	}
	
	public String calcHeartRisk() {
		
		String heartRisk = "";
		
		if (calcIMC() < 18 && typeOfBlood.equals ("a")|| typeOfBlood.equals("ab")) {
			
			heartRisk = "Riesgo Bajo";
			
		}
		if(calcIMC() < 18 && typeOfBlood != ("a")||typeOfBlood != ("ab")){
			
			heartRisk = "Riesgo Bajo";
			
		}
		//
		
		if (calcIMC() >= 18 && calcIMC() <=25){
			
			heartRisk = "riesgo bajo";
			
		} 
		
		//
		
		if (calcIMC() >= 25 && typeOfBlood.equals("a") || typeOfBlood.equals("b") || typeOfBlood.equals("o")) {
			
			heartRisk = "riesgo alto";
			
		}
		if (calcIMC() >= 25 && typeOfBlood.equals("ab")) {
			
			heartRisk = "riesgo moderado";
			
		}
		return heartRisk;
	}
	
	
	public long calcAge(){
			
		long years;
		
		LocalDate start = LocalDate.of(kgbirth.getYear(), kgbirth.getMonth(), kgbirth.getDay());
		LocalDate end = LocalDate.now();
		years = ChronoUnit.YEARS.between(start, end);
		
		return years;
	}
	
	public int numbOfDays(){
		GregorianCalendar date = new GregorianCalendar(kgbirth.getYear(), kgbirth.getMonth() - 1, kgbirth.getDay());
		
		int counter = 0;
		
		GregorianCalendar actualDate = new GregorianCalendar();
			if ((date.get(Calendar.DAY_OF_MONTH) == actualDate.get(Calendar.DAY_OF_MONTH)) && (date.get(Calendar.MONTH) == actualDate.get(Calendar.MONTH)) && (date.get(Calendar.YEAR) == actualDate.get(Calendar.YEAR))){
		
				date.add(Calendar.DAY_OF_MONTH, 1);
				counter++;
			}
		return counter;
	}
	
	public int leftDays(){
		
		int days = 0;
		int leftDays = DAY_YEARS - numbOfDays();

		days = leftDays % DAY_WEEK;

		return days;
	}
	public int leftWeeks(){
		
		int leftWeeks = 0;
		int leftDays = DAY_YEARS - numbOfDays();

		leftWeeks = leftDays / DAY_WEEK;

		return leftWeeks;
	}
	
	public String vaccine(){
		
		String msj = "";
		int year = kgbirth.getYear()+1;

		if (calcAge() >= 1){
			msj += "No necesita vacuna \n"; 
			msj += "El canguro fue vacunado en: "+kgbirth.getDay()+"/"+kgbirth.getMonth()+"/"+year;
		} else {	
			msj += "la vacunacion es en: "+leftWeeks()+" semanas, y "+leftDays()+" dias";
		}
		return msj;
	}
	
	public String vaccination(){
		String msj ="";
		int year = kgbirth.getYear()+1;		

		msj += "El canguro necesitara ser vacunado la fecha: "+kgbirth.getDay()+"/"+kgbirth.getMonth()+"/"+year+"\n";

		return msj;
	}
	
	public String sKangaroo(){
		String msj = "";
		if (kgbirth != null){
			msj += "El nombre del canguro es: " + name + "\n";
			msj += "El canguro pesa: " + weight + "Kg. \n";
			msj += "el canguro Mide: " + height + "m. \n";
			msj += "El genero del canguro es: " + gender + "\n";
			msj += "El tipo de sangre del canguro es: " + typeOfBlood + "\n";
			msj += "Tiene un imc de: " + calcIMC() + "\n";
			msj += "Su riesgo cardiaco es: " + calcHeartRisk() + "\n";
			msj += born()+ "\n";
			msj += "El canguro " + vaccine() + "\n";
			if(calcAge() < 1)
				msj += "El canguro nacio hace menos de un anio\n";
			else
				msj += "El canguro tiene "+calcAge()+" anios\n";
			//msj += showVowels();
		}
		return msj;
	}
	
	public boolean vowel(){
		boolean vowel = false;
		int first = 0, last = name.length()-1;

		if((name.charAt(first)=='a') || (name.charAt(first)=='e') || (name.charAt(first)=='i') || (name.charAt(first)=='o') || (name.charAt(first)=='u' || name.charAt(first)=='A') || (name.charAt(first)=='E') || (name.charAt(first)=='I') || (name.charAt(first)=='O') || (name.charAt(first)=='U')) 
		{
			first = last;
			if((name.charAt(first)=='a') || (name.charAt(first)=='e') || (name.charAt(first)=='i') || (name.charAt(first)=='o') || (name.charAt(first)=='u' || name.charAt(first)=='A') || (name.charAt(first)=='E') || (name.charAt(first)=='I') || (name.charAt(first)=='O') || (name.charAt(first)=='U'))
			{
				vowel = true;			
			}
		}
		return vowel;
	}

	public String whoVowel(){
		String msg = "";

		if (vowel())
		{
			msg += name + ".\n";
		}
		return msg;
	}

	public String showVowels(){
		String msg = "";

		if (vowel())
		{
			msg += "El nombre de este canguro empieza y termina en vocal\n";	
		}else
		{	
			msg += "El nombre de este canguro no empieza y termina en vocal\n";
		}

		return msg;
	}
	public String born (){
			String msj = "";
			
			msj = "El canguro nacio: " + kgbirth.getDay() + " / " + kgbirth.getMonth() + " / " + kgbirth.getYear() + "\n";		
			
			return msj;
	}
}