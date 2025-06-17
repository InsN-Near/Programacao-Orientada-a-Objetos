package Trabalhos.Trabalho2;

public class Moto extends Veiculo {
    private double km;

    public Moto(String n, double p, double k) {
        super(n, p);
        this.km = k;
    }

    public void setKm(double km) {
        this.km = km;
    }

    @Override
    public double getPreco() {
        double precoBase = super.getPreco();
        if (this.km > 10000) {
            return precoBase * 0.95;
        }
        return precoBase;
    }

    @Override
    public void printDados() {
        super.printDados();
        System.out.println("Quilometragem (km): " + this.km);
        System.out.printf("Preco Final: R$ %.2f\n", this.getPreco());
    }
}
