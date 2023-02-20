package ordenacaoSelecao;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Program {
	
	private static void selectionSort(int[] v) {
		for (int i = 0; i <= 3; i++ ) {
			//int menor = i;
			int a = i;
			for(int j = 0 ; j <= 3 - i; j++) {
				if(v[j] > v[j + 1]) 
					 a = v[j];
				v[j] = v[j + 1];
				v[j + 1] = a;
				
				}
			//trocar(v, i, menor);
			}
																																
		}	
	
  //  private static void trocar(int[] v, int i, int menor) {
//		int aux = v[i];
//		v[i] = v[menor];
//		v[menor] = aux;
		
		
//	}
	
	public static int[] gerarVetor(int n) {
	int[] v = new int[n];
	v[0] = 2;
	v[1] = 1;
	v[2] = 4;
	v[3] = 3;
	v[4] = 0;
	//v[5] = 6;
	//v[6] = 5;
	//v[7] = 24;
	//v[8] = 6;
	//v[9] = 22;
	return v;
}
			
	public static void main(String[] args) {																																																											
		Scanner scan = new Scanner(System.in);
		int quantVetor = 5;
		int[] v = gerarVetor(quantVetor);
		
		

	
		
	/*for(int i = 0; i < quantVetor; ++i) {
		System.out.println("Digite " + (i+1) + " numero: ");
		v[i] = scan.nextInt();
	
	}*/

	
	selectionSort(v);
	System.out.println(Arrays.toString(v));
	
	}
		
	}
		

