package Exercicios.Lista12.Exercicio3;

public class MensagemTexto extends Mensagem {
    String texto;

    public MensagemTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "Mensagem de Texto: \"" + this.texto + "\"";
    }
}
