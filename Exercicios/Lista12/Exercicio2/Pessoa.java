package Exercicios.Lista12.Exercicio2;

public class Pessoa {
    String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa: " + this.nome;
    }
}
