package model;


	//constantes
	
	

	public class kangarooEnvioriment{
		
		public static final int valSize = 8;
		
		private double size;
		
	//relaciones
	
	private kangaroo kgo1;
	
	private kangaroo kgo2;
	
	private kangaroo kgo3;
	
	//metodos
	
	public kangarooEnvioriment (double size, kangaroo kgo1, kangaroo kgo2, kangaroo kgo3) {
		this.size = size;
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
	
	public double calcSize (double size) {
		//el tamaño debe ser la altura del canguro * 8 
		
		size = (kgo1.getHeight() + kgo2.getHeight() + kgo3.getHeight())* valSize;
		
		return size;
	}
	
	public double calcTFood () {
		double food = 0.0;
		
		
		food += kgo1 == null ? 0 : kgo1.calcFood();
		food += kgo2 == null ? 0 : kgo2.calcFood();
		food += kgo3 == null ? 0 : kgo3.calcFood();
		
		
		return food;
	}
	
	public String namew () {
		String allname = "";
		
		if (kgo1.vocalKangaroo() != null)
			allname += kgo1.vocalKangaroo();
		if (kgo2.vocalKangaroo() != null)
			allname += kgo1.vocalKangaroo();
		if (kgo3.vocalKangaroo() != null)
			allname += kgo1.vocalKangaroo();
		
		return allname;
	}
	
}