package TesteAula.Aulahoje;

public class CD extends Item {
    private String artista;
    public CD(String oTitulo, int oTempo, String oArtista) {
        super(oTitulo, oTempo);
        artista = oArtista;
    }

    public String getArtista() {
        return artista;
    }

}
