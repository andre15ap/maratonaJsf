package com.andre.testejsf.java;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.andre.testejsf.model.Estudante;

@Named("estudanteBean")
@SessionScoped
public class EstudanteBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Estudante estudante = new Estudante();
	private String[] nomesArray = {"NomeUm", "NomeDois", "NomeTres"};
	private List<String> nomesList = new ArrayList<>();
	
	public EstudanteBean() {
		nomesList.add("ListUm");
		nomesList.add("ListDois");
		nomesList.add("ListTres");
	}
	
	public List<String> getNomesList() {
		return nomesList;
	}

	public void setNomesList(List<String> nomesList) {
		this.nomesList = nomesList;
	}

	public Estudante getEstudante() {
		return estudante;
	}

	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}

	public String[] getNomesArray() {
		return nomesArray;
	}

	public void setNomesArray(String[] nomesArray) {
		this.nomesArray = nomesArray;
	}


}
