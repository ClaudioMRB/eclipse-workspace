package br.com.dio.exercicios.loops;
/**
 * faça um programa que leia 5 numeros
 * e informe o maior numero
 * e a media desses numeros
 */

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//Variaveis
        int numero;
        int maior = 0;
        int soma = 0; //tirar media

        int count = 0;//variavel vai aumentando 1 unidae desde que complete 5 uidades
//Repetição
        do {
            System.out.println("Numero: ");

            numero = scan.nextInt();

            soma = soma + numero;
            System.out.println("Soma: " + soma);

            if (numero > maior) maior = numero; //referente a variavel maior.
            count = count + 1; //contar quantas veses vai se repetir
        //int soma = 0; //tirar media
        } while(count < 5); // true ou false

        //int soma = 0; //tirar media
        System.out.println("Maior: " + maior);
        System.out.println("Media: " + (soma/5));




    }



}
