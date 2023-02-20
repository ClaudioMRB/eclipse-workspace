package Multivix;

import java.util.Scanner;


public class Fibonaci {
	
//		    	|0,					se n = 0;
//			F(n)|1,					se n = 1;
//    			|F(n-1) + F(n-2)	outros casos
	
//Usando função recursiva 
	static int fibonacci(int n) {
	
		if(n == 1 || n == 2) {
		
			return 1;
		}
		else {
			return n = n * (n-1)/ 2 + 1;
			//return fibonacci(n-1) + fibonacci(n-2);
			
		
		}
	}
	
	static int chamada(int n) {
		int cf = 0;
		if(cf == -1) {
			return 1;
		}
		return cf = (n - 1) + (n - 2) + 1;
	}

	public static void main(String[] args) {

Scanner leitor = new Scanner(System.in);
int numero;
System.out.println("Digite numero: ");
numero = leitor.nextInt();

System.out.println("numero fibonacci " + fibonacci(numero));
/*for(int i = 1; i <= numero; i++) {

	System.out.println("numero fibonacci " + fibonacci(i));
	System.out.println("chamada " + chamada(i));
	
	
}*/

	}

}
