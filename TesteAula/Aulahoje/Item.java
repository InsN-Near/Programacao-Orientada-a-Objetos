package TesteAula.Aulahoje;

public class Item {
    private String titulo;
    private int tempoDuracao;
    public Item(String oTitulo, int oTempo) {
        titulo = oTitulo;
        tempoDuracao = oTempo;
    }
    public String getTitulo() {
        return titulo;
    }
    public int getTempoDuracao() {
        return tempoDuracao;
    }
    public void printItemDetails() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Duração: " + getTempoDuracao() + " minutos");
    }

    
}