package Exercicios.Lista18;

public class Percussao implements Instrumento {

    @Override
    public void tocar() {
        System.out.println("tocando instrumento percussao");
    }

    @Override
    public void nome() {
        System.out.println("Percussao");
    }

    @Override
    public void afinar() {
        System.out.println("afinando instrumento percussao");
    }
}
