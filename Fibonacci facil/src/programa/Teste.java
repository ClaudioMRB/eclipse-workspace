package programa;

//Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
//- new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
//- System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.io.IOException;
import java.util.Scanner;

public class Teste {

	static int fibonacci(int n) {
		if(n == 0){
			return 0;
		}else if (n==1 || n ==2) {
			return 1;
		}else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}

	public static void main(String[] args) {
Scanner leitor = new Scanner(System.in);
int numero;
numero = leitor.nextInt();

for(int i = 0; i < numero; i++) {
	System.out.print(fibonacci(i) + " ");
}
	}

}
