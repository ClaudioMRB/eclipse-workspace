package thiago_multivix;

import java.util.Locale;
import java.util.Scanner;

public class CalcMedia {

	public static void main(String[] args) {
		
		//Define o uso de ponto nas casas decimais.
		Locale.setDefault(Locale.US);
		//Declaração do método de entrada dos dados
		Scanner scan = new Scanner(System.in);
		
		//Declaração das variáveis que receberao as notas
		Double nota1, nota2, nota3, nota4;
		//Declaração que informa a quantidade de provas dadas
		int quantProvas = 4;
		
		//Imprime na tela a mensagem pedindo para digitgar a nota
		System.out.print("Digite a primeira nota: ");
		//scan Chama o método Scanner para o usuário digitar os valores de entrada
		//.nextDouble(); informa que a entrada será um numero real
		nota1 = scan.nextDouble();
		System.out.print("Digite a segunda nota: ");
		nota2 = scan.nextDouble();
		System.out.print("Digite a terceira nota: ");
		nota3 = scan.nextDouble();
		System.out.print("Digite a quarta nota: ");
		nota4 = scan.nextDouble();
		
		//Declaração que calcula a media do aluno
				Double mediaAluno = (nota1+nota2+nota3+nota4) / quantProvas;
				//Cria um espacamento entre as linhas
				System.out.println();
		//Imprime a média do aluno
		System.out.printf("A media do aluno foi: %.2f", mediaAluno);
		//Cria um espacamento entre as linhas
		System.out.println();
		
		if(mediaAluno >= 5) {
			System.out.println("\nAluno aprovado!");
		}else {
			System.out.println("\nAluno reprovado!");
		}

	}

}
