package Program;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		List<Double> salario = new ArrayList<>();
		List<String> funcionario = new ArrayList<>();

		System.out.print("Digite o nome do funcionario!");
		String name1 = scan.nextLine();
		funcionario.add(name1);
		System.out.print("Digite o salario:");
		Double num1 = scan.nextDouble();
		salario.add(num1);
		System.out.println();
		System.out.print("Digite o nome do funcionario!\n");
		String name2 = scan.nextLine();
		funcionario.add(name2);
		System.out.print("\nDigite o salario:");
		Double num2 = scan.nextDouble();
		salario.add(num2);
		System.out.println();
		System.out.print("Digite o nome do funcionario!");
		String name3 = scan.nextLine();
		funcionario.add(name3);
		System.out.print("Digite o salario:");
		Double num3 = scan.nextDouble();
		salario.add(num3);
		
		
		
		for(int i = 0; i < 3 ; i++) {
			if(salario.get(i) > 100) {
				System.out.printf("funcionario %d \nSalario %.2f \n", salario.get(i), funcionario.get(i));
			}
			
		}
		
		
	
		

	}
}
