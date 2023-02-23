package br.com.dio.exercicios;

import java.util.Scanner;


public class Circulo {
    private double raio; // guarda o raio atual do círculo

    public Circulo(double raio) { // construtor que recebe o valor do raio como argumento
        this.raio = raio;
    }


    public static void main(String[] args) {

        // vamos criar uma instância da classe Circulo

        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o raio do círculo: ");
        double raio= Double.parseDouble(entrada.nextLine());
        double circulo;
        Circulo c = new Circulo(raio);

        // vamos mostrar o valor do raio atual
        System.out.println("Raio: " + c.getRaio());

        // vamos mostrar a área
        //System.out.println("Área: " + c.getArea() + " metros quadrados");
System.out.format("A = %.4f", c.getArea());
        // vamos mostrar a circunferência
       // System.out.println("Circunferência: " + c.getCircunferencia() + " metros");

    }

    // obtém a circunferência do círculo
  //  public double getCircunferencia(){
    //    double circunferencia = (2 * Math.PI) * this.raio;
    //    return circunferencia;
  //  }
    public double getArea(){
        double area = 3.14159 * Math.pow(this.raio, 2);
        return area;
    }
    public double getRaio(){ // permite obter o raio do círculo
        return raio;
    }







    }

