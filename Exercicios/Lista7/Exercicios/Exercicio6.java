package Exercicios.Lista7.Exercicios;

public class Exercicio6 {

    public static int soma(int... valores) {
        int resultado = 0;
        for (int valor : valores) {
            resultado += valor;
        }
        return resultado;
    }

    public static void main(String[] args) {
        int resultado1 = soma(5, 10);
        int resultado2 = soma(1, 2, 3, 4, 5);
        int resultado3 = soma(100);

        System.out.println("Resultado da primeira chamada: " + resultado1);
        System.out.println("Resultado da segunda chamada: " + resultado2);
        System.out.println("Resultado da terceira chamada: " + resultado3);
    }
}
