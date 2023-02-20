package ordenacaoShellSort;

public class Program {
	
	public static int[] vetorSelection = {64,25,12,22,11};

	public static void main(String[] args) {

	Ordenacao order = new Ordenacao();
	System.out.println("ordenado: " + order.selectionSort(vetorSelection));
	
		
		
	}

}
