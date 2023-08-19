package application;

import model.entities.Aluno;
import model.entities.Cliente;

public class Program {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Cliente c1 = new Cliente();
		
		c1.logar();
		a1.logar();
		c1.imprimir();
	}

}
