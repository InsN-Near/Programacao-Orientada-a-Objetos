package Trabalhos.TrabalhoFinal.src;


// Este arquivo contém comentários detalhados para facilitar a apresentação e a compreensão do código.
// A ideia é que cada comentário sirva como um guia durante a defesa do projeto.

/**
 * REQUISITO 3: Herança e Polimorfismo
 * Subclasse que herda de Prato, representando uma sobremesa.
 * Assim como PratoPrincipal, ela fornece sua própria implementação do método 'calcularTaxaServico'.
 */
public class Sobremesa extends Prato {

    // O construtor chama o construtor da superclasse (Prato) para inicializar os atributos herdados.
    public Sobremesa(String nome, double preco) {
        super(nome, preco, "Sobremesa"); // Categoria definida como "Sobremesa"
    }

    /**
     * Implementação específica do cálculo da taxa de serviço para Sobremesas.
     * Neste caso, a taxa é de 5% sobre o preço do prato.
     * @return 5% do valor do prato.
     */
    @Override
    public double calcularTaxaServico() {
        return getPreco() * 0.05; // Taxa de 5%
    }
}