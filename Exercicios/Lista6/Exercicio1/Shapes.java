package Exercicio1;

public class Shapes {
    public static void main(String[] args) {
        // a. Teste. d. Usa setters.
        Triangulo t1 = new Triangulo();
        t1.setLargura(4.0); t1.setAltura(4.0); t1.setEstilo("cheio");
        System.out.println("Info para t1 (Triangulo):");
        t1.mostraEstilo(); t1.mostraDim(); System.out.println("Area = " + t1.area()); System.out.println();

        Triangulo t2 = new Triangulo("contorno", 8.0, 12.0);
        System.out.println("Info para t2 (Triangulo):");
        t2.mostraEstilo(); t2.mostraDim(); System.out.println("Area = " + t2.area()); System.out.println();

        // b. Teste Retangulo. d. Usa setters.
        Retangulo r1 = new Retangulo();
        r1.setLargura(5.0); r1.setAltura(5.0);
        System.out.println("Info para r1 (Retangulo):");
        r1.mostraDim(); System.out.println("Area = " + r1.area()); System.out.println("Eh quadrado? " + r1.isQuadrado()); System.out.println();

        Retangulo r2 = new Retangulo(6.0, 7.0);
        System.out.println("Info para r2 (Retangulo):");
        r2.mostraDim(); System.out.println("Area = " + r2.area()); System.out.println("Eh quadrado? " + r2.isQuadrado());

        // d. Modificando atributos.
        System.out.println("\nModificando t1 e r2...");
        t1.setLargura(5.0); t1.setEstilo("transparente");
        r2.setAltura(6.0);
        System.out.println("Info para t1 (Triangulo modificado):");
        t1.mostraEstilo(); t1.mostraDim(); System.out.println("Area = " + t1.area()); System.out.println();
        System.out.println("Info para r2 (Retangulo modificado):");
        r2.mostraDim(); System.out.println("Area = " + r2.area()); System.out.println("Eh quadrado? " + r2.isQuadrado());
        /* a. Erro inicial: 'estilo' private, acesso direto falha. Corrigido com setter. */
        /* c. Erro atributos private: 'largura'/'altura' private causam erro acesso direto. Corrigido com getters/setters. */
    }
}
