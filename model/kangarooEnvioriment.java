package model;


	//constantes
	
	

	public class kangarooEnvioriment{
		
		public static final int VAL_SIZE = 8;
		
		private double size;
		
		public static final int G_MALE = 1;
		
		
	//relaciones
	
	private kangaroo kgo1;
	
	private kangaroo kgo2;
	
	private kangaroo kgo3;
	
	//metodos
	
	public kangarooEnvioriment (kangaroo kgo1, kangaroo kgo2, kangaroo kgo3) {
		this.size = size;
		this.kgo1 = kgo1;
		this.kgo2 = kgo2;
		this.kgo3 = kgo3;
	}
	
	public double getSize () {
		return size;
	}
	
	public void setSize (double size) {
		this.size = size;
	}

	public kangaroo getKgo1 () {
		return kgo1;
	}
	
	public void setKgo1 (kangaroo kgo1) {
		this.kgo1 = kgo1;
	}
	
	public kangaroo getKgo2 () {
		return kgo2;
	}
	
	public void setKgo2 (kangaroo kgo2) {
		this.kgo2 = kgo2;
	}
	
	public kangaroo getKgo3 () {
		return kgo1;
	}
	
	public void setKgo3 (kangaroo kgo3) {
		this.kgo3 = kgo3;
	}
	
	//metodos
	
	public double calcSize () {
		//el tamaño debe ser la altura del canguro * 8 
		
		if(kgo1 != null)
			size += kgo1.getHeight() * VAL_SIZE;
		if(kgo2 != null)
			size += kgo2.getHeight() * VAL_SIZE;
		if(kgo3 != null)
			size += kgo3.getHeight() * VAL_SIZE;
		
		return size;			
	}
	
	public double calcFoodKang1 () {
		double foodkan1 = 0.0;
		
		if (kgo1.getWeight() < 30){
			
			foodkan1 = kgo1.getWeight() * 0.8;	
		}else if (kgo1.getWeight() >= 30 && kgo1.getWeight() <= 48) {
			
			foodkan1 =(kgo1.getWeight() * 1.10);
		}else {
			
			foodkan1 = (40 + (0.4 * (kgo1.getWeight() - 48)));
		}
		
		return foodkan1;
	}
	
	public double calcFoodKang2 () {
		double foodkan2 = 0.0;
		
		if (kgo2.getWeight() < 30){
			
			foodkan2 = kgo2.getWeight() * 0.8;	
		}else if (kgo2.getWeight() >= 30 && kgo2.getWeight() <= 48) {
			
			foodkan2 =(kgo2.getWeight() * 1.10);
		}else {
			
			foodkan2 = (40 + (0.4 * (kgo2.getWeight() - 48)));
		}
		return foodkan2;
	}
	
	public double calcFoodKang3 () {
		double foodkan3 = 0.0;
		
		if (kgo3.getWeight() < 30){
			
			foodkan3 = kgo3.getWeight() * 0.8;	
		}
		else if (kgo3.getWeight() >= 30 && kgo3.getWeight() <= 48) 
		{
			foodkan3 =(kgo3.getWeight() * 1.10);
		}
		else 
		{
			foodkan3 = (40 + (0.4 * (kgo3.getWeight() - 48)));
		}
		
		return foodkan3;
	}
	public double calcTFood () {
		double food = 0.0;
		
		
		food += kgo1 == null ? 0 : calcFoodKang1();
		food += kgo2 == null ? 0 : calcFoodKang2();
		food += kgo3 == null ? 0 : calcFoodKang3();
		
		
		return food;
	}
	
	
	public boolean mach (){
		boolean mac = false;
		
		if (kgo1 != null && kgo1.getGender() == G_MALE){
			mac = true;
		}
		if (kgo2 != null && kgo2.getGender() == G_MALE){
			mac = true;
		}
		if (kgo3 != null){
			if (kgo3.getGender() == G_MALE){
				mac = true;
			}
		}
		return mac;
	}
	
	public String addKgo (kangaroo nuevokgo){
		
		String mess = "";
		if (kgo1 == null || kgo2 == null || kgo3 == null){
			
			if(nuevokgo.getGender() == 1) {
				if (mach()) {
					mess = "EL AMBIENTE YA TIENE UN MACHO";
				}
			}
		}	
			if (kgo1 == null) {
				kgo1 = nuevokgo;
				mess = "SE AGREGO EL NUEVO KANGURO";
			}else if (kgo2 == null) {
				kgo2 = nuevokgo;
				mess = "SE AGREGO EL NUEVO KANGURO";
			}else if (kgo3 == null) {
				kgo3 = nuevokgo;
				mess = "SE AGREGO EL NUEVO KANGURO";
			}else {
			mess = "NO SE PUDO AGREGAR. EL AMBIENTE ESTA LLENO";
			}
			
		
		return mess;
	}

	public double calcWater () {
		
		double water = 0.0;
		
		if(kgo1 != null)
			water += kgo1.calcIMC()*1.5;
		if(kgo2 != null)
			water += kgo2.calcIMC()*1.5;
		if(kgo3 != null)
			water += kgo3.calcIMC()*1.5;
		
	return water;
	}
	
	public String SEvioriment() {
		String msg = "";
		
		if(kgo1 != null)
		{
		msg += "El primer canguro de este ambiente es:\n \n"+kgo1.sKangaroo()+"\n";
		msg += "-------------------------------------------------------------------- \n";
		}
		if(kgo2 != null)
		{
		msg += "El segundo canguro de este ambiente es:\n \n"+kgo2.sKangaroo()+"\n";
		msg += "-------------------------------------------------------------------- \n";
		}
		if(kgo3 != null)
		{
		msg += "El tercer canguro de este ambiente es:\n \n"+kgo3.sKangaroo()+"\n";
		msg += "-------------------------------------------------------------------- \n";
		}
		
		msg += "Este ambiente cuenta con un area de: "+calcSize()+"metros cuadrados \n";
		msg += "Este ambiente cuenta con "+calcTFood()+" kg de comida \n";
		msg += "Este ambiente cuenta con "+calcWater()+" litros de agua \n";
		
		return msg;
	}
	
	public String removeKgo (int kang){
		String msj = "";
		
		if (kang == 1){
			if (kgo1 != null){
				kgo1 = null;
				msj  = "el canguro ha sido eliminado";
			}else{
				msj = "el canguro no existe";
			}
		}
		if (kang == 2){
			if (kgo1 != null){
				kgo1 = null;
				msj  = "el canguro ha sido eliminado";
			}else{
				msj = "el canguro no existe";
			}
		}
		if (kang == 3){
			if (kgo3 != null){
				kgo3 = null;
				msj  = "el canguro ha sido eliminado";
			}else{
				msj = "el canguro no existe";
			}
		}
		return msj;	
	}
	// public boolean knowKangaroo (){
		// boolean empty = false;
		
		// if (kgo1 == null) {
				// empty = true;
			// }else if (kgo2 == null) {
				// empty = true;
			// }else if (kgo3 == null) {
				// empty = true;
			// }
		// return empty;		
	// }
	
	
	// public String changeKgo (kangaroo changeKang){
		// String mess = "";
		
		// if (kgo1 == null) {
				// kgo1 = changeKang;
				// mess = "SE CAMBIO EL NUEVO KANGURO";
			// }else if (kgo2 == null) {
				// kgo2 = changeKang;
				// mess = "SE CAMBIO EL NUEVO KANGURO";
			// }else if (kgo3 == null) {
				// kgo3 = changeKang;
				// mess = "SE CAMBIO EL NUEVO KANGURO";
			// }
			// return mess;
	// }
	
	public kangaroo selectedKangaroo (int kang){
		kangaroo changeKang = null;
		
		if (kang == 1){
			if (kgo1 != null)
			changeKang = kgo1;
		}else if (kang == 2){
			if (kgo2 != null)
			changeKang = kgo2;
		}else if (kang == 3){
			if (kgo3 != null)
			changeKang = kgo3;
		}
		return changeKang;
	
	}
	
	public String addChangeKgo(kangaroo nuevokgo){
		
		String msg = "";
		if (kgo1 == null || kgo2 == null || kgo3 == null){
			
			if(nuevokgo.getGender() == 1) {
				if (mach()) {
					msg = "Ya hay un macho en el ambiente. No se cambio el canguro";
				}
			}else if (kgo1 == null){
				kgo1 = nuevokgo;
				msg = "El canguro ha sido cambiado ";
			}else if (kgo2 == null) {
				kgo2 = nuevokgo;
				msg = "El canguro ha sido cambiado ";
			}else if (kgo3 == null) {
				kgo3 = nuevokgo;
				msg = "El canguro ha sido cambiado ";
			}
			
		}else {
				msg = "Ambiente lleno. No se cambio el canguro";
		}
		
		return msg;
	}
	
	public String removeChangeKangaroo(int kang){
		String msg = "";
		 if(kang == 1) {	
				if (kgo1 != null){		   	
					kgo1 = null;
					msg += "";
				}else {
					msg += "";
				}
			
		    }else if(kang == 2) {		
				if (kgo2 != null){   	
					kgo2 = null;
					msg += "";
				}else {
					msg += "";
				}
						
			}else if(kang==3){
			   if (kgo3 != null){   	
					kgo3 = null;
					msg += "";
			   }else{
					msg += "";
				}
			
			}else{		
				msg += "";
			}
		   
		return msg;
	}
}