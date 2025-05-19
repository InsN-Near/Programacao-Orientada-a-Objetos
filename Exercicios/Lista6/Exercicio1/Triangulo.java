package Exercicio1;

// a. Subclasse. d. Usa getters.
public class Triangulo extends TwoDShape {
    private String estilo; // a. Atributo.

    public Triangulo(String s, double l, double a) {
        super(l, a);
        this.estilo = s;
    }
    public Triangulo() { super(); this.estilo = "indefinido"; }

    public double area() { return (getLargura() * getAltura()) / 2; } // a. Metodo.
    public void mostraEstilo() { System.out.println("Triangulo = " + estilo); } // a. Metodo.
    public String getEstilo() { return estilo; }
    public void setEstilo(String estilo) { this.estilo = estilo; } // a. Correcao: Setter.
}
