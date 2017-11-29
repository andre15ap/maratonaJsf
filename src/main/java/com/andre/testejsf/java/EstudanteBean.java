package com.andre.testejsf.java;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.andre.testejsf.model.Estudante;

@Named("estudanteBean")
@SessionScoped
public class EstudanteBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Estudante estudante = new Estudante();
	private String valor = "deu certo";

	public Estudante getEstudante() {
		return estudante;
	}

	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}
