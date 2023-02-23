package aoolication;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionarios;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionarios funci = new Funcionarios();
		
		
		Character opcao = ' ';
		System.out.print("Digite(s) Sim ou (n) para Não: ");
		opcao = sc.next().charAt(0);
		String nome = " ";
		Double cont = 0.0;
		
		
		
		while (opcao == 's') {

			try {
				
				System.out.print("Digite um nome: ");
				nome = sc.nextLine();
				sc.nextLine();
				System.out.print("Digite um Valor real: ");
				cont = sc.nextDouble();
				Funcionarios func = new Funcionarios(nome, cont);
				func.setFunc(func);
				System.out.println("Sucesso ");
			} catch (InputMismatchException e) {

				System.out.println("Favor tentar de novo. ");
			}

			System.out.println();
			System.out.print("Deseja continua? ");
			sc.nextLine();
			opcao = sc.next().charAt(0);

			System.out.println();
			for(int i = 0; i < funci.getFunc().size(); i++ ) {
				funci.getFunc().get(i).getNome();

			System.out.println("Fim do programa");
			sc.close();

		}

		}
		
		

	}
}

