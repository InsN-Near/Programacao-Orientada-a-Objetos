package Exercicios.Lista9.Exercicio1;

public class ContaEspecial extends ContaCorrente {
    
    public ContaEspecial(double saldoInicial) {
        super(saldoInicial);
    }
    
    @Override
    protected double calcularTaxaSobreSaque(double valorSaque) {
        return valorSaque * 0.001;
    }
}
