package com.pla5.exercici;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.pla5.exercici")
public class ConfParaulesInvertir {

	@Bean
	public IProcessar beanprocessar() {
		return new Paraules();
		}
	
	@Bean
	public ICodificar beancodificar() {
		return new Invertir();
		}

	@Bean
	public Codificador beancodificador() {
		return new Codificador(beanprocessar(), beancodificar());
		}

}
