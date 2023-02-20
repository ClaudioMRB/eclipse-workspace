package ordenacaoInsercao;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Program {
	

	private static void selectionSort(int[] v) {
		int x, j;
		for(int i = 1; i < v.length; i++) {
			x = v[i];
			j = i - 1;
			while((j >= 0) && v[j] > x) {
				v[j+1] = v[j];
				j = j - 1;
			}
			v[j + 1] = x;
 }																																
}	
	
    private static void trocar(int[] v, int i, int menor) {
		int aux = v[i];
		v[i] = v[menor];
		v[menor] = aux;
		
		
	}
	
	public static int[] gerarVetor(int n) {
		int [] v = new int[n];
		v[0] = 2;
		v[1] = 1;
		v[2] = 4;
		v[3] = 3;
		v[4] = 0;
		//Random gerador = new Random();
		//for(int i = 0; i < n; i++) {
		//	v[i] = gerador.nextInt(100);
		//}
		return v;
	
}
			
	public static void main(String[] args) {																																																											
		Scanner scan = new Scanner(System.in);
		int quantVetor = 6;
		int[] v = gerarVetor(6);
		
		
		
		
	/*for(int i = 0; i < quantVetor; ++i) {
		System.out.println("Digite " + (i+1) + " numero: ");
		v[i] = scan.nextInt();
	
	}*/
	selectionSort(v);
	System.out.println(Arrays.toString(v));
		
	}
		
	}
		

