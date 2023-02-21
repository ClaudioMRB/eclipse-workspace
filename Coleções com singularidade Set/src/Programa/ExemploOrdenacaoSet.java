package Programa;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;

/*Dadas as seguintes informaçõles sobre minhas series favoritas,
 * crie um conjunto e ordene este conjunto exibindo:
 * ](nome - genero - tempo de episodio):
 * 
 * Série 1 = nome: Got, genero: Fantasia, tempoEpisodio: 60
 * Série 2 = nome: Dark, genero: Drama, tempoEpisodio: 60
 * Série 3 = nome: That '70s show, genero: Comédia, tempoEpisodio: 25
 */

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

import Programa.Serie.ComparatorNomeGeneroTempoEpisodio;

public class ExemploOrdenacaoSet {

	public static void main(String[] args) {
		
		System.out.println("Ordem aleatoria");
		Set<Serie> minhasSeries = new HashSet<>();
		minhasSeries.add(new Serie("Got", "Fantasia", 60));
		minhasSeries.add(new Serie("Dark", "Drama", 60));
		minhasSeries.add(new Serie("That '70s show", "Comedia", 25));
		for(Serie serie : minhasSeries) {
			System.out.println(serie.getNome() + " _ " + 
		serie.getGenero() + " _ " + serie.getTempoEpisodio());
		}
		System.out.println();
		System.out.println("Ordem de insercao");
		Set<Serie> minhasSeries1 = new LinkedHashSet<>();
		minhasSeries1.add(new Serie("Got", "Fantasia", 60));
		minhasSeries1.add(new Serie("Dark", "Drama", 60));
		minhasSeries1.add(new Serie("That '70s show", "Comedia", 25));
		for(Serie serie : minhasSeries1) {
			System.out.println(serie.getNome() + " _ " + 
		serie.getGenero() + " _ " + serie.getTempoEpisodio());
		}
		System.out.println();
		System.out.println("Ordem natural (tempoEpisodio");
		Set<Serie> minhasSeries2 = new TreeSet<>();
		minhasSeries2.add(new Serie("Got", "Fantasia", 60));
		minhasSeries2.add(new Serie("Dark", "Drama", 60));
		minhasSeries2.add(new Serie("That '70s show", "Comedia", 25));
		for(Serie serie : minhasSeries2) {
			System.out.println(serie.getNome() + " _ " + 
		serie.getGenero() + " _ " + serie.getTempoEpisodio());
		}
		System.out.println();
		System.out.println("Ordem por nome/genero/tempoEpisodio");
		Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
		minhasSeries3.add(new Serie("Got", "Fantasia", 60));
		minhasSeries3.add(new Serie("Dark", "Drama", 60));
		minhasSeries3.add(new Serie("That '70s show", "Comedia", 25));
		for(Serie serie : minhasSeries3) {
			System.out.println(serie.getNome() + " _ " + 
		serie.getGenero() + " _ " + serie.getTempoEpisodio());
		}
	}

}
class Serie implements Comparable<Serie>{
	private String nome;
	private String genero;
	private Integer tempoEpisodio;
	
	public Serie(String nome, String genero, Integer tempoEpisodio) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.tempoEpisodio = tempoEpisodio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Integer getTempoEpisodio() {
		return tempoEpisodio;
	}

	public void setTempoEpisodio(Integer tempoEpisodio) {
		this.tempoEpisodio = tempoEpisodio;
	}

	@Override
	public String toString() {
		return "Serie [nome=" + nome + ", genero=" + genero + ", tempoEpisodio=" + tempoEpisodio + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, genero, tempoEpisodio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Serie serie = (Serie) obj;
		return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
	}

	@Override
	public int compareTo(Serie serie) {
		int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
		if(tempoEpisodio != 0) {
			return tempoEpisodio;
		}else {
		return this.genero.compareTo(serie.genero);
		}
}
}
class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie> {

	@Override
	public int compare(Serie s1, Serie s2) {
		int nome = s1.getNome().compareTo(s2.getNome());
		if(nome != 0) {
			return nome;
		}
		int genero = s1.getGenero().compareTo(s2.getGenero());
		if(genero != 0) {
			return genero;
		}else {
			return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
			}
		
		}
	}

	
