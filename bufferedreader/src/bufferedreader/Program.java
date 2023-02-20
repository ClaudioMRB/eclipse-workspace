package bufferedreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int quant;
		double valor;
		char letra;
		String nome;

		try {
			System.out.print("Introduza um numero: ");
			quant = Integer.parseInt(br.readLine());
			System.out.print("Introduza um valor: ");
			valor = Double.parseDouble(br.readLine());
			System.out.print("Introduza um caractere: ");
			letra = br.readLine().charAt(0);
			System.out.print("Introduza um nome: ");
			nome = br.readLine();
			System.out.println(String.format("O numero digitado e: %d", quant)+ "\n" + String.format("O valor e: %.2f", valor)
			+ "\n" + (letra)
			+ "\n" + String.format("O nome digitado: %s", nome));
			
		}catch(IOException e) {
			
		System.out.println(e);
		}finally {
			System.out.println();
			System.out.println("Obrigado por utilizar nosso app!");
		}
		
		
		
		
	}

}
