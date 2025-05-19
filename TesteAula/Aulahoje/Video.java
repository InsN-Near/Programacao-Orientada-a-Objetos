package TesteAula.Aulahoje;

public class Video extends Item {
    private String diretor;
    public Video(String oTitulo, int oTempo, String oDiretor) {
        super(oTitulo, oTempo);
        diretor = oDiretor;
    }

    public String getDiretor() {
        return diretor;
    }
}
