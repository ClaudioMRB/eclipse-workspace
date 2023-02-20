package vetor;

import java.util.Scanner;

public class CriandoVetores {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		//Qauntidade de alunos que serão cadastrados no vetor
		int numAlunos = 2;
		//Declaração dos vetores
		Double[] notaAlunos = new Double[numAlunos];
		String[] nomeAlunos = new String[numAlunos];
		
		//Aqui irá acessar cada posição do vetor e add os valores
		for(int i = 0; i < numAlunos; ++i) {
			System.out.print("Digite o nome do " + (i+1) + "° aluno:");
			nomeAlunos[i] = scan.nextLine();
			System.out.print("Digite a nota do "+ (i+1) + "° aluno");
			notaAlunos[i] = scan.nextDouble();
			scan.nextLine();
		}
		
		
		//Aqui irá acessar cada posição dos vetores e imprimir na tela
		for(int i = 0; i < numAlunos; ++i) {
			System.out.print("\nNome: "+ nomeAlunos[i] + "\nNota: " + notaAlunos[i]);
			System.out.println();
		}
	}

}
