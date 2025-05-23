package Trabalhos.Trabalho1.Cozinha;

public class Liquidificador {
    private boolean ligado;

    public Liquidificador() {
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
            return "Liquidificador ligado";
        } else {
            return "Liquidificador desligado";
        }
    }
}
