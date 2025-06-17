package Trabalhos.Trabalho2;

public class Carro extends Veiculo {
    private int ano;

    public Carro(String n, double p, int a) {
        super(n, p);
        this.ano = a;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public double getPreco() {
        double precoBase = super.getPreco();
        if (this.ano < 2015) {
            return precoBase * 0.9;
        }
        return precoBase;
    }
    
    @Override
    public void printDados() {
        super.printDados();
        System.out.println("Ano: " + this.ano);
        System.out.printf("Preco Final: R$ %.2f\n", this.getPreco());
    }
}
