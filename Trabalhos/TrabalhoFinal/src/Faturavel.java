package Trabalhos.TrabalhoFinal.src;


// Este arquivo contém comentários detalhados para facilitar a apresentação e a compreensão do código.
// A ideia é que cada comentário sirva como um guia durante a defesa do projeto.

/**
 * REQUISITO 8: Interfaces
 * Esta interface define o contrato para qualquer classe que possa ser "faturada",
 * ou seja, que tenha um valor total a ser calculado.
 * Classes que implementam Faturavel devem obrigatoriamente fornecer uma implementação
 * para o método calcularTotal().
 */
public interface Faturavel {
    /**
     * Método que deve ser implementado para calcular o valor total de um item faturável.
     * @return O valor total calculado em formato double.
     */
    double calcularTotal();
}