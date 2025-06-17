package Trabalhos.Trabalho2;

import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- CADASTRO DE CLIENTE ---");
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Digite o CPF do cliente: ");
        String cpfCliente = scanner.nextLine();

        Cliente cliente = new Cliente(nomeCliente, cpfCliente);
        
        System.out.println("\n--- DADOS DO CLIENTE CADASTRADO ---");
        cliente.printDados();
        System.out.println("-----------------------------------\n");

        int numeroPedido = 1;
        char continuar;

        do {
            System.out.println("--- NOVO PEDIDO ---");
            System.out.println("Qual veiculo deseja pedir?");
            System.out.println("1 - Carro");
            System.out.println("2 - Moto");
            System.out.print("Escolha uma opcao: ");
            int tipoVeiculo = scanner.nextInt();
            scanner.nextLine();

            Veiculo veiculoPedido = null;

            if (tipoVeiculo == 1) {
                System.out.print("Digite o modelo do carro: ");
                String modelo = scanner.nextLine();
                System.out.print("Digite o preco base do carro: ");
                double preco = scanner.nextDouble();
                System.out.print("Digite o ano do carro: ");
                int ano = scanner.nextInt();
                scanner.nextLine();
                
                veiculoPedido = new Carro(modelo, preco, ano);

            } else if (tipoVeiculo == 2) {
                System.out.print("Digite o modelo da moto: ");
                String modelo = scanner.nextLine();
                System.out.print("Digite o preco base da moto: ");
                double preco = scanner.nextDouble();
                System.out.print("Digite a quilometragem da moto: ");
                double km = scanner.nextDouble();
                scanner.nextLine();
                
                veiculoPedido = new Moto(modelo, preco, km);
                
            } else {
                System.out.println("Opcao invalida!");
            }

            if (veiculoPedido != null) {
                Pedido pedido = new Pedido(numeroPedido, cliente, veiculoPedido);
                pedido.printDados();
                numeroPedido++;
            }

            System.out.print("Deseja realizar outro pedido? (S/N): ");
            continuar = scanner.next().toUpperCase().charAt(0);
            scanner.nextLine();

        } while (continuar == 'S');

        System.out.println("\nSistema encerrado. Obrigado!");
        scanner.close();
    }
}
