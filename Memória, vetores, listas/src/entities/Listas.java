package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {

		
			List<String> list = new ArrayList<>();
			list.add("Maria"); //• Inserir elemento na lista: add(obj), add(int, obj)
			list.add("Bob");
			list.add("Anna");
			list.add(2, "Marco"); //• Inserir elemento na lista: add(obj), add(int, obj)
			
			System.out.println(list.size()); //Tamanho da lista
			
			for (String x : list) {
			System.out.println(x);
			}
			System.out.println("---------------------");
			list.removeIf(x -> x.charAt(0) == 'M'); //Remover elementos da lista: remove(obj), remove(int), removeIf(Predicate)
			
			for (String x : list) {
			System.out.println(x);
			}
			System.out.println("---------------------");
			System.out.println("Index of Bob: " + list.indexOf("Bob")); //• Encontrar posição de elemento
			System.out.println("Index of Marco: " + list.indexOf("Marco")); //• Encontrar posição de elemento
			System.out.println("---------------------");
			List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); //• Filtrar lista com base em predicado
			
			for (String x : result) {
			System.out.println(x);
			}
			System.out.println("---------------------");
			String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null); //Encontrar primeira ocorrência com base em predicado
			System.out.println(name);
			}

	}


