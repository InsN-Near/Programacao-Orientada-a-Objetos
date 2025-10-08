package Trabalhos.TrabalhoFinal.src;


// Este arquivo contém comentários detalhados para facilitar a apresentação e a compreensão do código.
// A ideia é que cada comentário sirva como um guia durante a defesa do projeto.

/**
 * REQUISITO 1: Classes e Objetos
 * Classe base para todos os pratos do restaurante.
 *
 * REQUISITO 3: Herança e Polimorfismo
 * É uma classe abstrata, servindo como modelo para suas subclasses (PratoPrincipal e Sobremesa).
 * Não é possível criar um objeto diretamente de 'Prato', apenas de suas especializações.
 * Contém um método abstrato 'calcularTaxaServico', que força as subclasses a implementá-lo.
 */
public abstract class Prato {

    // REQUISITO 4: Encapsulamento
    // Atributos privados para garantir que o acesso seja feito apenas através de getters e setters.
    private String nome;
    private double preco;
    private String categoria; // Adicionado para o requisito 9

    // Construtor para inicializar os atributos da classe.
    public Prato(String nome, double preco, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    /**
     * REQUISITO 3: Polimorfismo
     * Método abstrato que define a assinatura para o cálculo da taxa de serviço.
     * Cada subclasse (PratoPrincipal, Sobremesa) terá sua própria implementação,
     * variando o cálculo conforme o tipo do prato.
     * @return o valor da taxa de serviço.
     */
    public abstract double calcularTaxaServico();

    // --- Getters e Setters (REQUISITO 4) ---
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}