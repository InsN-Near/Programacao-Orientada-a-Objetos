package Trabalhos.Trabalho2;

public class Pedido {
    private int numero;
    private Cliente cliente;
    private Veiculo veiculo;

    public Pedido(int n, Cliente c, Veiculo v) {
        this.numero = n;
        this.cliente = c;
        this.veiculo = v;
    }

    public void printDados() {
        System.out.println("\n====== RESUMO DO PEDIDO ======");
        System.out.println("Numero do Pedido: " + this.numero);
        this.cliente.printDados();
        this.veiculo.printDados();
        System.out.println("=============================\n");
    }
}
