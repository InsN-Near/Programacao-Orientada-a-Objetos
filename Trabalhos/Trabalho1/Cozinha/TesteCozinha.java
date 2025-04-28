package Trabalhos.Trabalho1.Cozinha;

public class TesteCozinha {
    public static void main(String[] args) {
        Cozinha minhaCozinha = new Cozinha();

        System.out.println("--- Estado Inicial ---");
        System.out.println(minhaCozinha.getGeladeira().observar());
        System.out.println(minhaCozinha.getLiquidificador().observar());
        System.out.println(minhaCozinha.getMicroondas().observar());

        System.out.println("\n--- Ligando tudo ---");
        minhaCozinha.ligar();
        System.out.println(minhaCozinha.getGeladeira().observar());
        System.out.println(minhaCozinha.getLiquidificador().observar());
        System.out.println(minhaCozinha.getMicroondas().observar());
        System.out.println("Geladeira está ligada? " + minhaCozinha.getGeladeira().isLigado());

        System.out.println("\n--- Desligando tudo ---");
        minhaCozinha.desligar();
        System.out.println(minhaCozinha.getGeladeira().observar());
        System.out.println(minhaCozinha.getLiquidificador().observar());
        System.out.println(minhaCozinha.getMicroondas().observar());
        System.out.println("Liquidificador está ligado? " + minhaCozinha.getLiquidificador().isLigado());
    }
}
