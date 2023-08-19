package Exercicios;
import java.util.Scanner;

/**
 * faça um programa que peça N numeros inteiros,
 * calcule e mostre a quantidade de numeros pares
 * e a quantidade de numeros impares.
 */

public class Ex4_ParEImpar {
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);  //Iniciar programa

         
         int quantNumeros;       
         int numero = 0;
         int quantPares = 0, quantImpares = 0;
         int count = 0;

         System.out.println("Quantidade de numeros: ");
          quantNumeros = scan.nextInt();


                    
                    do {
                        System.out.println("Numero: ");
                            numero = scan.nextInt();
                            System.out.println();
                            if (numero % 2 == 0) { 
                        	quantPares++; 
                        }else { 
                        
                        	quantImpares++;
                        }
                        count++; 
                    }   while(count < quantNumeros);


                     System.out.println("Quantidade Par: " + quantPares);
                     System.out.println("Quantidade Impar: " + quantImpares);



         
    }




		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


