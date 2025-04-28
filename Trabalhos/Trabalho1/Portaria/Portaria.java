package Trabalhos.Trabalho1.Portaria;

public class Portaria {
    private PortaoEletronico portaoEletronico;
    private CameraSeguranca cameraSeguranca;
    private PortaAutomatica portaAutomatica;

    public Portaria() {
        this.portaoEletronico = new PortaoEletronico();
        this.cameraSeguranca = new CameraSeguranca();
        this.portaAutomatica = new PortaAutomatica();
    }

    public void ligar() {
        this.portaoEletronico.ligar();
        this.cameraSeguranca.ligar();
        this.portaAutomatica.ligar();
    }

    public void desligar() {
        this.portaoEletronico.desligar();
        this.cameraSeguranca.desligar();
        this.portaAutomatica.desligar();
    }

    public PortaoEletronico getPortaoEletronico() {
        return portaoEletronico;
    }

    public CameraSeguranca getCameraSeguranca() {
        return cameraSeguranca;
    }

    public PortaAutomatica getPortaAutomatica() {
        return portaAutomatica;
    }
}
