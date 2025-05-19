package Exercicios.Lista5.Exercicio1;

public class Usuario {
    private String nome;
    private int matricula;
    private Dispositivo dispositivo;

    public Usuario(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
        this.dispositivo = null;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setDispositivo(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void trabalhar() {
        if (this.dispositivo != null) {
            System.out.println(this.nome + " está usando o dispositivo " + this.dispositivo.getNome());
        } else {
            System.out.println(this.nome + " não tem um dispositivo associado.");
        }
    }
}
