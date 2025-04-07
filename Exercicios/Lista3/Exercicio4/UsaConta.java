package Exercicios.Lista3.Exercicio4;


public class UsaConta {

    public static void main(String[] args) {

        Conta conta1 = new Conta(1000.00);
        Conta conta2 = new Conta(150.00);

        System.out.println("--- Saldos Iniciais ---");
        System.out.printf("Saldo da Conta1: R$ %.2f\n", conta1.getSaldo());
        System.out.printf("Saldo da Conta2: R$ %.2f\n", conta2.getSaldo());
        System.out.println("-----------------------\n");

        double qtdeDebitoConta1_1 = 250.50;
        System.out.printf("Tentando debitar R$ %.2f da conta1...\n", qtdeDebitoConta1_1);
        conta1.debitar(qtdeDebitoConta1_1);
        System.out.printf("Saldo atual da Conta1: R$ %.2f\n", conta1.getSaldo());
        System.out.printf("Saldo atual da Conta2: R$ %.2f\n", conta2.getSaldo());
        System.out.println("-----------------------\n");

        double qtdeDebitoConta2_1 = 100.00;
        System.out.printf("Tentando debitar R$ %.2f da conta2...\n", qtdeDebitoConta2_1);
        conta2.debitar(qtdeDebitoConta2_1);
        System.out.printf("Saldo atual da Conta1: R$ %.2f\n", conta1.getSaldo());
        System.out.printf("Saldo atual da Conta2: R$ %.2f\n", conta2.getSaldo());
        System.out.println("-----------------------\n");

        double qtdeDebitoConta1_2 = 800.00;
        System.out.printf("Tentando debitar R$ %.2f da conta1 (deve exceder o saldo)...\n", qtdeDebitoConta1_2);
        conta1.debitar(qtdeDebitoConta1_2);
        System.out.printf("Saldo atual da Conta1: R$ %.2f\n", conta1.getSaldo());
        System.out.printf("Saldo atual da Conta2: R$ %.2f\n", conta2.getSaldo());
        System.out.println("-----------------------\n");

        double qtdeDebitoConta2_2 = 50.01;
        System.out.printf("Tentando debitar R$ %.2f da conta2 (deve exceder o saldo)...\n", qtdeDebitoConta2_2);
        conta2.debitar(qtdeDebitoConta2_2);
        System.out.printf("Saldo atual da Conta1: R$ %.2f\n", conta1.getSaldo());
        System.out.printf("Saldo atual da Conta2: R$ %.2f\n", conta2.getSaldo());
        System.out.println("-----------------------\n");

        double qtdeDebitoConta2_3 = 50.00;
        System.out.printf("Tentando debitar R$ %.2f da conta2 (saldo exato)...\n", qtdeDebitoConta2_3);
        conta2.debitar(qtdeDebitoConta2_3);
        System.out.printf("Saldo atual da Conta1: R$ %.2f\n", conta1.getSaldo());
        System.out.printf("Saldo atual da Conta2: R$ %.2f\n", conta2.getSaldo());
        System.out.println("-----------------------\n");

        double qtdeDebitoConta1_3 = -100.00;
        System.out.printf("Tentando debitar R$ %.2f da conta1 (valor negativo)...\n", qtdeDebitoConta1_3);
        conta1.debitar(qtdeDebitoConta1_3);
        System.out.printf("Saldo atual da Conta1: R$ %.2f\n", conta1.getSaldo());
        System.out.printf("Saldo atual da Conta2: R$ %.2f\n", conta2.getSaldo());
        System.out.println("-----------------------\n");

        System.out.println("--- Saldos Finais ---");
        System.out.printf("Saldo Final da Conta1: R$ %.2f\n", conta1.getSaldo());
        System.out.printf("Saldo Final da Conta2: R$ %.2f\n", conta2.getSaldo());
        System.out.println("---------------------");
    }
}
