package Exercicios.Listaz12.Exercicio2;

public class Gerente extends Pessoa {
    String departamento;

    public Gerente(String nome, String departamento) {
        super(nome);
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Gerente: " + this.nome + ", Departamento: " + this.departamento;
    }
}
