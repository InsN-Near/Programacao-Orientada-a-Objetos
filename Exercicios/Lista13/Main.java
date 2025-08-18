package Exercicios.Lista13;

public class Main {
    public static void main(String[] args) {
        Baralho meuBaralho = new Baralho();

        meuBaralho.embaralhar();

        System.out.println("Distribuindo 5 cartas do baralho:");
        for (int i = 0; i < 5; i++) {
            Carta cartaComprada = meuBaralho.comprar();
            if (cartaComprada != null) {
                System.out.println(cartaComprada);
            } else {
                System.out.println("O baralho acabou!");
                break;
            }
        }

        System.out.println();

        System.out.println("Cartas restantes no baralho: " + meuBaralho.cartasRestantes());
    }
}
