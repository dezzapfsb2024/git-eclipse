package Avengers_Banco;


public class ContaPoupanca extends ContaBancaria{
	
	double juros = 0.005;
	// retorna o rendimento previsto de acordo com saldo atual 
	public double rendimento() {
		double valor = getSaldo();
		return valor * juros;		 
	}
}
