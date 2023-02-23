package entities;

import java.util.ArrayList;
import java.util.List;

public class Funcionarios {
	
	List<Funcionarios> func = new ArrayList<>();
	String nome = " ";
	Double cont;

	public Funcionarios() {
		
	}

	

	public Funcionarios(String nome, Double cont) {
		
		this.nome = nome;
		this.cont = cont;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public Double getCont() {
		return cont;
	}



	public void setCont(Double cont) {
		this.cont = cont;
	}



	public List<Funcionarios> getFunc() {
		return func;
	}

	public void setFunc(Funcionarios list) {
		func.add(list);
	}

	
	
	

}
