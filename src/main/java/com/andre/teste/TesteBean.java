package com.andre.teste;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
 public class TesteBean {
	private int numero;
	
	public TesteBean() {
		//this.numero = 50;
	}
	
	public void incrementaNumero() {
		this.numero = this.numero + 1;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
