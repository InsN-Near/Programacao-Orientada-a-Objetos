package Trabalhos.Trabalho1.Portaria;

public class PortaoEletronico {
    private boolean ligado;

    public PortaoEletronico() {
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
            return "Portão Eletrônico ligado";
        } else {
            return "Portão Eletrônico desligado";
        }
    }
}
