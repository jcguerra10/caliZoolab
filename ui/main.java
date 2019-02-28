package ui;

import model.*;

import java.util.Scanner;

	
public class main {
	
	private caliZoo zoo ;
	
	
	public main () {
		init ();
	}
	
	public static void main (String[] args) {
		
		main m = new main ();
	
	}
	
	public void init () {
		
		
		
		
		//1 = male  2 = female
		
		// kangaroo hugo = new kangaroo("hugo", 95.0, 1.68, 1, 50.48, "AB", kgo1.getIMC  new dated(20, 6, 2009));
		// kangaroo kelly = new kangaroo("kelly", 79.0, 1.70,2, 41.0, "o", kgo2.getIMC  new dated( 12, 8, 2007));
		// kangaroo paquita = new kangaroo ("paquita", 90.0, 1.84, 2, 74.0, "b", kgo3.getIMC new dated(10, 8, 2004));
		// kangaroo noori = new kangaroo ("noori", 67.0, 1.48, 2, 68.0, "b", new dated (04, 5, 2007));
		// kangaroo maria = new kangaroo ("maria", 68.0, 1.75, 2, 58, "AB", new dated (10, 12, 2005));
		// kangaroo pablo = new kangaroo ("pablo", 65.0, 1.67, 1, 58, "AB", new dated (10, 8, 2009));
		// kangaroo firu = new kangaroo ("firu", 75.0, 1.60, 1, 70.0, "a", new dated (20, 1, 2009));
		// kangaroo pau = new kangaroo ("pau", 74.0, 1.85, 2, 60, "AB", new dated (29, 9, 2010));
		// kangaroo lau = new kangaroo ("lau", 67.0, 1.72, 2, 59.0, "b", new dated (11, 2, 2009));
		// boaredDragon paco = new boaredDragon ("paco", 34.0, 1.0, 1, 20.0);
		// boaredDragon nori = new boaredDragon ("nori", 32.0, 0.98, 2, 22.0);
		
		// kangarooEnvioriment KEnvo1 = new kangarooEnvioriment (500, hugo, kelly, paquita);
		// kangarooEnvioriment KEnvo2 = new kangarooEnvioriment (400, noori, maria, pablo);
		// kangarooEnvioriment KEnvo3 = new kangarooEnvioriment (400, firu, pau, lau);
		
		// kangarooZone zone1 = new kangarooZone (45.0, 75.0, 45.0, 98.0, 80, KEnvo1, KEnvo2, KEnvo3);
		// boaredDragonZone zone2 = new boaredDragonZone (46.0, 60.0, 36, 79.0, 500, paco, nori);
		

		//menu
		Scanner read = new Scanner (System.in);
		int option;
		
		System.out.println ("Menu");
		System.out.println ("1- Crear nuevo kanguro ");
		System.out.println ("2- Eliminar kanguro ");
		System.out.println ("3- Cambiar kanguro de ambiente");
		System.out.println ("4- Cuales son los kanguros que los nombres empiezan y terminan en vocal");
		System.out.println ("5- Dar el reporte de las fechas de vacunacion de los kanguros");
		option = read.nextInt();
		
		switch (option){
			case 1:
			
				kangaroo = new kangaroo [name, weight, height, gender, typeOfBlood]
							
				System.out.println ("Por favor dijite el nombre del kanguro:");
				name = read.nextLine();
				System.out.println ("por favor digite el peso del kanguro:");
				weight = read.nextDouble();
				System.out.println ("Por favor dijite la alutra del kanguro:");
				height = read.nextDouble();
				System.out.println ("Por favor dijite el genero del kanguro 1- si es macho, 2- si es hembra:");
				gender = read.nextInt();
				System.out.println ("Por favor dijite el tipo de sangre del kanguro:");
				typeOfBlood = read.nextString;
				//System.out.println (":") aca va el IMC
				//System.out.println (":") aca va el heart Risk
				
				System.out.println ("Por favor dijite el ambiente que quiere agragar el kanguro:");
				System.out.println ("1- ambiente no1");
				System.out.println ("2- ambiente no2");
				System.out.println ("3- ambiente no3");
				op = read.nextInt;0
				if (option == 1){
					
				}else if (option == 2){
					
				}else if (option == 3){
					
				}else{
					System.out.println ("No es un numero valido");
				}
				break;
			case 2:
			
				break;
			case 3:
				
				break;	
			case 4:
				
				break;
			case 5:
			
				break;
			default:
				System.out.println ("Digito no valido");
			
		}
		
	}

		
	
	
}