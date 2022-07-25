package com.luchito.capitulo1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.luchito.capitulo1.beans.Imprimible;

public class ImpresoraService {

	@Autowired
	@Qualifier("documentoTextoBean")
	private Imprimible documento;
	
	//constructor vacio
	public ImpresoraService() {
		// TODO Auto-generated constructor stub
	}
	
	//constructor con campos
	public ImpresoraService(Imprimible documento) {
		this.documento = documento;
	}

	//METODO
	public void imprimirDocumento() {
		System.out.println(documento.imprimir());
	}

	//metodo get and set
	public Imprimible getDocumento() {
		return documento;
	}

	public void setDocumento(Imprimible documento) {
		this.documento = documento;
	}
	
}
