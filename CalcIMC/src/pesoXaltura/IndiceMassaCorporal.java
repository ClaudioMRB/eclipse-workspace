package pesoXaltura;

import java.util.Locale;
import java.util.Scanner;

public class IndiceMassaCorporal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double altura, imc, peso;
		
		System.out.print("Digite seu peso: ");
		peso = sc.nextDouble();
		System.out.print("Digite sua altura: ");
		altura = sc.nextDouble();
		imc = (peso) / (altura * altura);
		System.out.println();
		System.out.println("O seu imc e " + String.format("%.2f", imc));
		
		sc.close();
	}

}
