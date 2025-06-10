package Exercicios.Lista11.Exercicio3;

public class ClienteEspecial extends Cliente {
    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.80;
    }
}
