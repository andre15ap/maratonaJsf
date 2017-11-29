package com.andre.testejsf.java;



import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
//import javax.inject.Inject; talvez necessite
import javax.inject.Named;


@Named("user")
@SessionScoped
public class NomesBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nome = "pedro";
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	
}
