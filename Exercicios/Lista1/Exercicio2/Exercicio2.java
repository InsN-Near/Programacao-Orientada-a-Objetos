package Exercicios.Lista1.Exercicio2;

public class Exercicio2 {
    public static void main(String[] args) {
        // Declaração e inicialização das variáveis
        int numero1 = 10; // Primeiro número
        int numero2 = 5;  // Segundo número

        // Cálculos
        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        double divisao = (double) numero1 / numero2; // Casting para double para evitar divisão inteira

        // Impressão dos resultados
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
    }
}

