package TesteAula.Aulahoje;

public class ItemApp {
    public static void main(String[] args) {
        Item item1 = new Video("A Viagem de Chihiro", 120, "Hayao Miyazaki");
        Item item2 = new CD("Nefarious", 97, "Cary Solomon");

        item1.printItemDetails();
        System.out.println("Diretor: " + ((Video) item1).getDiretor());
        System.out.println();

        item2.printItemDetails();
        System.out.println("Artista: " + ((CD) item2).getArtista());
    }
    
}
