package program;

import java.util.Scanner;

public class EquilibrandoSaldo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		EquilibrandoSaldo equi = new EquilibrandoSaldo();
		
		double saldoAtual;
		double valorDeposito;
		double valorRetirada;
		
		saldoAtual = sc.nextDouble();
		valorDeposito = sc.nextDouble();
		valorRetirada = sc.nextDouble();
		
		System.out.printf("Saldo atualizado na conta: %.1f", equi.sacar(saldoAtual,valorDeposito, valorRetirada));
	
	
}
	public double depositar(double saldo, double deposito) {
		return saldo += deposito;
	}
	
	public double sacar(double saldo, double deposito, double retirada) {
		double saldoAtual =saldo + deposito;
		return saldoAtual -= retirada;
	}
}