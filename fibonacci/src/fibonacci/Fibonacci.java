package fibonacci;

import java.util.Scanner;

public class Fibonacci {
	
	 static int fibonacci(int n) {
		if(n==1 || n ==2) {
			return 1;
		}else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}

	public static void main(String[] args) {
 Scanner leitor = new Scanner(System.in);
 int numero;
System.out.println("Digite o termo Fibonacci: ");
numero = leitor.nextInt();

for(int i = 1; i <= numero; i++) {
	System.out.println("Posicao "+ i + ": " + fibonacci(i));
}
	}

}
