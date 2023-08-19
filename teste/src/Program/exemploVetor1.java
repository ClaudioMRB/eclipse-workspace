package Program;

import java.util.Locale;
import java.util.Scanner;

public class exemploVetor1 {

	public static void main(String[] args) {
		// COMO DECLARAR E INSTANCIAR VETORES
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n = sc.nextInt();
		
		double[] vect = new double[n]; //CRIANDO VETOR N ELEMENTOS
		
		for (int i = 0; i<n; i++) {
			vect[i] = sc.nextDouble();
			
		}
		
		double sum = 0.0; //CRIAR VARIAVEL SOMA RECEBENDO ZERO
		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}
		double avg = sum / n;
		System.out.printf("Average height: %.2f", avg);
		
		
		sc.close();
		/*Fazer um programa para ler um número inteiro N e a altura de Npessoas.
		 *  Armazene as N alturas em um vetor. Em seguida, mostrar aaltura média 
		 *  dessas pessoas	
		 */
	}

}
