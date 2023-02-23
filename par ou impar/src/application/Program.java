package application;

public class Program {

	public static void main(String[] args) {

		int n = 1000;
		int number = 0;
		for( int i = 0; i < n; i++) {
			
			if(number % 2 == 0) {
				System.out.println(number);
			}
			
			number += 1;
		}
		
	}

}
