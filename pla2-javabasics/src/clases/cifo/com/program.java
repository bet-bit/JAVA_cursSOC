package clases.cifo.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import practica.Treballador;

public class program {
	public static void main(String[] args) {
		Treballador t1 = new Treballador("Joan","44444444A");
		t1.setSou(7.0);
		System.out.println("Sou brut del treballador "+t1.getSou());
		}
}
