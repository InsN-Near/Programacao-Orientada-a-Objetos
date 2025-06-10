public class Caminhao extends Veiculo {
    @Override
    public void verificar() {
        System.out.println("Verificando o caminhao.");
    }
    @Override
    public void ajustar() {
        System.out.println("Ajustando o caminhao.");
    }
    @Override
    public void limpar() {
        System.out.println("Limpando o caminhao.");
    }
}