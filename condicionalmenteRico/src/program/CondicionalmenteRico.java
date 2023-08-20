package program;

import java.util.Scanner;

public class CondicionalmenteRico {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		CondicionalmenteRico equi = new CondicionalmenteRico();
		
		int saldoAtual;
		//double valorDeposito;
		int valorRetirada;
		
		saldoAtual = sc.nextInt();
		//valorDeposito = sc.nextDouble();
		valorRetirada = sc.nextInt();
		
		if(saldoAtual >= valorRetirada) {
			System.out.print("Saque realizado com sucesso! \nNovo saldo:"+ 
			equi.sacar(saldoAtual, valorRetirada));
		}else {
			System.out.print("Saldo insuficiente. Saque não realizado!");
		}
		
	
	
}
	public double depositar(double saldo, double deposito) {
		return saldo += deposito;
	}
	
	public int sacar(int saldo, int retirada) {
		int saldoAtual =saldo;
		return saldoAtual -= retirada;
		
	}
}