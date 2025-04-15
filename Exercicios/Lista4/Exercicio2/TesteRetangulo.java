package Exercicios.Lista4.Exercicio2;

public class TesteRetangulo {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo();
        Retangulo r2 = new Retangulo(3.0, 4.0);

        System.out.println("Retangulo 1:");
        r1.imprimirPerimetro();
        r1.imprimirArea();

        System.out.println("\nRetangulo 2:");
        r2.imprimirPerimetro();
        r2.imprimirArea();
    }
}
