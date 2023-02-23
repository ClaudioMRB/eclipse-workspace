package one.digitalinnovation.basecamp;

public class Main {

    private static int baseMaior;
private static int baseMenor;
private static int altura;

    public static void main(String [] args) {

        //Retorno
        double areaQuadrado = Quadrilateros.area( 3);
        System.out.println("Area quadrado:" + areaQuadrado);

        double areaRetangulo = Quadrilateros.area (5, 5);
        System.out.println("Area Retangulo:" + areaRetangulo);

        double areaTrapezio = Quadrilateros.area(baseMaior = 7, baseMenor = 8, altura = 9);
        System.out.println("Area Trapezio:" + areaTrapezio);


    }

}
