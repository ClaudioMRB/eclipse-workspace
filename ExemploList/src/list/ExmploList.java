package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExmploList {

	public static void main(String[] args) {
		
		List<Double> notas = new ArrayList<>();
		
		notas.add(7.0);
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5.0);
		notas.add(7.0);
		notas.add(0.0);
		notas.add(3.6);
		System.out.println(notas);
		System.out.println();
		System.out.println("Exiba a posicao da nota 5.0: " + notas.indexOf(5.0));
		System.out.println();
		System.out.println("Adicionar na lista a nota 8.0 na posicao 4 ");
		notas.add(4, 8.0);
		System.out.println(notas);
		System.out.println();
		System.out.println("Substitua a nota 5.0 pela nota 6.0 ");
		notas.set(3, 6.0);
		System.out.println(notas);
		System.out.println();
		System.out.println("Confira se a nota 5.0 esta na lista: " + notas.contains(5.0));
		System.out.println();
		System.out.println("exiba todas as notas na ordem em que foram informados: ");
		for(Double nota : notas) System.out.println(nota);
		System.out.println();
		System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
		System.out.println(notas.toString());
		System.out.println();
		System.out.println("Exiba a menor nota: " + Collections.min(notas));
		System.out.println();
		System.out.println("Exiba a maior nota: " + Collections.max(notas));
		System.out.println();
		System.out.println("Exiba a soma dos valores: ");
		Iterator<Double> iterator = notas.iterator(); // para realizar a soma tem que chamar o metodo interator.
		Double soma = 0d;
		while(iterator.hasNext()) { 
			Double next = iterator.next();
			soma += next;
		}
		System.out.println(soma);
		System.out.println();
		System.out.println("Exiba a media das notas: " + (soma/notas.size()));
		System.out.println();
		System.out.println("Remova a nota 0: ");
		notas.remove(0d);
		System.out.println(notas);
		System.out.println();
		System.out.println("Remova a nota na posicao 0: ");
		notas.remove(0);
		System.out.println(notas);
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
		System.out.println("Apague toda a lista: ");
		notas.clear();
		System.out.println(notas);
		System.out.println();
		System.out.println("Confira se a lista esta vazia: " + notas.isEmpty());
	}

}
