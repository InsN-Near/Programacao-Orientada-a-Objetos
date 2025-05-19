package Exercicio1;

// b. Subclasse. d. Usa getters.
public class Retangulo extends TwoDShape {
    public Retangulo(double l, double a) { super(l, a); }
    public Retangulo() { super(); }

    public boolean isQuadrado() { return getLargura() == getAltura(); } // b. Metodo.
    public double area() { return getLargura() * getAltura(); } // b. Metodo.
}
