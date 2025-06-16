package Exercicios.Listaz12.Exercicio2;

public class Empresa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Ana");
        Funcionario funcionario = new Funcionario("Carlos", "Desenvolvedor");
        Gerente gerente = new Gerente("Beatriz", "Tecnologia");

        System.out.println(pessoa);
        System.out.println(funcionario);
        System.out.println(gerente);
    }
}
