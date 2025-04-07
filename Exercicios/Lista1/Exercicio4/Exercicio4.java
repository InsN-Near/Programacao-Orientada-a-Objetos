package Exercicios.Lista1.Exercicio4;

public class Exercicio4 {
    public static void main(String[] args) {
        int soma = 0; // Variável para armazenar a soma

        // Loop para imprimir os números de 1 a 10 e calcular a soma
        for (int i = 1; i <= 10; i++) {
            System.out.println(i); // Imprime o número atual
            soma += i; // Adiciona o número atual à soma
        }

        // Impressão da soma total
        System.out.println("A soma dos números de 1 a 10 é: " + soma);
    }
}

