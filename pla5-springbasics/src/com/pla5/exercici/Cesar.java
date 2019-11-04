package com.pla5.exercici;

import java.io.*;

public class Cesar implements ICodificar {
	
	public String codificar(String cadena) {
		return this.caesar(cadena,2);	}

	public String descodificar(String cadena) {
		return this.caesar(cadena,-2);
	}
	
	private String caesar(String cadena, int pas) {
		
		String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		cadena = cadena.toUpperCase();
		
        StringBuilder builder = new StringBuilder();
        
        
		for(int i = 0; i < cadena.length(); ++i){
			char ch = cadena.charAt(i);
			
			if (pas > 0) {
				
				int posicioCodificada = uppercase.indexOf(ch)+pas;
				
				if (posicioCodificada >= uppercase.length())
					posicioCodificada = posicioCodificada - uppercase.length();
				
				builder.append(uppercase.charAt(posicioCodificada));

			}
			
			
			else if (pas < 0) {
				
				int posicioCodificada = uppercase.indexOf(ch)+pas;
				
				if (posicioCodificada < 0)
					posicioCodificada = posicioCodificada + uppercase.length();
				
				builder.append(uppercase.charAt(posicioCodificada));

			}
			
			else builder.append(ch);
		}

		return builder.toString();
	}
}
