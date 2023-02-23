import java.util.Locale;
import java.util.Scanner;


public class Calculadora {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		

		

		
		
	

	}
}
 class Soma{
	 Scanner scan;
	 Character x = ' ';
		Character y = ' ';
	 
	 while (x == 's') {
			
			if (x == 's') {
				System.out.print("Deseja executar quais operacoes (*, /, + ou -)?  ");
				y = scan.next().charAt(0);
				System.out.println();
			}
			while (x == 's' && y == '+') {
				System.out.print("Digite primerio valor:  ");
				Double num1 = scan.nextDouble();
				System.out.print("Digite o segundo valor:  ");
				Double num2 = scan.nextDouble();

				System.out.println();
				System.out.printf("Resultado %.2f \n", num1 + num2);

				System.out.println();
				System.out.print("Deseja fazer um novo calculo (s/n)?  ");
				x = scan.next().charAt(0);
				System.out.println();
			}
			while (x == 's' && y == '-') {
				System.out.print("Digite primerio valor:  ");
				Double num1 = scan.nextDouble();
				System.out.print("Digite o segundo valor:  ");
				Double num2 = scan.nextDouble();

				System.out.println();
				System.out.printf("Resultado %.2f \n", num1 - num2);

				System.out.println();
				System.out.print("Deseja fazer um novo calculo (s/n)?  ");
				x = scan.next().charAt(0);
				System.out.println();
			}
			while (x == 's' && y == '*') {
				System.out.print("Digite primerio valor:  ");
				Double num1 = scan.nextDouble();
				System.out.print("Digite o segundo valor:  ");
				Double num2 = scan.nextDouble();

				System.out.println();
				System.out.printf("Resultado %.2f \n", num1 * num2);

				System.out.println();
				System.out.print("Deseja fazer um novo calculo (s/n)?  ");
				x = scan.next().charAt(0);
				System.out.println();
			}
			while (x == 's' && y == '/') {
				System.out.print("Digite primerio valor:  ");
				Double num1 = scan.nextDouble();
				System.out.print("Digite o segundo valor:  ");
				Double num2 = scan.nextDouble();

				System.out.println();
				System.out.printf("Resultado %.2f \n", num1 / num2);

				System.out.println();
				System.out.print("Deseja fazer um novo calculo (s/n)?  ");
				x = scan.next().charAt(0);
				System.out.println();
			}
		}
	
	 System.out.print("Deseja usar a calculadora (s/n)?  ");
		x = scan.next().charAt(0);
		System.out.println();
}
 }
