package Exercicios.Lista12.Exercicio1;
public class Produto {
    String nome;
    double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return String.format("Produto: %s, Valor: R$ %.2f", this.nome, this.valor);
    }
}