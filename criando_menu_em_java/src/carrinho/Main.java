package carrinho;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int escolha = 0;
		do {
			System.out.println("1 - adicionar");
			System.out.println("2 - Consultar");
			System.out.println("3 - Excluir");
			escolha = teclado.nextInt();
		}while(escolha != 0);
		
	}

}
