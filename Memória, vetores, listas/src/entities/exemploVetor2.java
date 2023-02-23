package entities;

import java.util.Locale;
import java.util.Scanner;

public class exemploVetor2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int n = sc.nextInt();

		Product[] vect = new Product[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.print("Digite nome do produto: " + i);
			String name = sc.nextLine();
			System.out.print("Digite preço do produto: " + i);
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);

		}
		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += vect[i].getPrice();

		}
		double avg = sum / n;
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);

		/*
		 * Fazer um programa para ler um número inteiro N e os dados (nome epreço) de N
		 * Produtos. Armazene os N produtos em um vetor. Emseguida, mostrar o preço
		 * médio dos produtos.
		 */

	}
}
