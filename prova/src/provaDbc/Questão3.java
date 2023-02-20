package provaDbc;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.text.StyleContext.SmallAttributeSet;

public class Questão3 {
	public static int smallest(int arr[], int size_of_array) {
		int result = 0;
		int menor;
		for(int i = 0; i < size_of_array; i++) {
			int a = i;
			for(int j = 0; j < size_of_array - 1; j++) {
				if(arr[j] > arr[j+1]) {
					a = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = a;
				}
			}
		}
		return result = arr[0];
		
			
			
			
			
		
		
		
	
		
		
	}
	
		

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int size_of_array = 4;
		int[] arr = new int[size_of_array];
		
		arr[0] = 78;
		arr[1] =34;
		arr[2] = 55;
		arr[3] = 6;
		
		//for(int i = 0; i < arr.length; i++) {
		//	System.out.println("Digite o numero do vetor na posicao "+ i );
		//	arr[i] = scan.nextInt();
		//	}
		
		System.out.println("O menor numero do vetor e: " + smallest(arr, size_of_array));
		

	}

	

}
