package programa;

//Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
//- new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
//- System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.util.*;

public class Main{

	public static void main(String[] args) {

	    Scanner scan = new Scanner(System.in);
  
	    System.out.println("Insira o preco de custo: ");
	    int custoFabrica = scan.nextInt();
	    System.out.println("Insira o preco a porcentagem do distribuidor: ");
	    int porcentagemDistribuidor = scan.nextInt();
	    System.out.println("Insira o percentual de imposto: ");
	    int PercentualImpostos = scan.nextInt();

        int custoConsumidor;
  
         int Distribuidor;
         int ValorImpostos;

     // TODO: Implemente uma condição que calcule a porcentagem do distribuidor e dos impostos:

     Distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
     custoConsumidor = (custoFabrica * PercentualImpostos)/100 + Distribuidor + custoFabrica;

     System.out.println(custoConsumidor);
	}
}