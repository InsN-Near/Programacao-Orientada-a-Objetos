package Trabalhos.Cozinha;

public class Cozinha {
    private Geladeira geladeira;
    private Liquidificador liquidificador;
    private Microondas microondas;

    public Cozinha() {
        this.geladeira = new Geladeira();
        this.liquidificador = new Liquidificador();
        this.microondas = new Microondas();
    }

    public void ligar() {
        this.geladeira.ligar();
        this.liquidificador.ligar();
        this.microondas.ligar();
    }

    public void desligar() {
        this.geladeira.desligar();
        this.liquidificador.desligar();
        this.microondas.desligar();
    }

    public Geladeira getGeladeira() {
        return geladeira;
    }

    public Liquidificador getLiquidificador() {
        return liquidificador;
    }

    public Microondas getMicroondas() {
        return microondas;
    }
}
