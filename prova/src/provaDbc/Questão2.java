package provaDbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Questão2 {

	public static void main(String[] args) throws IOException {
		Questão2 que = new Questão2();

		System.out.println(String.format("O valor total e: R$%.2f", BufferedReader(null)));
		System.out.println();
		System.out.println("Obrigado por utilizar nosso app!");

	}

	private static double BufferedReader(InputStreamReader inputStreamReader) {

		Locale.setDefault(Locale.US);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int quant;
		int id;
		double valorTotal = 0;

		try {

			System.out.print("Introduza o id: ");
			id = Integer.parseInt(br.readLine());
			System.out.print("Introduza a quantidade: ");
			quant = Integer.parseInt(br.readLine());
			

			if (id == 1) {
				double valor = 50.00;
				valorTotal = valor * quant;
			if(valorTotal >= 5000) {
					System.out.print(String.format("O valor total e: R$%.2f",  valorTotal));
				}else {
					System.out.print(String.format("O valor total e: R$%.2f", valorTotal));
				}
			}
				if (id == 2) {
					double valor1 = 100.00;
					valorTotal = valor1 * quant;
					if(valorTotal >= 5000) {
						valorTotal = valorTotal - (valorTotal*0.1);
					}else {
						valorTotal = valorTotal - (valorTotal*0.1);
					}
				}
		
		}catch (IOException e) {

			System.out.println(e);
		} finally {
			
		}
		
		return valorTotal;
		

	}

	
}
