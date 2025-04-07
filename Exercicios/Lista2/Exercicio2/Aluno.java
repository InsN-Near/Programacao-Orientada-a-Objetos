package Exercicios.Lista2.Exercicio2;

public class Aluno {
    private String nome;
    private String curso;

    public Aluno(String nome, String curso) {
        this.nome = nome;
        this.curso = curso;
    }

    public void exibeDados() {
        System.out.println("Nome do Aluno: " + nome);
        System.out.println("Curso: " + curso);
    }
}

