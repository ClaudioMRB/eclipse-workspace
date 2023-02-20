package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class Vetores {

	public static void main(String[] args) {
		
		//Manipulação de vetor de elementos tipo referência (classe)
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantos produtos sera cadastrado");
		int n = sc.nextInt();
		///vetor do tipo referencia
		Products[] vect = new Products[n];
		
		for(int i = 0; i < vect.length; i++) {
			
			System.out.println("Digite nome do produto " + (i+1));
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Digite preco do produto " + (i+1));
			double price = sc.nextDouble();
			vect[i] = new Products(name, price);
		}

		double sum = 0.0;
		for(int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
			
		}
		double avg = sum / n;
		System.out.println("Average price = " + String.format("%.2f", avg));
		
		sc.close();

	}

}
