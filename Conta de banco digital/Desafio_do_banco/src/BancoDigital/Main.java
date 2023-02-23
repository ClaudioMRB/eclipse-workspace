package BancoDigital;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(500);
		cc.transferir(185, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}