package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Imposto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		Double rendaAnual = 0.0;
		Double prestServicos = 0.0;
		Double ganhoCapital = 0.0;
		Double gastosMedic = 0.0;
		Double gastosEduca = 0.0;
		Double rendaMensal = 0.0;
		
		Imposto x1, y1;
		
		System.out.println("Digite dados do 1 contribuinte ");
		List<Double> list1 = new ArrayList<Double>();
		System.out.print("Renda Anual com salário: ");
		list1.add(scan.nextDouble());
		System.out.print("Renda anual com prestação de serviço: ");
		list1.add(scan.nextDouble());
		System.out.print("Renda anual com ganho de capital: ");
		list1.add(scan.nextDouble());
		System.out.print("Gastos médicos: ");
		list1.add(scan.nextDouble());
		System.out.print("Gastos educacionais: ");
		list1.add(scan.nextDouble());
		
		
	/*	List<Double> list2 = new ArrayList<Double>();
		list2.add(rendaAnual);
		list2.add(prestServicos);
		list2.add(ganhoCapital);
		list2.add(gastosMedic);
		list2.add(gastosEduca);
		
		
		System.out.print("Quantos contribuintes você vai digitar? ");
		int n = scan.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.print("Renda anual com salario: ");
			rendaAnual = scan.nextDouble();
			System.out.print("Renda anual com prestação de serviços: ");
			prestServicos = scan.nextDouble();
			System.out.print("Renda anual com ganho de capital: ");
			ganhoCapital = scan.nextDouble();
			System.out.print("Gastos médicos: ");
			gastosMedic = scan.nextDouble();
			System.out.print("Gastos adicionais: ");
			gastosEduca = scan.nextDouble();
			
			
		}
		
		

		rendaMensal = rendaAnual / 12;

		System.out.println();
		System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");

		System.out.println();
		System.out.println("CONSOLIDADO DE RENDA ");

		if (rendaMensal <= 3000) {
			System.out.println("Isento de imposto");

		} else if (rendaMensal > 3000 && rendaMensal <= 5000) {
			Double imposto = rendaAnual * 0.1;
			System.out.printf("Imposto sobre sálario: R$%.2f", imposto);
			Double imposto1 = prestServicos * 0.15;
			System.out.printf("\nImposto sobre serviços: R$%.2f", imposto1);
			Double imposto2 = ganhoCapital * 0.2;
			System.out.printf("\nImposto sobre sálario: R$%.2f", imposto2);

			Double impTotal = imposto + imposto1 + imposto2;

			System.out.println();
			System.out.println("\nDEDUÇÕES ");
			Double deducao = impTotal * 0.3;
			System.out.printf("Máximo dedutível: R$%.2f", deducao);
			Double abater = gastosMedic + gastosEduca;
			System.out.printf("\nGastos dedutíveis: R$%.2f", abater);

			// maximo dedutivel maior que gastos dedutiveis
			if (deducao > abater) {
				System.out.println();
				System.out.println("\nRESUMO ");
				System.out.printf("Imposto bruto total: R$%.2f", impTotal);
				System.out.printf("\nAbatimento R$%.2f", abater);
				System.out.printf("\nImposto devido: R$%.2f", (impTotal - abater));

			} // maximo dedutivel menor que gastos dedutiveis
			if (deducao < abater) {
				System.out.println();
				System.out.println("\nRESUMO ");
				System.out.printf("Imposto bruto total: R$%.2f", impTotal);
				System.out.printf("\nAbatimento R$%.2f", deducao);
				System.out.printf("\nImposto devido: R$%.2f", (impTotal - deducao));

			}

		} else if (rendaMensal > 5000) {

			Double imposto = rendaAnual * 0.2;
			System.out.printf("Imposto sobre sálario: R$%.2f", imposto);
			Double imposto1 = prestServicos * 0.15;
			System.out.printf("\nImposto sobre serviços: R$%.2f", imposto1);
			Double imposto2 = ganhoCapital * 0.2;
			System.out.printf("\nImposto sobre sálario: R$%.2f", imposto2);

			Double impTotal = imposto + imposto1 + imposto2;

			System.out.println();
			System.out.println("\nDEDUÇÕES ");
			Double deducao = impTotal * 0.3; // maximo para abater
			System.out.printf("Máximo dedutível: R$%.2f", deducao);
			Double abater = gastosMedic + gastosEduca; // soma dos dedutiveis
			System.out.printf("\nGastos dedutíveis: R$%.2f", abater);

			// maximo dedutivel maior que gastos dedutiveis
			if (deducao > abater) {
				System.out.println();
				System.out.println("\nRESUMO ");
				System.out.printf("Imposto bruto total: R$%.2f", impTotal);
				System.out.printf("\nAbatimento R$%.2f", abater);
				System.out.printf("\nImposto devido: R$%.2f", (impTotal - abater));

			} // maximo dedutivel menor que gastos dedutiveis
			if (deducao < abater) {
				System.out.println();
				System.out.println("\nRESUMO ");
				System.out.printf("Imposto bruto total: R$%.2f", impTotal);
				System.out.printf("\nAbatimento R$%.2f", deducao);
				System.out.printf("\nImposto devido: R$%.2f", (impTotal - deducao));

			}

		}*/

	}

}