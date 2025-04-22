package Exercicios.Lista5.Exercicio3;

public class CarrosApp {
    public static void main(String[] args) { 
        Motor m1 = new Motor("3.8L V6");
        Motor m2 = new Motor("Zetec Rocam 1.0");
        Motor m3 = new Motor("2.4 Ecotec");

        Carro c1 = new Carro("Mustang", "Conversível", "Ford", m1);
        Carro c2 = new Carro("Ka", "Popular", "Ford", m2);
        Carro c3 = new Carro("Captiva", "SUV", "Chevrolet", m3);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
