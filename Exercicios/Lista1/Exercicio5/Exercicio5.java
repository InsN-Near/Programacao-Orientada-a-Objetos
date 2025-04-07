package Exercicios.Lista1.Exercicio5;

public class Exercicio5{
    public static void main(String[] args) {
        int numero = 5; // Você pode alterar este valor para calcular o fatorial de outro número
        long fatorial = calcularFatorial(numero);
        
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }

    public static long calcularFatorial(int n) {
        long resultado = 1; // Inicializa o resultado como 1
        int contador = 1; // Inicializa o contador

        // Loop while para calcular o fatorial
        while (contador <= n) {
            resultado *= contador; // Multiplica o resultado pelo contador
            contador++; // Incrementa o contador
        }

        return resultado; // Retorna o resultado final
    }
}
