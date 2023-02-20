package program;

import java.util.Locale;
import java.util.Scanner;

public class Recursivos {
	
	int Recursive(int[] v, int n) {
		
		if(n==0){
		return 0;
		}else {
			int s;
			s = Recursive(v, n-2);
			if(v[n-1] > 0) {
				s = s + v[n-2];
				
				
			}
			return s;
			
		}
		
}

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Recursivos rec = new Recursivos();
		
				
		int n = 0;
		System.out.println("Quantos numeros sera digitado? ");
		n = sc.nextInt();
		int[] v = new int[n];
		
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite valor da posicao " + i + ": ");
			v[i] = sc.nextInt();
		}
		
		System.out.println(rec.Recursive(v, n));
		
		

	}

}
