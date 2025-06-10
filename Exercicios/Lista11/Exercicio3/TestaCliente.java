package Exercicios.Lista11.Exercicio3;

public class TestaCliente {
    public static void main(String[] args) {
        double valorCompra = 100.0;

        Cliente clienteComum = new Cliente();
        Cliente clienteVip = new ClienteEspecial();
        
        System.out.println("Valor original: " + valorCompra);
        
        double valorComDescontoComum = clienteComum.calcularDesconto(valorCompra);
        System.out.println("Valor com desconto para cliente comum: " + valorComDescontoComum);
        
        double valorComDescontoEspecial = clienteVip.calcularDesconto(valorCompra);
        System.out.println("Valor com desconto para cliente especial: " + valorComDescontoEspecial);
    }
}
