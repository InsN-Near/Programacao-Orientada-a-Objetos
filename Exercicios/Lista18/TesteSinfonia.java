package Exercicios.Lista18;

public class TesteSinfonia {

    public static void sinfonia(Instrumento[] orquestra) {
        System.out.println("=== A Sinfonia vai começar! ===");
        for (Instrumento instrumento : orquestra) {
            instrumento.nome();
            instrumento.tocar();
            instrumento.afinar();
            System.out.println("------------------------------------");
        }
        System.out.println("=== Fim da Sinfonia ===");
    }

    public static void main(String[] args) {
        Instrumento[] instrumentos = new Instrumento[5];

        instrumentos[0] = new Sopro();
        instrumentos[1] = new Percussao();
        instrumentos[2] = new Corda();
        instrumentos[3] = new SoproMetal();
        instrumentos[4] = new SoproMadeira();

        sinfonia(instrumentos);
    }
}
