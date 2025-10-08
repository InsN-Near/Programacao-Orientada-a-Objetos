package Trabalhos.TrabalhoFinal.src;


import java.util.List;

// Este arquivo contém comentários detalhados para facilitar a apresentação e a compreensão do código.
// A ideia é que cada comentário sirva como um guia durante a defesa do projeto.

/**
 * Classe principal para demonstrar o funcionamento do Sistema de Gerenciamento de Restaurante.
 * Aqui, instanciamos os objetos e simulamos as interações para validar todos os requisitos.
 */
public class Main {

    public static void main(String[] args) {
        // --- 1. CONFIGURAÇÃO INICIAL DO RESTAURANTE ---
        System.out.println("--- INICIANDO CONFIGURAÇÃO DO RESTAURANTE ---");

        // Criando a instância principal do Restaurante
        Restaurante meuRestaurante = new Restaurante("JavaGourmet");

        // REQUISITO 1 e 3: Criando objetos Prato (usando as subclasses)
        Prato p1 = new PratoPrincipal("Filé Mignon", 55.00);
        Prato p2 = new PratoPrincipal("Salmão Grelhado", 62.50);
        Prato s1 = new Sobremesa("Pudim", 15.00);
        Prato s2 = new Sobremesa("Tiramisu", 22.00);

        // Adicionando os pratos ao menu
        meuRestaurante.adicionarPratoAoMenu(p1);
        meuRestaurante.adicionarPratoAoMenu(p2);
        meuRestaurante.adicionarPratoAoMenu(s1);
        meuRestaurante.adicionarPratoAoMenu(s2);
        System.out.println("Menu do restaurante cadastrado.");

        // REQUISITO 1 e 6: Criando e adicionando mesas à coleção do restaurante
        meuRestaurante.adicionarMesa(new Mesa(1));
        meuRestaurante.adicionarMesa(new Mesa(2));
        meuRestaurante.adicionarMesa(new Mesa(3));
        System.out.println("Mesas do restaurante cadastradas.\n");

        // --- 2. SIMULAÇÃO DO ATENDIMENTO ---
        System.out.println("--- INICIANDO SIMULAÇÃO DE ATENDIMENTO ---");

        // Um cliente chega
        Cliente cliente1 = new Cliente("Carlos");
        meuRestaurante.cadastrarCliente(cliente1);
        System.out.println("Cliente '" + cliente1.getNome() + "' chegou.");

        // REQUISITO 7: Tentando ocupar uma mesa (deve funcionar)
        try {
            meuRestaurante.ocuparMesa(2);
        } catch (MesaIndisponivelException e) {
            System.err.println("Erro: " + e.getMessage());
        }

        // Criando um pedido para o cliente Carlos
        // REQUISITO 2: Associação (cliente faz pedido) e Composição (pedido tem pratos)
        Pedido pedidoDoCarlos = new Pedido();
        pedidoDoCarlos.adicionarPrato(p1); // Adiciona Filé Mignon
        pedidoDoCarlos.adicionarPrato(s2); // Adiciona Tiramisu
        cliente1.fazerPedido(pedidoDoCarlos);
        System.out.println("Cliente '" + cliente1.getNome() + "' fez um pedido com 2 itens.");

        // REQUISITO 8: Calculando o total da conta usando a interface
        System.out.printf("Total do pedido do Carlos: R$ %.2f\n", pedidoDoCarlos.calcularTotal());
        System.out.println("   (Preço base: R$ " + (p1.getPreco() + s2.getPreco()) + 
                           " | Taxa Filé: R$ " + p1.calcularTaxaServico() + 
                           " | Taxa Tiramisu: R$ " + s2.calcularTaxaServico() + ")");
        System.out.println("");

        // --- 3. DEMONSTRAÇÃO DE OUTROS REQUISITOS ---
        System.out.println("--- DEMONSTRANDO OUTROS REQUISITOS ---");

        // REQUISITO 7: Tentando ocupar uma mesa que já está ocupada (deve lançar exceção)
        System.out.println("Tentando ocupar a mesa 2 novamente...");
        try {
            meuRestaurante.ocuparMesa(2);
        } catch (MesaIndisponivelException e) {
            System.err.println("CAPTURA DE EXCEÇÃO: " + e.getMessage());
        }
        System.out.println("");

        // REQUISITO 9: Demonstração da busca de pratos no menu
        System.out.println("Buscando pratos com o termo 'mign' no nome...");
        List<Prato> resultadosBusca1 = meuRestaurante.buscarPratoPorNomeOuCategoria("mign");
        resultadosBusca1.forEach(prato -> System.out.println(" - Encontrado: " + prato.getNome()));

        System.out.println("\nBuscando pratos da categoria 'Sobremesa'...");
        List<Prato> resultadosBusca2 = meuRestaurante.buscarPratoPorNomeOuCategoria("Sobremesa");
        resultadosBusca2.forEach(prato -> System.out.println(" - Encontrado: " + prato.getNome()));
    }
}