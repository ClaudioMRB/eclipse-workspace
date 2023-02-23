public class Quadrilatero {
    /**
     * assinatura não muda, apenas os parâmetros mudam.
     * public static void area(double lado)
     *          Assinatura      (Parêmetro)
     */

    //método 1
    public static void area(double lado){

        System.out.println("Area do quadrado:" + lado*lado);
    }
    //método 2
    public static void  area(double lado1, double lado2) {
        System.out.println("Area do retangulo:" + lado1 * lado2);
    }
    //método 3
    public static void  area(double baseMaior, double baseMenor, double altura) {

        System.out.println("Area do trapezio:" + ((baseMaior+baseMenor)*altura) / 2);
    }
    public static void  area(float diagonal1, float diagonal2) {
        System.out.println("Area do losango:" + (diagonal1 * diagonal2) / 2);
    }


}
