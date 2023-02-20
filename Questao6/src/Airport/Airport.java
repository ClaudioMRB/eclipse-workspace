package Airport;

import java.util.Scanner;

public class Airport {
	Scanner scan = new Scanner(System.in);
	
	int runways_required () {
		
		int n_of_planes = 0;
		
		for(int i = 0; i <= 5000; i++ ) {
			int[] arrival_time = new int[i];
			int[] departure_time = new int[i];

		System.out.print("Digite a hora de chegada: ");
		arrival_time[i] = scan.nextInt();
		System.out.print("Digite a hora de saida: ");
		departure_time[i] = scan.nextInt();
		
		n_of_planes = arrival_time.length;
		
		}
		return n_of_planes;
		
		
				
	}

	public static void main(String[] args) {
Airport ar = new Airport();

		




	
	
	
	
	
	
	


		
	
	System.out.println(ar.runways_required());
		
	}

}
