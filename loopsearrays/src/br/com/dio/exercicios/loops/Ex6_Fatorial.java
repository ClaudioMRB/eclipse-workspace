package br.com.dio.exercicios.loops;

import java.util.Scanner;

/**
 * Faça um programa que calcule o fatorial de um numero,
 * inteiro fornecido pelo usuário.
 * Ex.: 5!= 120 (5 x 4 x 3 x 2 x 1) fatorial
 */


public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");

        int fatorial = scan.nextInt();
        int multiplicação = 1;

        System.out.println(fatorial + "i = ");

        for (int i = fatorial ; i >= 1 ; i = i - 1 ){
            multiplicação = multiplicação * i;

        }
        System.out.println(multiplicação);

    }

}
