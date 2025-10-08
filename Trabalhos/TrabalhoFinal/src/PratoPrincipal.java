package Trabalhos.TrabalhoFinal.src;


// Este arquivo contém comentários detalhados para facilitar a apresentação e a compreensão do código.
// A ideia é que cada comentário sirva como um guia durante a defesa do projeto.

/**
 * REQUISITO 3: Herança e Polimorfismo
 * Subclasse que herda de Prato, representando um prato principal.
 * Ela fornece uma implementação concreta para o método abstrato 'calcularTaxaServico'.
 */
public class PratoPrincipal extends Prato {

    // O construtor chama o construtor da superclasse (Prato) para inicializar os atributos herdados.
    public PratoPrincipal(String nome, double preco) {
        super(nome, preco, "Principal"); // Categoria definida como "Principal"
    }

    /**
     * Implementação específica do cálculo da taxa de serviço para Pratos Principais.
     * Neste caso, a taxa é de 10% sobre o preço do prato.
     * @return 10% do valor do prato.
     */
    @Override
    public double calcularTaxaServico() {
        return getPreco() * 0.10; // Taxa de 10%
    }
}