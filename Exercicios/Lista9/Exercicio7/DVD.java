package Exercicios.Lista9.Exercicio7;

public class DVD extends Produto {
    private int duracao;

    public DVD(String nome, double preco, int duracao) {
        super(nome, preco);
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return super.toString() + "; Duração: " + this.duracao + " mins";
    }
}
