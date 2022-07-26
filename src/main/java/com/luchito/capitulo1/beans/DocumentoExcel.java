package com.luchito.capitulo1.beans;

public class DocumentoExcel implements Imprimible{

	public void iniciar() {
		System.out.println("Iniciando la construcción del bean");
	}
	
	public void destruir() {
		System.out.println("Destruyendo la instancia creada");
	}
	
	@Override
	public String imprimir() {
		// TODO Auto-generated method stub
		return "Imprimiendo desde un archivo Excel";
	}

}
