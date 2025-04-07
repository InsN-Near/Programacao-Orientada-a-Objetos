package Exercicios.Lista2.Exercicio2;

public class Universidade {
    private String nome;
    private String cidade;
    private String estado;

    public Universidade(String nome, String cidade, String estado) {
        this.nome = nome;
        this.cidade = cidade;
        this.estado = estado;
    }

    public void exibeDados() {
        System.out.println("Nome da Universidade: " + nome);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
    }
}

