package Trabalhos.Trabalho2;

public class Veiculo {
    private String modelo;
    private double preco;

    public Veiculo(String n, double p) {
        this.modelo = n;
        this.preco = p;
    }

    public double getPreco() {
        return this.preco;
    }

    public void printDados() {
        System.out.println("-- Dados do Veiculo --");
        System.out.println("Modelo: " + this.modelo);
    }
}
