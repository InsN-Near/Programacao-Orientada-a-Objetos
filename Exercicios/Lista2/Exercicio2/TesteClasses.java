package Exercicios.Lista2.Exercicio2;

public class TesteClasses {
    public static void main(String[] args) {
        Universidade universidade = new Universidade("Universidade Federal Caravelas", "São Paulo", "SP");
        Aluno aluno = new Aluno("Asael Torres Galindo", "Oceanografia");

        universidade.exibeDados();
        aluno.exibeDados();
    }
}

