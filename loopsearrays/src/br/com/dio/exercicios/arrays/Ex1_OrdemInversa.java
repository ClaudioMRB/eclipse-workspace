package br.com.dio.exercicios.arrays;

/**
 * crie um vetor de 6 numeros inteiros e mostre-os na ordem inversa.
 */

public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-5, -6, 15, 50, 8, 4};
        //System.out.println(vetor.length);

        System.out.print("vetor: ");
        int count = 0;
        while(count < (vetor.length)) {
            System.out.print(vetor[count] + " ");
            count++;
           }

        System.out.print("\nvetor: ");
        for(int i = (vetor.length - 1); 1 >= 0; i --){
            System.out.print(vetor[i] + " ");
        }
    }
}
