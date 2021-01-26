package de.demmer.dennis;

public class Application {
	
	public static void main(String[] args) {
	
		Jacke jacke1 = new Jacke(99.99f, 4, "Warme Winterjacke", "Beste Winterjacke");
		
		Jacke jacke2 = new Jacke(99.99f, 4, "Warme Winterjacke", "Beste Winterjacke");

		System.out.println(jacke1.hashCode());
		System.out.println(jacke2.hashCode());
			
		
	}

}
