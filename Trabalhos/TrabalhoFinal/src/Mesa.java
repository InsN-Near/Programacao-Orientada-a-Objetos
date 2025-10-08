package Trabalhos.TrabalhoFinal.src;


// Este arquivo contém comentários detalhados para facilitar a apresentação e a compreensão do código.
// A ideia é que cada comentário sirva como um guia durante a defesa do projeto.

/**
 * REQUISITO 1: Classes e Objetos
 * Representa uma mesa no restaurante, com um número e um status (ocupada ou livre).
 */
public class Mesa {

    // REQUISITO 4: Encapsulamento
    private int numero;
    private boolean ocupada;

    public Mesa(int numero) {
        this.numero = numero;
        this.ocupada = false; // Toda mesa começa desocupada.
    }

    // Métodos para controlar o estado da mesa.
    public void ocupar() {
        this.ocupada = true;
    }

    public void desocupar() {
        this.ocupada = false;
    }

    // --- Getters e Setters ---
    public int getNumero() {
        return numero;
    }

    public boolean isOcupada() {
        return ocupada;
    }
}