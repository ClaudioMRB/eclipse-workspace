package exercicios;

import java.util.Scanner;

public class Ex2_filme {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//System.out.println("Digite valor d: ");
		double d = scan.nextDouble();
		//double d = Double.parseDouble(scan.nextLine());	
		//System.out.println("Digite Valor x: ");
		double x = scan.nextDouble();
		//double x = Double.parseDouble(scan.nextLine());	
		//Double Ex2_filme;
		double a = Math.abs(d - x);
		double y = a / d * 100;
		String message = String.format("%.2f", y);		
		System.out.println(message + "%");
		scan.close();
	}
}	
	
	
	

	  