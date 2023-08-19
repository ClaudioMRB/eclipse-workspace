package model.entities;

import model.intefaces.IAluno;
import model.intefaces.ICliente;

public class Aluno implements ICliente, IAluno{

	@Override
	public void logar() {
		System.out.println("Seja bem vindo, aluno, bons estudos!");
		
	}

	@Override
	public void imprimir() {
		System.out.println("Voce pode imprimir a apostila neste semestre!");
		
	}

	@Override
	public void deslogar() {
		System.out.println("Obrigado por utilizar o sistema. Bons estudos!");
		
	}

	@Override
	public void matricular() {
		System.out.println("Voce esta matriculado!");
		
	}

}
