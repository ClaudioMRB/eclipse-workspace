package model.entities;

import model.intefaces.ICliente;

public class Cliente implements ICliente {

	@Override
	public void logar() {
		System.out.println("Seja bem vindo!");
	}

	@Override
	public void imprimir() {
		System.out.println("Voce pode imprimir!");
	}

	@Override
	public void deslogar() {
		System.out.println("Obrigado por utilizar o sistema!");
	}

}
