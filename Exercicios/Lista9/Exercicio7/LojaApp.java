package Exercicios.Lista9.Exercicio7;

public class LojaApp {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[5];

        produtos[0] = new CD("Que país é este", 14.9, 9);
        produtos[1] = new DVD("Matrix", 24.9, 90);
        produtos[2] = new Livro("O Senhor dos Anéis", 50.0, "Tolkien");
        produtos[3] = new Livro("Categorias", 39.9, "Aristóteles");
        produtos[4] = new DVD("Inception", 29.9, 100);

        for (Produto p : produtos) {
            System.out.println(p);
        }
    }
}
