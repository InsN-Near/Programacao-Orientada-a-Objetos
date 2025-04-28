package Trabalhos.Portaria;

public class PortaAutomatica {
    private boolean ligado;

    public PortaAutomatica() {
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
            return "Porta Automática ligada";
        } else {
            return "Porta Automática desligada";
        }
    }
}