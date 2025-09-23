package Exercicios.Lista18;

public class SoproMadeira extends Sopro {

    @Override
    public void tocar() {
        System.out.println("tocando instrumento sopro de madeira");
    }

    @Override
    public void nome() {
        System.out.println("Sopro de Madeira");
    }

    @Override
    public void afinar() {
        System.out.println("afinando instrumento sopro de madeira");
    }
}
