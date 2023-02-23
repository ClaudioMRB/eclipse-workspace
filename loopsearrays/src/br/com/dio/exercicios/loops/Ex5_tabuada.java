package br.com.dio.exercicios.loops;

/**
 * desenvolver um gerador de tabuada,
 * capaz de gerar a tabuada de qaualquer numero inteiro entre 1 a 10
 * O usuario deve informar de qual numero ele deseja ver a tabuada.
 * A saida deve ser conforme o exemplo abaixo:
 * tabuada de 5
 * 5 x 1 = 5
 * 5 x 2 = 10
 * ...
 * 5 x 10 = 50
 */

import java.util.Scanner;


public class Ex5_tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");

        //Campo Váriaveis
        int tabuada = scan.nextInt();

        //___________________

        System.out.println("Tabuada de " + tabuada);

        //Campo laço
        for(int i = 1; i <= 10; i = i + 1) {
        System.out.println(tabuada + "X" + i + "=" + (tabuada*i));

        }



        //__________
    }


}
