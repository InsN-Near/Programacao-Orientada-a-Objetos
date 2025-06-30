package Exercicios.Lista7.Exercicios;

public class Exercicio7 {
    public static void main(String[] args) {
        int[][] matrizA = new int[3][3];
        int contador = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizA[i][j] = contador;
                contador++;
            }
        }

        System.out.println("Matriz A preenchida:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizA[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
