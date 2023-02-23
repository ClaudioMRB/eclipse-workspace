package contaGit;

public class AplicacaoRendimento {
public static void main(String[] args) {

//criando conta 
	Conta minhaConta;
	minhaConta = new Conta();
	
	//alterando os valores de minhaConta
	minhaConta.dono = "Duke";
	minhaConta.saldo = 1000;
	
	//saca 200 reais
	minhaConta.saca(200);
	
	//deposita 500 reais
	minhaConta.deposita(20000);
	
	//imprime o saldo na tela
	System.out.println("Seu saldo atual é: R$" + minhaConta.saldo);
	
	//informa o rendimento da aplicação durante 1 mês ou 1 ano.
	System.out.println("Seu rendimento no mês é: R$" + minhaConta.saldo * 0.02);
	System.out.println("Seu rendimento anual é: R$" + minhaConta.saldo * 0.24);
  }
}
