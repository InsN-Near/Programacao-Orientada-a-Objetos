package Exercicios.Lista5.Exercicio2;

public class CarrosApp {
    public static void main(String[] args) { 
        Motor m1 = new Motor("3.8L V6");
        Motor m2 = new Motor("Zetec Rocam 1.0");
        Motor m3 = new Motor("2.4 Ecotec");

        Bancos b1 = new Bancos("Recaro");
        Bancos b2 = new Bancos("Sparco");
        Bancos b3 = new Bancos("Original GM");

        Carro c1 = new Carro("Mustang", "Conversível", "Ford", m1, b1);
        Carro c2 = new Carro("Ka", "Popular", "Ford", m2, b2);
        Carro c3 = new Carro("Captiva", "SUV", "Chevrolet", m3, b3);

        System.out.println("Carro 1:");
        System.out.println("  Fabricante: " + c1.getFabricante());
        System.out.println("  Marca: " + c1.getMarca());
        System.out.println("  Modelo: " + c1.getModelo());
        System.out.println("  Tipo Motor: " + c1.getTipoMotor());
        System.out.println("  Fabricante Bancos: " + c1.getBancos().getFabricante()); 
        System.out.println(); 

        System.out.println("Carro 2:");
        System.out.println("  Fabricante: " + c2.getFabricante());
        System.out.println("  Marca: " + c2.getMarca());
        System.out.println("  Modelo: " + c2.getModelo());
        System.out.println("  Tipo Motor: " + c2.getTipoMotor());
        System.out.println("  Fabricante Bancos: " + c2.getBancos().getFabricante()); 
         System.out.println(); 

        System.out.println("Carro 3:");
        System.out.println("  Fabricante: " + c3.getFabricante());
        System.out.println("  Marca: " + c3.getMarca());
        System.out.println("  Modelo: " + c3.getModelo());
        System.out.println("  Tipo Motor: " + c3.getTipoMotor());
        System.out.println("  Fabricante Bancos: " + c3.getBancos().getFabricante()); 
    }
}
