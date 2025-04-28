package Trabalhos.Trabalho1.Portaria;

public class CameraSeguranca {
    private boolean ligado;

    public CameraSeguranca() {
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
            return "Câmera de Segurança ligada";
        } else {
            return "Câmera de Segurança desligada";
        }
    }
}