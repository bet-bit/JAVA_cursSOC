package com.pla5.exercici;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {

	// #1 : test codificar conf 1
	System.out.println("\n* * * * * * * * * * * * * * * * * *\nMostra de codificació invertint paraules: \n * * * * * * * * * * * * * * * * * *:");

	// context spring
	AnnotationConfigApplicationContext context1 = new
	AnnotationConfigApplicationContext(ConfParaulesInvertir.class);
	
	
	// demanar "bean"
	Codificador frase1 = context1.getBean("beancodificador", Codificador.class);
	
	// Passar paraula a codificar i imprimir-la per pantalla:
	
	String cadena1 = "Tinc ganes de jugar a fet i amagar invertint frases";
	System.out.println("Frase codificada:");
	System.out.println(frase1.codificar(cadena1));
	System.out.println("Frase descodificada:\n"+frase1.descodificar(frase1.codificar(cadena1)));
	
	// Tancar context
	context1.close();
	

	// #2 : test codificar conf 2
	System.out.println("\n* * * * * * * * * * * * * * * * * *\nMostra de codificació cesar: \n * * * * * * * * * * * * * * * * * *:");
	
	// context spring
	AnnotationConfigApplicationContext context2 = new
	AnnotationConfigApplicationContext(ConfParaulesCesar.class);
	
	// demanar "bean"
	Codificador frase2 = context2.getBean("beancodificador", Codificador.class);
	

	// Passar paraula a codificar i imprimir-la per pantalla:
	
	String cadena2 = "Tinc ganes de jugar a fet i amagar canviant lletres";
	System.out.println("Frase codificada:");
	System.out.println(frase2.codificar(cadena2));
	System.out.println("Frase descodificada:\n"+frase2.descodificar(frase2.codificar(cadena2)));
	
	// Tancar context
	context2.close();
	}
}

