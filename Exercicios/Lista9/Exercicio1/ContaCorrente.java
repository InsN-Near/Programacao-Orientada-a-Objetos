package Exercicios.Lista9.Exercicio1;

public class ContaCorrente {
    private double saldo;
    private double taxaOperacao;

    public ContaCorrente(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double quantia) {
        if (quantia > 0) {
            this.saldo += quantia;
        }
    }

    public void sacar(double quantia) {
        double taxa = this.calcularTaxaSobreSaque(quantia);
        if (quantia > 0 && (this.saldo >= (quantia + taxa))) {
            this.saldo -= (quantia + taxa);
            this.taxaOperacao = taxa;
        } else {
            System.out.println("Saldo insuficiente para o saque.");
            this.taxaOperacao = 0;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double getTaxaDeOperacao() {
        return this.taxaOperacao;
    }
    
    protected double calcularTaxaSobreSaque(double valorSaque) {
        return valorSaque * 0.005; 
    }
}
