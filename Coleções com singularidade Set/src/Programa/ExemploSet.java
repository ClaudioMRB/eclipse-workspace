package Programa;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {

	public static void main(String[] args) {

		//Dada uma lista com 7 notas de aluno [7, 8.5, 9.3,, 5, 7, 0, 3.6], faça:
		
		//Set notas = new HashSet(); //antes do java 5
		//Set<Double> notas = new HashSet<>(); //generics(jdk 5) - Diamond operator(jdk 7)
		//HashSet<Double> notas = new HashSet<>();
		//Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
		//Set<Double> notas = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
		//notas.add(1d);
		//notas.remove(5d);
		//System.out.println(notas);
		
		System.out.println("Crie um conjunto e adicione as notas: ");
		Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
		System.out.println("As notas criadas foram: " + notas);
		System.out.println();
		System.out.println("Exiba a posicao da nota 5.0: ");
		System.out.println("quando estiver trabalhando com SET nao tem como fazer busca pela posicao, \nprincipalmente no HashSet pq fica de forma aleatoria e nao tem metodos Get");
		System.out.println();
		System.out.println("Adicione na lista a nota 8.0 na posicao 4: ");
		System.out.println("Nao tem como trabalhar com posicao dentro de um Set ");
		System.out.println();
		System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
		System.out.println("Nao tem como fazer a substituicao pois nao tem metodo set ");
		System.out.println();
		System.out.println("Confira se a nota 5.0 esta no conjunto: ");
		System.out.println("A nota 5.0 esta no conjunto? " + notas.contains(5.0));
		System.out.println();
		System.out.println("Exiba a terceira nota adicionada: ");
		System.out.println("Nao tem como fazer a exibicao pois nao tem metodo Get ");
		System.out.println();
		System.out.println("Exiba a menor nota: " + Collections.min(notas));
		System.out.println();
		System.out.println("Exiba a maior nota: " + Collections.max(notas));
		System.out.println();
		System.out.println("Exiba a soma dos valores: ");
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0.0;
		while(iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}
		System.out.println("A soma dos valores e: " + String.format("%.2f", soma));
		System.out.println();
		System.out.println("Media das notas ");
		System.out.println("A media e: " + String.format("%.2f", soma/notas.size()));
		System.out.println();
		System.out.println("Remova a nota 0: ");
		notas.remove(0d);
		System.out.println(notas);
		System.out.println();
		System.out.println("Remova a nota da posicao 0: ");
		System.out.println("quando estiver trabalhando com SET nao tem como fazer remocao pela posicao");
		System.out.println();
		System.out.println("Remova as notas menores que 7 e exiba a lista: ");
		Iterator<Double> iterator1 = notas.iterator();
		while(iterator1.hasNext()) {
			Double next = iterator1.next();
			if(next < 7) {
				iterator1.remove();
			}
		}

		System.out.println(notas);
		System.out.println();
		System.out.println("Exiba as notas na ordem que foram informados: ");
		Set<Double> notas2 = new LinkedHashSet<>();
		notas2.add(7d);
		notas2.add(8.5);
		notas2.add(9.3);
		notas2.add(5d);
		notas2.add(7d);
		notas2.add(0d);
		notas2.add(3.6);
		System.out.println(notas2);
		System.out.println("O LinkedHashSet nao permite numeros repetidos ");
		System.out.println();
		System.out.println("Exiba todas as notas em ordem crescente: ");
		Set<Double> notas3 = new TreeSet<Double>(notas2);
		System.out.println(notas3);
		System.out.println();
		System.out.println("Apague todo o conjunto: ");
		notas.clear();
		notas2.clear();
		notas3.clear();
		System.out.println("confira se o conjunto esta vazio: " + notas.isEmpty());
		System.out.println("confira se o conjunto esta vazio: " + notas2.isEmpty());
		System.out.println("confira se o conjunto esta vazio: " + notas3.isEmpty());
		System.out.println();
		System.out.println("Foi trabalhado implementacoes HashSet, LinkedHashSet e TreeSet. ");
}		
}