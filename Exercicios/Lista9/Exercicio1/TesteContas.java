package Exercicios.Lista9.Exercicio1;

public class TesteContas {
    public static void main(String[] args) {
        System.out.println("--- Testando Conta Corrente Comum ---");
        ContaCorrente contaComum = new ContaCorrente(1000.0);
        System.out.println("Saldo inicial: " + contaComum.getSaldo());
        
        contaComum.sacar(200.0);
        System.out.println("Taxa do saque de R$200: " + contaComum.getTaxaDeOperacao());
        System.out.println("Saldo final: " + contaComum.getSaldo());

        System.out.println("\n--- Testando Conta Corrente Especial ---");
        ContaEspecial contaEspecial = new ContaEspecial(1000.0);
        System.out.println("Saldo inicial: " + contaEspecial.getSaldo());

        contaEspecial.sacar(200.0);
        System.out.println("Taxa do saque de R$200: " + contaEspecial.getTaxaDeOperacao());
        System.out.println("Saldo final: " + contaEspecial.getSaldo());
    }
}
