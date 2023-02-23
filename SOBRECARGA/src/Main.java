public class Main {

    private static double baseMaior;
    private static double baseMenor;
    private static double altura;


    public static void main(String [] args){
        //Quadrilatero
        System.out.println("Quadrilatero");
        Quadrilatero.area(3);
        Quadrilatero.area(5d,5d);
        Quadrilatero.area(baseMaior = 7, baseMenor = 8, altura = 9);
        Quadrilatero.area(5f,5f);
    }



}
