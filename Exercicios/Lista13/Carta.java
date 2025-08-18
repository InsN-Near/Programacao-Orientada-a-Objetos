package Exercicios.Lista13;

public class Carta {
    private final Naipe naipe;
    private final Valor valor;

    public Carta(Naipe naipe, Valor valor) {
        this.naipe = naipe;
        this.valor = valor;
    }
    
    @Override
    public String toString() {
        return valor.getNomeExibicao() + " DE " + naipe.name();
    }
}