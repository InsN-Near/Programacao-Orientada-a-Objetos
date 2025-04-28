package Trabalhos.Trabalho1.Portaria;

public class TestePortaria {
    public static void main(String[] args) {
        Portaria minhaPortaria = new Portaria();

        System.out.println("--- Estado Inicial Portaria ---");
        System.out.println(minhaPortaria.getPortaoEletronico().observar());
        System.out.println(minhaPortaria.getCameraSeguranca().observar());
        System.out.println(minhaPortaria.getPortaAutomatica().observar());

        System.out.println("\n--- Ligando sistemas da Portaria ---");
        minhaPortaria.ligar();
        System.out.println(minhaPortaria.getPortaoEletronico().observar());
        System.out.println(minhaPortaria.getCameraSeguranca().observar());
        System.out.println(minhaPortaria.getPortaAutomatica().observar());
        System.out.println("Câmera está ligada? " + minhaPortaria.getCameraSeguranca().isLigado());


        System.out.println("\n--- Desligando sistemas da Portaria ---");
        minhaPortaria.desligar();
        System.out.println(minhaPortaria.getPortaoEletronico().observar());
        System.out.println(minhaPortaria.getCameraSeguranca().observar());
        System.out.println(minhaPortaria.getPortaAutomatica().observar());
        System.out.println("Portão Eletrônico está ligado? " + minhaPortaria.getPortaoEletronico().isLigado());
    }
}