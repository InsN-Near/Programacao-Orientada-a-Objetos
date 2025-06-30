package Exercicios.Lista7.Exercicios;

public class Exercicio3 {
    public static void main(String[] args) {
        double[] valores = {8.5, 9.0, 7.5, 10.0, 6.0};
        double soma = 0;

        for (int i = 0; i < valores.length; i++) {
            soma += valores[i];
        }

        double media = soma / valores.length;

        System.out.println("A média dos 5 números é: " + media);
    }
}
