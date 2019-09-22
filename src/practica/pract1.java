package practica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pract1 {
	public static void main(String[] args) {
		Treballador t1 = new Treballador("Joan","44444444A");
		t1.saludar();
		Direccio d1 = new Direccio("Joan","44444444A");
		d1.saludar();

		Gerent g1 = new Gerent("Joan","44444444A");
		g1.saludar();
		
		Clients cl1 = new Clients("ba","bi","bo<");
		cl1.saludar();
	
		}
		

		
		
}