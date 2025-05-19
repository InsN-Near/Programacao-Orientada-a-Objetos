package Exercicio2;

// a. Classe Produto, atributos protected.
public class Produto {
    protected String nome;
    protected double preco;

    public Produto(String nome, double preco) { this.nome = nome; this.preco = preco; } // a. Construtor.
    public Produto(String nome) { this.nome = nome; this.preco = 0.0; } // b. Overload construtor.

    // a. Metodo ehCaro(). c. Produto: preco > 100.0.
    public boolean ehCaro() { return this.preco > 100.0; }

    public void mostrarDetalhes() { System.out.println("Produto: " + this.nome + ", Preco: R$" + String.format(".2f", this.preco)); } // b. Pode ser overridden.

    public void aplicarDesconto(double percentual) { this.preco -= this.preco * (percentual / 100.0); } // b. Overload.
    public void aplicarDesconto(double valorFixo, boolean ehValorFixo) {
        if (ehValorFixo) { this.preco -= valorFixo; if (this.preco < 0) this.preco = 0; } 
        else { aplicarDesconto(valorFixo); }
    }
}
