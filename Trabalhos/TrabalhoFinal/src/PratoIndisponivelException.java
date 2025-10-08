package Trabalhos.TrabalhoFinal.src;


// Este arquivo contém comentários detalhados para facilitar a apresentação e a compreensão do código.
// A ideia é que cada comentário sirva como um guia durante a defesa do projeto.

/**
 * REQUISITO 7: Exceções
 * Exceção customizada para ser lançada quando um prato solicitado não está disponível
 * no menu do restaurante.
 */
public class PratoIndisponivelException extends Exception {
    public PratoIndisponivelException(String message) {
        super(message);
    }
}