package luanaADS;

public class Program {

	public static void main(String[] args) {

		Double a = 5.0, b = 10.0, c, soma = 0.0;
		soma = a + b;
		
		if(soma > 10){
			System.out.println("Soma  > 10\n");
			c = (double) -8;
			soma = a + c;
		}else {
			System.out.println("Soma  <= 10\n");
			c = (double) 5;
			a = (double) 2;
			soma = a - b + c;
		}
		b = (double) 7;
		
		if(soma >= 5){
			System.out.println("Soma  >= 5\n");
			a = (double) 3;
			soma = a + b - c;
			c = (double) 0;
		}else {
			System.out.println("Soma  < 5\n");
			a = (double) 1;
			soma = c - (a+b);
			
		}
		
		if(soma > 0){
			System.out.println("Soma  > 0\n");
			
		}else {
			System.out.println("Soma  < 0\n");
			
			
		}
		
		
		
	}



}
