package program;

import java.util.Scanner;

/**
 * faça um programa que peça N numeros inteiros, calcule e mostre a quantidade
 * de numeros pares e a quantidade de numeros impares.
 */

public class Ex4_ParEImpar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // Iniciar programa

		int quantNumeros;
		int numero = 0;
		int quantPares = 0, quantImpares = 0;
		int count = 0;

		System.out.println("Digite um numero: ");
		numero = scan.nextInt();

		System.out.println();
		if (numero % 2 == 0 && numero < 0) {
			System.out.println("Par negativo");
		}else if(numero % 2 == 0 && numero > 0) {
			System.out.println("Par positivo");
		}else if(numero % 2 != 0 && numero < 0){
			System.out.println("Impar negativo");
		}else if(numero % 2 != 0 && numero > 0){
			System.out.println("Impar positivo");
		}else if(numero == 0) {
			System.out.println("Nulo");
		}

	}	
		}

	


