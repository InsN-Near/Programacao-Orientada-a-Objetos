package Exercicios.Lista4.Exercicio2;

public class Retangulo {
    private double comprimento;
    private double largura;

    public Retangulo() {
        this.comprimento = 1.0;
        this.largura = 1.0;
    }

    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double calcularPerimetro() {
        return 2 * (this.comprimento + this.largura);
    }

    public double calcularArea() {
        return this.comprimento * this.largura;
    }

    public void imprimirPerimetro() {
        System.out.println("Perimetro: " + calcularPerimetro());
    }

    public void imprimirArea() {
        System.out.println("Area: " + calcularArea());
    }
}