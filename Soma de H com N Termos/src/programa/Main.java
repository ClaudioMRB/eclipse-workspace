package programa;

//Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
//- new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
//- System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.util.Scanner;

public class Main {
	
	
 public static void main(String[] Args) {

	 double h = 0;
     Scanner sc = new Scanner(System.in);
     double n = sc.nextDouble();

     //for (int i = 1; i <= n; i++) {
     //TODO: Calcule o valor de H de forma que resulte na soma dos termos:
     while(n>0) {
       h = h+(1/n);
       n = n - 1;
     }
     System.out.print(Math.round(h));
}
}