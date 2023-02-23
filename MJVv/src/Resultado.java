import java.util.Locale;
import java.util.Scanner;

public class Resultado {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		String nome;
		Double nota1 = 0.0;

		System.out.print("Digite o nome do aluno: ");
		nome = scan.nextLine();
		System.out.print("Digite a nota do aluno: ");
		nota1 = scan.nextDouble();
		System.out.println();

		if (nota1 <= 7) {
			System.out.println("Aluno " + nome + " REPROVADO");
		} else {
			System.out.println("Aluno " + nome + " APROVADO");
		}

	}

}
