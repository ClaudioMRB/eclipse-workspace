package Teste;

public class Main {
	public static void main(String[] args) {  //criando m�todo main.
		System.out.println("Iniciando main");
		a();   // ap�s imprimir na tela "iniciando m�todo main", ele chama m�todo a.
		System.out.println("finalizando main");
		
	}
		
		
	
		
		static void a() {   //criando m�todo a
			System.out.println("Iniciando modulo A");
			b();  // ap�s imprimir na tela "iniciando m�todo A", ele chama m�todo b.
			System.out.println("Finalizando modulo A");
			
		}
		
		static void b() {    //criando m�todo b
			System.out.println("Iniciando modulo B");
			for(int i = 0; i <= 4; i++) System.out.println(i);
			c();  // ap�s imprimir na tela "iniciando m�todo B", ele chama m�todo c.
			System.out.println("Finalizando modulo B");
			
			
		}
		
		static void c() {   //criando m�todo c
			System.out.println("Iniciando modulo C");
			// ap�s imprimir na tela "iniciando m�todo C", caso na� tenha mais parametros, ele volta finalizando metodos anteriores
			//e imprimindo na tela "Finalizando m�todo X".
			System.out.println("Finalizando modulo C");
			
		}
		
		
		
		
		
	

}
