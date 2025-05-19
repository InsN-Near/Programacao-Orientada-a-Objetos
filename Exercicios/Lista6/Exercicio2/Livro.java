package Exercicio2;

// a. Classe Livro herda Produto.
public class Livro extends Produto {
    private String autor;
    private int paginas;

    // a. Construtor.
    public Livro(int paginas, String autor, double preco, String nome) {
        super(nome, preco); this.autor = autor; this.paginas = paginas;
    }

    // a. Metodo ehExtenso(). c. Livro: paginas > 100.
    public boolean ehExtenso() { return this.paginas > 100; }
    public boolean ehExtenso(int limitePaginas) { return this.paginas > limitePaginas; } // b. Overload.

    @Override // b. Overriding.
    public void mostrarDetalhes() {
        System.out.println("Livro: " + super.nome + ", Autor: " + this.autor + ", Preco: R$" + String.format(" " + this.paginas);
    }
    @Override // b. Overriding. c. Livro: preco > 50.0.
    public boolean ehCaro() { return this.preco > 50.0; }
}
