package Trabalhos.Cozinha;

public class Microondas {
    private boolean ligado;

    public Microondas() {
        this.ligado = false;
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    public boolean isLigado() {
        return this.ligado;
    }

    public String observar() {
        if (this.ligado) {
            return "Microondas ligado";
        } else {
            return "Microondas desligado";
        }
    }
}
