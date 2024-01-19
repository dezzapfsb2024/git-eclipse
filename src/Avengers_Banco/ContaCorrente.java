package Avengers_Banco;


public class ContaCorrente extends ContaBancaria {
	
	double limite = -100.0;
	//sobrescreve o metodo sacar permitindo que use ate 100 reais de limite
	@Override
	public void sacar(double valor) {
		 double novoSaldo = getSaldo() - valor;
	        if (novoSaldo >= limite) {
	            setSaldo(novoSaldo);
	        } else {
	            System.out.println("Saldo insuficiente.");
	        }
	}
}
