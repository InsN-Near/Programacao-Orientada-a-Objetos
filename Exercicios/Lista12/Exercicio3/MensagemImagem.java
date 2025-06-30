package Exercicios.Lista12.Exercicio3;

public class MensagemImagem extends Mensagem {
    String nomeArquivo;

    public MensagemImagem(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    @Override
    public String toString() {
        return "Mensagem de Imagem: " + this.nomeArquivo;
    }
}
