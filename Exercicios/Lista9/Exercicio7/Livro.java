package Exercicios.Lista9.Exercicio7;

public class Livro extends Produto {
    private String autor;

    public Livro(String nome, double preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }

    @Override
    public String toString() {
        return super.toString() + "; Autor: " + this.autor;
    }
}
