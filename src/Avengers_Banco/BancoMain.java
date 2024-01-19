package Avengers_Banco;

import java.util.Scanner;

public class BancoMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        ContaCorrente cc = new ContaCorrente(); //instanciando a classe corrente
        ContaPoupanca cp = new ContaPoupanca(); //instanciando a classe poupanca
        
        //iniciando variaveis
        double valorDeposito = 0.0;
        double valorSaque = 0.0;
        double saldo = 0.0;

        int opcao;
        do {
        	//Menu
        	System.out.println("----------------------------------------------");
        	System.out.println("            Banco Avengers                    ");
        	System.out.println("----------------------------------------------");
            System.out.println("Selecione uma opção:");
            System.out.println("1. Criar Conta [Poupança]");
            System.out.println("2. Depositar [Poupança]");
            System.out.println("3. Sacar  [Poupança]");
            System.out.println("4. Verificar saldo  [Poupança]");
            System.out.println("5. Criar Conta [Corrente]");
            System.out.println("6. Depositar [Corrente]");
            System.out.println("7. Sacar  [Corrente]");
            System.out.println("8. Verificar saldo  [Corrente]");
            System.out.println("9. Redimento Mensal  [Poupança]");
            System.out.println("0. Sair");
            System.out.println("----------------------------------------------");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Conta Poupança criada com sucesso");
                    System.out.println("Agência: " + cp.getNumeroAgencia());
                    System.out.println("Número da Conta: " + cp.getNumeroConta());
                    System.out.println("");
                    break;
                case 2:
                	System.out.println("Digite o valor a ser depositado:");
                    valorDeposito = scanner.nextDouble();
                    cp.depositar(valorDeposito);
                    System.out.println("Depósito realizado com suceso!");
                    System.out.println("Saldo atual conta poupança: R$" + cp.getSaldo());
                    System.out.println("");
                    break;
                case 3:
                	System.out.println("Digite o valor a ser sacado:");
                    valorSaque = scanner.nextDouble();
                    cp.sacar(valorSaque);
                    System.out.println("Saldo atual conta poupança: R$" + cp.getSaldo());
                    System.out.println("");
                    break;	
                case 4:
                	saldo = cp.getSaldo();
                    System.out.println("Saldo atual conta poupança: R$" + saldo);
                    System.out.println("");
                    break;
                case 5:              	
                    System.out.println("Conta Corrente criada com sucesso!");
                    System.out.println("Agência: " + cc.getNumeroAgencia());
                    System.out.println("Número da Conta: " + cc.getNumeroConta());
                    System.out.println("");
                    break;
                case 6:
                	System.out.println("Digite o valor a ser depositado:");
                    valorDeposito = scanner.nextDouble();
                    cc.depositar(valorDeposito);
                    System.out.println("Depósito realizado com suceso!");
                    System.out.println("Saldo atual conta corrente: R$" + cc.getSaldo());
                    System.out.println("");
                    break;
                case 7:
                	System.out.println("Digite o valor a ser sacado:");
                    valorSaque = scanner.nextDouble();
                    cc.sacar(valorSaque);
                    System.out.println("Saldo atual conta corrente: R$" + cc.getSaldo());
                    System.out.println("");
                    break;
                case 8:
                    saldo = cc.getSaldo();
                    System.out.println("Saldo atual conta corrente:  R$" + saldo);
                    System.out.println("");
                    break;
                case 9:
                    System.out.println("De acordo com o saldo da sua poupança, final do mês você receberá o valor de R$" + cp.rendimento() + " em juros");
                    System.out.println("");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    System.out.println("Obrigado por confiar no Banco Avengers!!!!");
                    System.out.println("----------------------------------------------");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0); //Quando o valor de entrada for zero o programa é finalizado

        scanner.close();
    }

}
