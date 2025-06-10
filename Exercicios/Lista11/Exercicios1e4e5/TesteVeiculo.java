import java.util.ArrayList;

public class TesteVeiculo {
    public static void main(String[] args) {
        System.out.println("--- DEMONSTRACAO DOS EXERCICIOS 1 E 4 ---");
        Oficina oficina = new Oficina();
        
        Veiculo carro = new Automovel();
        Veiculo bike = new Bicicleta();
        Veiculo caminhao = new Caminhao();
        
        System.out.println("Consertando automovel:");
        oficina.consertar(carro);
        
        System.out.println("Consertando bicicleta:");
        oficina.consertar(bike);

        System.out.println("Consertando caminhao:");
        oficina.consertar(caminhao);

        System.out.println("\n--- DEMONSTRACAO DO EXERCICIO 5 ---");
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Automovel());
        veiculos.add(new Bicicleta());
        veiculos.add(new Caminhao());

        for (Veiculo v : veiculos) {
            System.out.println("--- Processando veiculo da lista ---");
            v.verificar();
            v.ajustar();
            v.limpar();
            System.out.println();
        }
    }
}