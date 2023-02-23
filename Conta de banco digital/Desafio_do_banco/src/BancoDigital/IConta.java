package BancoDigital;

public interface IConta {
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, IConta contaDestino);
	
	//void rendimento(double rentabilidade);
	
	void imprimirExtrato();
}