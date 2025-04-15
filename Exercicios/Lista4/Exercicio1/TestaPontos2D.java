package Exercicios.Lista4.Exercicio1;

public class TestaPontos2D {
    public static void main(String[] args) {
        System.out.println("Instancias antes: " + Ponto2D.getContadorInstancias());

        Ponto2D ponto1 = new Ponto2D();
        Ponto2D ponto2 = new Ponto2D(3.5, 5.0);

        System.out.println("Ponto 1: (" + ponto1.getX() + ", " + ponto1.getY() + ")");
        System.out.println("Ponto 2: (" + ponto2.getX() + ", " + ponto2.getY() + ")");

        System.out.println("Instancias depois: " + Ponto2D.getContadorInstancias());
    }
}
