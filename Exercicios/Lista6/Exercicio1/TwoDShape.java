package Exercicio1;

// c. Atributos private. d. Getters/Setters.
public class TwoDShape {
    private double largura;
    private double altura;

    // d. Construtores. a. Atributos eram package-private.
    public TwoDShape(double l, double a) {
        this.largura = l;
        this.altura = a;
    }
    public TwoDShape() { this.largura = 0.0; this.altura = 0.0; }

    public double getLargura() { return largura; }
    public void setLargura(double largura) { this.largura = largura; }
    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    public void mostraDim() {
        System.out.println("Largura e altura = " + largura + " e " + altura);
    }
}
