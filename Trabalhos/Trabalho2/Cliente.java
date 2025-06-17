package Trabalhos.Trabalho2;

public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String n, String c) {
        this.nome = n;
        this.cpf = c;
    }

    public void printDados() {
        System.out.println("--- Dados do Cliente ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
    }
}
