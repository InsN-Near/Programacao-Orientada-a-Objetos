package Exercicios.Lista7.Exercicios;

public class Exercicio5 {
    public static void main(String[] args) {
        int[] array = {2, 15, 25, 30, 48, 50, 77, 80, 91, 100};
        int x = 50;

        System.out.println("Analisando o array...");

        encontrarMaiorDiferenca(array);
        verificarOrdem(array);
        compararComX(array, x);
    }

    public static void encontrarMaiorDiferenca(int[] arr) {
        int maiorDiferenca = -1;
        int pos1 = -1;
        int pos2 = -1;

        for (int i = 0; i < arr.length - 1; i++) {
            int diferencaAtual = arr[i+1] - arr[i];
            if (diferencaAtual < 0) {
                diferencaAtual = -diferencaAtual;
            }

            if (diferencaAtual > maiorDiferenca) {
                maiorDiferenca = diferencaAtual;
                pos1 = i;
                pos2 = i + 1;
            }
        }
        System.out.println("a) Maior diferença: " + maiorDiferenca + " entre as posições " + pos1 + " (" + arr[pos1] + ") e " + pos2 + " (" + arr[pos2] + ")");
    }

    public static void verificarOrdem(int[] arr) {
        boolean crescente = true;
        boolean decrescente = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1]) {
                crescente = false;
            }
            if (arr[i] < arr[i+1]) {
                decrescente = false;
            }
        }

        System.out.print("b) O array está em ordem: ");
        if (crescente) {
            System.out.println("Crescente");
        } else if (decrescente) {
            System.out.println("Decrescente");
        } else {
            System.out.println("Não ordenado");
        }
    }

    public static void compararComX(int[] arr, int x) {
        int maiores = 0;
        int menores = 0;
        int iguais = 0;

        for (int valor : arr) {
            if (valor > x) {
                maiores++;
            } else if (valor < x) {
                menores++;
            } else {
                iguais++;
            }
        }
        System.out.println("c) Em relação a X (" + x + "):");
        System.out.println("   Maiores que X: " + maiores);
        System.out.println("   Menores que X: " + menores);
        System.out.println("   Iguais a X: " + iguais);
    }
}
