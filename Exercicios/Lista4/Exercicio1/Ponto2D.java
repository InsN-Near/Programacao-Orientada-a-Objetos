package Exercicios.Lista4.Exercicio1;

public class Ponto2D {
    private double x;
    private double y;
    private static int contadorInstancias = 0;

    public Ponto2D() {
        this.x = 0.0;
        this.y = 0.0;
        contadorInstancias++;
    }

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
        contadorInstancias++;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public static int getContadorInstancias() {
        return contadorInstancias;
    }
}