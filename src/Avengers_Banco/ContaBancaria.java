package Avengers_Banco;

import java.util.Random;

public class ContaBancaria {
    private int numeroAgencia;
    private int numeroConta;
    private double saldo;

    //construtor
    public ContaBancaria() {
        this.numeroAgencia = 1001;
        this.numeroConta = gerarNumeroConta();
        this.saldo = 0.0;
    }
    
    //gerar número aleatorio para a conta
    private int gerarNumeroConta() {
        Random random = new Random();
        return random.nextInt(1000000); // gera um número aleatório de 0 a 999999
    }
    
    public void depositar(double valor) {
        saldo += valor;
    }
    
    //Realiza a operação se o saldo final for maior ou igual a zero
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
    
    //retorna saldo
    public double getSaldo() {
        return saldo;
    }
    
    //atualiza saldo
    public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
    
    //retorna o valor da conta
    public int getNumeroConta() {
        return numeroConta;
    }
    //recupera o valor do numero da agencia
    public int getNumeroAgencia() {
        return numeroAgencia;
    }
    //Gera uma nova conta Bancaria
    public static ContaBancaria criarNovaConta() {
        return new ContaBancaria();
    }
}