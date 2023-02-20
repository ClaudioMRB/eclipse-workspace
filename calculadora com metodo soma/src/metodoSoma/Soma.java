package metodoSoma;

import java.util.Scanner;

public class Soma {
	Scanner scan = new Scanner(System.in);
	public Double Soma(Double x) {
		Double n1, n2;
		System.out.println("Digite o primeiro numero: ");
		n1 = scan.nextDouble();
		System.out.println("Digite o segundo numero: ");
		n2 = scan.nextDouble();
		System.out.println();
		x = n1+n2;
				
		return x;
		
	}

	public static void main(String[] args) {
	Soma sum = new Soma();
	Double x = 0.0;
	
	System.out.printf("A soma total e: %.2f ", sum.Soma(x));

	}

}
