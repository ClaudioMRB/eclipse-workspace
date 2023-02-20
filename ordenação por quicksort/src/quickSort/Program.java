package quickSort;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
		//vetor
		int[] v = {64,25,12,22,11};
		//chamando o quicksort passando o vetor, o inicio do vetor e o tamanho
		quicksort(v, 0, v.length - 1);
		System.out.println(Arrays.toString(v));
	}

	//criação metodo quicksort
	private static void quicksort(int[] v, int esq, int dir) {
		//a recursividade irá continuar enquanto o esquerdo for menor que o direito
		if(esq < dir) {
			//execução do algoritmo de separar o vetor, joga valores menores que o pivo para esquerda e os maiores para direita
			int j = separar(v, esq, dir);
			quicksort(v, esq, j-1);
			quicksort(v, j+1, dir);
		}
		
	}

	//criação metodo separar
	private static int separar(int[] v, int esq, int dir) {
		//i começa a esquerda
		int i = esq+1;
		//j começa a direita
		int j = dir;
		//pivo vai ser o elemento mais a esquerda
		int pivo = v[esq];
		//repetição responsavel pelas separaçoes
		while(i <= j) {
			if(v[i] <= pivo) i++;
			else if(v[j] > pivo) j--;
			else if(i <= j) {
				//chama o metodo que troca as posicoes
				trocar(v, i, j);
				i++;
				j--;
			}
		}
		trocar(v, esq, j);
		return j;
	}
	//metodo que troca posicoes
	private static void trocar(int[] v, int i, int j) {
		//aux grava vetor na posicao i
		int aux = v[i];
		//vetgor na posicao i recebe valor do vetor na posicao j
		v[i] = v[j];
		//vetor na posicao j recebe valor gravado inicialmente por aux
		v[j] = aux;
	}

}
