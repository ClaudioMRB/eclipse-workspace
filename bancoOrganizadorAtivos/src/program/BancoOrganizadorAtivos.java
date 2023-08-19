package program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BancoOrganizadorAtivos {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    ArrayList < String > ativos = new ArrayList < > ();

	    //Entrada dos tipos de ativos
	    int quantidadeAtivos = scanner.nextInt();

	    // Entrada dos c�digos dos ativos
	    for (int i = 0; i <= quantidadeAtivos; i++) {
	      String codigoAtivo = scanner.nextLine();
	      ativos.add(codigoAtivo);
	    }

     Collections.sort(ativos);

	 for(String x : ativos){
		System.out.println(x);
	 }
	   
	   //System.out.3println(ativos);
	   scanner.close();
	}
}