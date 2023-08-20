package program;

import java.util.Scanner;

public class JurosCompostos {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        JurosCompostos jc = new JurosCompostos();
        //M=C(1+i)^t
		
		double capital=sc.nextDouble();
        double taxa =sc.nextDouble();
		int tempo=sc.nextInt();
		

        System.out.printf("Valor final do investimento: R$%.2f", jc.taxaComposta(capital, tempo, taxa));
       
    }

    public double taxaComposta(double capital, int tempo, double taxa){
        double taxa1 = 1+taxa/100;

        return Math.pow(taxa1, tempo)*capital;
        
    }
    
}
