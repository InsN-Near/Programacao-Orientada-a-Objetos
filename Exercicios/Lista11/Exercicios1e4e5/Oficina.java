public class Oficina {
    public void consertar(Veiculo v) {
        v.verificar();
        v.ajustar();
        v.limpar();
        System.out.println("Veiculo consertado.\n");
    }
}