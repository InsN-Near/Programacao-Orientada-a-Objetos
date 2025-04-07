package Exercicios.Lista3.Exercicio1;

public class TestaLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");

        System.out.println("Informações Iniciais do Livro 1:");
        livro1.imprimirDetalhes();

        Livro livro2 = new Livro("Summa Theologiae", "Tommaso d'Aquino");
        System.out.println("\nInformações Iniciais do Livro 2:");
        livro2.imprimirDetalhes();

        livro1.setTitulo("O Hobbit");
        System.out.println("\nInformações Modificadas do Livro 1:");
        livro1.imprimirDetalhes();

        livro2.setTitulo("Summa Contra Gentiles");
        System.out.println("\nInformações sobre o Livro 2:");
        livro2.imprimirDetalhes();

        System.out.println("\nAcessando informações do Livro 2 com Getters:");
        System.out.println("Título: " + livro2.getTitulo());
        System.out.println("Autor: " + livro2.getAutor());
    }
}


