package Exercicios.Lista5.Exercicio2;

public class Carro {
    private String marca;
    private String modelo;
    private String fabricante;
    private Motor motor;     
    private Bancos bancos;

    public Carro(String marca, String modelo, String fabricante, Motor motor, Bancos bancos) {
        this.marca = marca;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.motor = motor;
        this.bancos = bancos;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getTipoMotor() {
        if (this.motor != null) {
            return motor.getTipo();
        }
        return "Sem motor";
    }

    public Bancos getBancos() {
        return bancos;
    }
    
    public Motor getMotor() {
        return motor;
    }
}