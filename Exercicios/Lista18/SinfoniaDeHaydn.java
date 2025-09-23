package Exercicios.Lista18;

public class SinfoniaDeHaydn {

    public static void main(String[] args) {

        Corda violinos = new Corda();
        SoproMadeira flautas = new SoproMadeira();
        SoproMetal trompetes = new SoproMetal();
        Percussao timpanos = new Percussao();

        System.out.println("O maestro sobe ao pódio. A plateia silencia.");
        System.out.println("Com um gesto elegante, ele ergue a batuta. A sinfonia começa...\n");

        System.out.println("--- I. Movimento: Allegro ---");
        System.out.println("A sinfonia se inicia com a seção de cordas, tecendo uma melodia vibrante e alegre,");
        System.out.println("típica da energia contagiante de Haydn.");
        violinos.nome();
        violinos.tocar();
        violinos.afinar();
        System.out.println("----------------------------------------\n");

        System.out.println("--- II. Movimento: Andante ---");
        System.out.println("O ritmo acalma. Agora, a doçura das madeiras assume o protagonismo,");
        System.out.println("respondendo às cordas com um tema lírico e sereno.");
        flautas.nome();
        flautas.tocar();
        System.out.println("----------------------------------------\n");

        System.out.println("--- III. Movimento: Menuetto ---");
        System.out.println("Os metais entram com um chamado majestoso, trazendo um ar de nobreza e dança,");
        System.out.println("como um minueto em um salão de baile.");
        trompetes.nome();
        trompetes.tocar();
        System.out.println("----------------------------------------\n");
        
        System.out.println("--- IV. Movimento: Finale. Presto ---");
        System.out.println("A percussão marca o ritmo com firmeza, anunciando a chegada do grande final!");
        timpanos.nome();
        timpanos.tocar();
        
        System.out.println("\nA tensão cresce! Todos os instrumentos se preparam para o clímax...");
        System.out.println("E então, o 'Tutti'! Toda a orquestra se une em uma explosão de harmonia e som,");
        System.out.println("celebrando a genialidade da composição em um final triunfante!\n");

        Instrumento[] orquestraCompleta = {violinos, flautas, trompetes, timpanos};

        for (Instrumento instrumento : orquestraCompleta) {
            instrumento.tocar();
        }

        System.out.println("\nO último acorde ressoa pelo teatro. O maestro abaixa a batuta.");
        System.out.println("Um momento de silêncio... e a plateia explode em aplausos!");
    }
}
