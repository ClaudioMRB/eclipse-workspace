package Teste;

public class Main {
	public static void main(String[] args) {  //criando método main.
		System.out.println("Iniciando main");
		a();   // após imprimir na tela "iniciando método main", ele chama método a.
		System.out.println("finalizando main");
		
	}
		
		
	
		
		static void a() {   //criando método a
			System.out.println("Iniciando modulo A");
			b();  // após imprimir na tela "iniciando método A", ele chama método b.
			System.out.println("Finalizando modulo A");
			
		}
		
		static void b() {    //criando método b
			System.out.println("Iniciando modulo B");
			for(int i = 0; i <= 4; i++) System.out.println(i);
			c();  // após imprimir na tela "iniciando método B", ele chama método c.
			System.out.println("Finalizando modulo B");
			
			
		}
		
		static void c() {   //criando método c
			System.out.println("Iniciando modulo C");
			// após imprimir na tela "iniciando método C", caso naõ tenha mais parametros, ele volta finalizando metodos anteriores
			//e imprimindo na tela "Finalizando método X".
			System.out.println("Finalizando modulo C");
			
		}
		
		
		
		
		
	

}
