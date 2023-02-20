package ordenacaoShellSort;

import java.util.Arrays;

import javax.swing.undo.AbstractUndoableEdit;

public class Ordenacao {
	
	public String selectionSort(int[] array) {
		for(int i = 0; i < array.length - 1; i++) {
			int indexMinimo = i;
			for(int j = i + 1; j < array.length; j++) {
				if (array[j] < array[indexMinimo]) {
					indexMinimo = j;
				}
			}
			int auxiliar = array[indexMinimo];
			array[indexMinimo] = array[i];
			array[i] = auxiliar;
		}
		return Arrays.toString(array);
	}

}
