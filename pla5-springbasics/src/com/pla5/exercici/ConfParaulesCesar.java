package com.pla5.exercici;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.pla5.exercici")
public class ConfParaulesCesar {

	@Bean
	public IProcessar beanprocessar() {
		return new Paraules();
		}
	
	@Bean
	public ICodificar beancodificar() {
		return new Cesar();
		}

	@Bean
	public Codificador beancodificador() {
		return new Codificador(beanprocessar(), beancodificar());
		}

}
