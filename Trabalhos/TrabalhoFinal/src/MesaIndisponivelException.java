package Trabalhos.TrabalhoFinal.src;


// Este arquivo contém comentários detalhados para facilitar a apresentação e a compreensão do código.
// A ideia é que cada comentário sirva como um guia durante a defesa do projeto.

/**
 * REQUISITO 7: Exceções
 * Exceção customizada para ser lançada quando uma operação é tentada em uma mesa
 * que não está disponível (por exemplo, já está ocupada).
 * Herdar de 'Exception' a torna uma "checked exception", forçando o tratamento
 * com try-catch ou a declaração na assinatura do método.
 */
public class MesaIndisponivelException extends Exception {
    public MesaIndisponivelException(String message) {
        super(message);
    }
}