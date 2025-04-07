package Exercicios.Lista3.Exercicio4;

public class Conta {
    private double saldo;

    public Conta(double saldoInicial) {
        if (saldoInicial > 0.0)
            saldo = saldoInicial;
        else
            saldo = 0.0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void creditar(double quantia) {
        if (quantia > 0.0) { 
           saldo += quantia;
        }
    }

 
    public void debitar(double quantia) {
        if (quantia <= 0.0) {
            System.out.println("Valor de débito deve ser positivo.");
        } else if (quantia > saldo) {
            System.out.println("Quantia de débito excedeu o saldo da conta.");
        } else {
            saldo -= quantia;
            System.out.printf("Débito de R$ %.2f realizado com sucesso.\n", quantia);
        }
    }
}
