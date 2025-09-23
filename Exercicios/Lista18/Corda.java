package Exercicios.Lista18;

public class Corda implements Instrumento {

    @Override
    public void tocar() {
        System.out.println("tocando instrumento corda");
    }

    @Override
    public void nome() {
        System.out.println("Corda");
    }

    @Override
    public void afinar() {
        System.out.println("afinando instrumento corda");
    }
}
