package ui;

import model.*;

import java.util.Scanner;

	
public class main {
	
	private caliZoo zoo ;
	
	
	public main () {
		init ();
	}
	
	
	public void init () {
		
		
		
		
		//1 = male  2 = female
		
		kangaroo hugo = new kangaroo("hugo", 95.0, 1.68, 1, "AB", new dated(20, 6, 2009));
		kangaroo kelly = new kangaroo("kelly", 79.0, 1.70,2, "o", new dated( 12, 8, 2007));
		kangaroo paquita = new kangaroo ("paquita", 90.0, 1.84, 2, "b", new dated(10, 8, 2004));
		kangaroo noori = new kangaroo ("noori", 67.0, 1.48, 2, "b", new dated (04, 5, 2007));
		kangaroo maria = new kangaroo ("maria", 68.0, 1.75, 2, "AB", new dated (10, 12, 2005));
		kangaroo pablo = new kangaroo ("pablo", 65.0, 1.67, 1, "AB", new dated (10, 8, 2009));
		kangaroo firu = new kangaroo ("firu", 75.0, 1.60, 1, "a", new dated (20, 1, 2009));
		kangaroo pau = new kangaroo ("pau", 74.0, 1.85, 2, "AB", new dated (29, 9, 2010));
		kangaroo lau = new kangaroo ("lau", 67.0, 1.72, 2, "b", new dated (11, 2, 2009));
		boaredDragon paco = new boaredDragon ("paco", 34.0, 1.0, 1, 20.0);
		boaredDragon nori = new boaredDragon ("nori", 32.0, 0.98, 2, 22.0); 
		
		kangarooEnvioriment KEnvo1 = new kangarooEnvioriment (hugo, kelly, paquita);
		kangarooEnvioriment KEnvo2 = new kangarooEnvioriment (noori, maria, pablo);
		kangarooEnvioriment KEnvo3 = new kangarooEnvioriment (firu, pau, lau);
		
		kangarooZone zone1 = new kangarooZone (45.0, 75.0, 45.0, 98.0, 80, KEnvo1, KEnvo2, KEnvo3);
		boaredDragonZone zone2 = new boaredDragonZone (46.0, 60.0, 36, 79.0, 500, paco, nori);
		
		zoo = new caliZoo ("zoologico de Cali", zone1, zone2);
		
	}
	public static void main (String[] args) {
		
		main m = new main();
		m.msg();
	
	}
		// menu
		
		public void msg(){
		
			Scanner scanStr = new Scanner (System.in);
			Scanner scanInt = new Scanner (System.in);
			Scanner scanDou = new Scanner (System.in);
			//
			System.out.println ("*****************************************************************************************************************************");
			// System.out.println ("Menu");
			// System.out.println ("1- Crear nuevo kanguro ");
			// System.out.println ("2- Eliminar kanguro ");
			// System.out.println ("3- Cambiar kanguro de ambiente");
			// System.out.println ("4- Cuales son los kanguros que los nombres empiezan y terminan en vocal");
			// System.out.println ("5- Mostrar los kanguros");
			// System.out.println ("6- salir");
			
			
			int option = 0;
			boolean exit = false;
			
			while (!exit){
				menu();
				option = scanInt.nextInt();
			
				switch (option){
					case (1):
						String name;
						double weight;
						double height;
						int gender;
						String typeOfBlood;
						int day;
						int month;
						int year;
						
						System.out.println ("Por favor digite el nombre del canguro:");
						name = scanStr.nextLine();
						System.out.println ("Por favor digite el peso en kg del canguro:");
						weight = scanDou.nextDouble();
						scanDou.nextLine();
						System.out.println ("Por favor digite la altura en metros del canguro:");
						height = scanDou.nextDouble();
						scanDou.nextLine();
						System.out.println ("Por favor digite el genero del canguro 1- si es macho, 2- si es hembra:");
						gender = scanInt.nextInt();
						scanInt.nextLine();
						System.out.println ("Por favor digite el tipo de sangre del canguro:");
						typeOfBlood = scanStr.nextLine();
						System.out.println ("Porfavor digite el dia de nacimiento");
						day = scanInt.nextInt();
						scanInt.nextLine();
						System.out.println ("Porfavor digite el mes de nacimiento");
						month = scanInt.nextInt();
						scanInt.nextLine();
						System.out.println ("Porfavor digite el anio de nacimiento");
						year = scanInt.nextInt();
						scanInt.nextLine();
						
						kangaroo nuevokgo = new kangaroo (name, weight, height, gender, typeOfBlood, new dated (day, month, year));
						
						System.out.println ("Por favor dijite el ambiente que quiere agregar el canguro:");
						System.out.println ("1- ambiente no1");
						System.out.println ("2- ambiente no2");
						System.out.println ("3- ambiente no3");
						
						int opEnvironment = scanInt.nextInt();
						
						System.out.println(zoo.addKgoo(nuevokgo, opEnvironment));
						break;
					case (2):
						
						int kang;
						
						System.out.println ("En que ambiente esta el canguro que quiere eliminar?:");
						System.out.println ("1. ambiente");
						System.out.println ("2. ambiente");
						System.out.println ("3. ambiente");
						opEnvironment = scanInt.nextInt();
						scanInt.nextLine();
						System.out.println ("Que canguro quiere cambiar?");
						System.out.println ("1.kanguro");
						System.out.println ("2.kanguro");
						System.out.println ("3.kanguro");
						kang = scanInt.nextInt();
						scanInt.nextLine();
						System.out.println(zoo.removeKgo(kang, opEnvironment));
						break;
					case (3):
					
						System.out.println("De que ambiente quiere cambiar el canguro: \n");
						System.out.println("1- AMBIENTE");
						System.out.println("2- AMBIENTE");
						System.out.println("3- AMBIENTE");
						
						int opEnvironment1 = scanInt.nextInt();

						System.out.println("Que canguro quiere cambiar: \n");
						System.out.println("1- CANGURO");
						System.out.println("2- CANGURO");
						System.out.println("3- CANGURO");
						
						kang = scanInt.nextInt();
						
						System.out.println("A que ambiente quiere cambiar el canguro: \n");
						System.out.println("1- CANGURO");
						System.out.println("2- CANGURO");
						System.out.println("3- CANGURO");
						
						int opEnvironment2 = scanInt.nextInt();
						
						System.out.println (zoo.changeKangaroo(kang, opEnvironment1, opEnvironment2));
						break;	
					case (4):
					
						break;
					case (5):
							System.out.println(zoo.showZoo());
						break;
					case (6):
						exit = true;
						break;
					default:
						System.out.println ("Digito no valido");
					
				}
			}		
		}
		
		public void menu(){
		
			System.out.println("*****************************************************************************************************************************");
			System.out.println("Menu");
			System.out.println("1- Crear nuevo kanguro ");
			System.out.println("2- Eliminar kanguro ");
			System.out.println("3- Cambiar kanguro de ambiente");
			// System.out.println("4- Cuales son los kanguros que los nombres empiezan y terminan en vocal");
			System.out.println("5- Mostrar los kanguros");
			System.out.println("6- salir");
		}
}