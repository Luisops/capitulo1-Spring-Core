package com.luchito.capitulo1.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.luchito.capitulo1.service.ImpresoraService;


@Configuration
public class AppConfig {
	
	@Bean
	public HolaMundo holaMundoBean() {
		return new HolaMundo();	
	}
	
	@Bean
	public  DocumentoExcel documentoExcelBean() {
		return new DocumentoExcel();
	}
	
	@Bean
	public DocumentoTexto documentoTextoBean() {
		return new DocumentoTexto();
	}
	
	@Bean
	public  ImpresoraService impresoraServiceBean() {
		return new ImpresoraService();
	}
	
}
