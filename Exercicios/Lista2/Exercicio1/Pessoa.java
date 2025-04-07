package Exercicios.Lista2.Exercicio1;

public class Pessoa {
    private String nome;
    private String telefone;

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public void exibeDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
    }
}
