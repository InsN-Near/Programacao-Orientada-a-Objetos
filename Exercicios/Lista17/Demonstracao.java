public class Demonstracao {
    public static void main(String[] args) {

        System.out.println("--- Demonstração da classe MaisDois ---");

        MaisDois md = new MaisDois();

        System.out.println("Imprimindo os 5 primeiros valores:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Próximo valor: " + md.getNext());
        }

        System.out.println("\nResetando a série:");
        md.reset();
        for (int i = 0; i < 5; i++) {
            System.out.println("Próximo valor: " + md.getNext());
        }

        System.out.println("\nIniciando a série em 100:");
        md.setStart(100);
        for (int i = 0; i < 5; i++) {
            System.out.println("Próximo valor: " + md.getNext());
        }

        System.out.println("\nRepetindo o passo 3 (continuando a série):");
        for (int i = 0; i < 5; i++) {
            System.out.println("Próximo valor: " + md.getNext());
        }

        System.out.println("\n\n--- Demonstração da classe MaisTres ---");

        MaisTres mt = new MaisTres();

        System.out.println("Imprimindo os 5 primeiros valores:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Próximo valor: " + mt.getNext());
        }

        System.out.println("\nResetando a série:");
        mt.reset();
        for (int i = 0; i < 5; i++) {
            System.out.println("Próximo valor: " + mt.getNext());
        }

        System.out.println("\nIniciando a série em 100:");
        mt.setStart(100);
        for (int i = 0; i < 5; i++) {
            System.out.println("Próximo valor: " + mt.getNext());
        }
    }
}