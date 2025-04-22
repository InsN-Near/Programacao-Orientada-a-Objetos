package Exercicios.Lista5.Exercicio3;

public class Carro {
    private String marca;
    private String modelo;
    private String fabricante;
    private Motor motor; 

    public Carro(String marca, String modelo, String fabricante, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.motor = motor;
    }

    @Override
    public String toString() {
        return fabricante + " " + marca + " " + modelo + " " + motor;
    }

}
