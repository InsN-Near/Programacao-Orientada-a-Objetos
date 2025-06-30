package Exercicios.Lista12.Exercicio3;

public class CentralMensagens {
    public static void main(String[] args) {
        Mensagem[] mensagens = new Mensagem[3];

        mensagens[0] = new MensagemTexto("Olá! Como vai?");
        mensagens[1] = new MensagemImagem("foto_ferias.jpg");
        mensagens[2] = new Mensagem();

        for (Mensagem msg : mensagens) {
            System.out.println(msg);
        }
    }
}
