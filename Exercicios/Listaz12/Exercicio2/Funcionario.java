package Exercicios.Listaz12.Exercicio2;

public class Funcionario extends Pessoa {
    String cargo;

    public Funcionario(String nome, String cargo) {
        super(nome);
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionário: " + this.nome + ", Cargo: " + this.cargo;
    }
}