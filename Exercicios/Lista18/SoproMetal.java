package Exercicios.Lista18;

public class SoproMetal extends Sopro {

    @Override
    public void tocar() {
        System.out.println("tocando instrumento sopro de metal");
    }

    @Override
    public void nome() {
        System.out.println("Sopro de Metal");
    }

    @Override
    public void afinar() {
        System.out.println("afinando instrumento sopro de metal");
    }
}
