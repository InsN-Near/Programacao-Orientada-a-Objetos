package Trabalhos.TrabalhoFinal.src;


import java.util.ArrayList;
import java.util.List;

// Este arquivo contém comentários detalhados para facilitar a apresentação e a compreensão do código.
// A ideia é que cada comentário sirva como um guia durante a defesa do projeto.

/**
 * REQUISITO 1: Classes e Objetos
 * Representa um cliente do restaurante.
 */
public class Cliente {

    // REQUISITO 4: Encapsulamento
    private String nome;

    // REQUISITO 2: Associação
    // Um Cliente PODE FAZER vários Pedidos. É uma relação de "uso", mais fraca que agregação
    // ou composição. O ciclo de vida de Pedido não depende do de Cliente.
    // REQUISITO 6: Arrays e Coleções
    // Usamos uma lista para armazenar o histórico de pedidos do cliente.
    private List<Pedido> pedidos;

    public Cliente(String nome) {
        this.nome = nome;
        this.pedidos = new ArrayList<>();
    }

    // Método para o cliente fazer um novo pedido.
    public void fazerPedido(Pedido novoPedido) {
        this.pedidos.add(novoPedido);
    }

    // --- Getters e Setters ---
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }
}