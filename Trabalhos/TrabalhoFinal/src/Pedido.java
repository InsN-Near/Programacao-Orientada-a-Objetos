package Trabalhos.TrabalhoFinal.src;


import java.util.ArrayList;
import java.util.List;

// Este arquivo contém comentários detalhados para facilitar a apresentação e a compreensão do código.
// A ideia é que cada comentário sirva como um guia durante a defesa do projeto.

/**
 * REQUISITO 1: Classes e Objetos
 * Classe que representa um pedido feito por um cliente.
 *
 * REQUISITO 8: Interfaces
 * Implementa a interface 'Faturavel', sendo obrigada a ter o método 'calcularTotal'.
 */
public class Pedido implements Faturavel {

    // REQUISITO 4: Encapsulamento
    private StatusPedido status;

    // REQUISITO 2: Composição
    // Um Pedido é COMPOSTO por vários Pratos. Se o Pedido for destruído, a lista de pratos
    // associada a ele também deixa de fazer sentido. É uma relação forte "parte-de-um-todo".
    // REQUISITO 6: Arrays e Coleções
    // Utilizamos uma lista para armazenar os pratos do pedido.
    private List<Prato> itens;

    // Construtor
    public Pedido() {
        this.status = StatusPedido.EM_ANDAMENTO; // Um novo pedido sempre começa em andamento.
        this.itens = new ArrayList<>();
    }

    // Método para adicionar um prato ao pedido.
    public void adicionarPrato(Prato prato) {
        this.itens.add(prato);
    }

    /**
     * REQUISITO 8: Implementação do método da interface Faturavel.
     * Calcula o valor total do pedido, somando o preço de todos os itens
     * mais a taxa de serviço específica de cada um.
     * @return O custo total do pedido.
     */
    @Override
    public double calcularTotal() {
        double total = 0.0;
        for (Prato prato : itens) {
            total += prato.getPreco(); // Soma o preço base do prato
            total += prato.calcularTaxaServico(); // Soma a taxa de serviço (polimorfismo em ação)
        }
        return total;
    }

    // --- Getters e Setters ---
    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public List<Prato> getItens() {
        return itens;
    }
}