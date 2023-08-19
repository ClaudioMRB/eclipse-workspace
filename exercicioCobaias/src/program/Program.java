package program;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		int totalCobaias = 0, somaRatos = 0, somaSapos = 0, somaCoelhos = 0, quantCobaias, quantCasos;
		Character tipoCobaias;
		Double porcentCoelhos = 0.0, porcentRatos = 0.0, porcentSapos = 0.0;
		
		System.out.print("Quantos casos de teste serão digitados? ");
		quantCasos = sc.nextInt();
		
		for(int i = 0; i < quantCasos; i++) {
		System.out.print("Quantidade de cobaias: ");
		quantCobaias = sc.nextInt();
		System.out.println("Digite o tipo de cobia: ");
		tipoCobaias = sc.next().charAt(0);
		
		if(tipoCobaias == 'C') {
			somaCoelhos += quantCobaias;
		}else if(tipoCobaias == 'R') {
			somaRatos += quantCobaias;
		}else if(tipoCobaias == 'S') {
			somaSapos += quantCobaias;
		}else {
			System.out.println("Digite apenas R:Rato S:Sapo C:Coelho: ");
		}
		
		
		
		}
		
		totalCobaias = somaCoelhos + somaRatos + somaSapos;
		porcentCoelhos = (double) somaCoelhos/totalCobaias*100;
		porcentRatos = (double) somaRatos/totalCobaias*100;
		porcentSapos = (double) somaSapos/totalCobaias*100;
		System.out.println("Relatório final: ");
		System.out.println();
		System.out.println("Total: " + totalCobaias + " cobaias");
		System.out.println("Total de coelhos: " + somaCoelhos);
		System.out.println("Total de ratos: " + somaRatos);
		System.out.println("Total de sapos: " + somaSapos);
		System.out.println();
		System.out.printf("Percentual de coelhos: %.2f%%", porcentCoelhos);
		System.out.printf("\nPercentual de ratos: %.2f%%", porcentRatos);
		System.out.printf("\nPercentual de sapos: %.2f%%", porcentSapos);
		
		
	}
}
