package com.luchito.capitulo1.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ejecutar {

	public static void main(String[] args) {
		/*CON XML*/
		//ApplicationContext contexto = new ClassPathXmlApplicationContext("beans.xml"); 
		/*CON ANOTACIONES*/
		
		ApplicationContext contexto = new AnnotationConfigApplicationContext(AppConfig.class);
		HolaMundo hm = (HolaMundo) contexto.getBean("holaMundoBean");
		hm.saludar();
		
		((ConfigurableApplicationContext)contexto).close();
		
	}
}
