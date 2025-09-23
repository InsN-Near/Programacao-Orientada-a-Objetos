package Exercicios.Lista18;

public class Sopro implements Instrumento {

    @Override
    public void tocar() {
        System.out.println("tocando instrumento sopro");
    }

    @Override
    public void nome() {
        System.out.println("Sopro");
    }

    @Override
    public void afinar() {
        System.out.println("afinando instrumento sopro");
    }
}
