package Exercicios.Lista3.Exercicio5;

public class Fatura {
    private String numero;
    private String descricao;
    private int quantidade;
    private double preco;

    public Fatura(String numero, String descricao, int quantidade, double preco) {
        this.numero = numero;
        this.descricao = descricao;
        if (quantidade > 0) {
            this.quantidade = quantidade;
        } else {
            this.quantidade = 0; 
        }
        if (preco > 0.0) {
            this.preco = preco;
        } else {
            this.preco = 0.0; 
        }
    }

    public String getNumero() {
        return numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade > 0) {
            this.quantidade = quantidade;
        } else {
            this.quantidade = 0; 
            System.out.println("Aviso: Quantidade inválida definida como 0.");
        }
    }

    public void setPreco(double preco) {
        if (preco > 0.0) {
            this.preco = preco;
        } else {
            this.preco = 0.0; 
            System.out.println("Aviso: Preço inválido definido como 0.0.");
        }
    }

    public double getQtdeFatura() {
        return this.quantidade * this.preco;
    }

    public void exibirFatura() {
        System.out.println("--- Detalhes da Fatura ---");
        System.out.println("Número: " + getNumero());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Quantidade: " + getQuantidade());
        System.out.printf("Preço Unitário: R$ %.2f\n", getPreco());
        System.out.printf("Valor Total da Fatura: R$ %.2f\n", getQtdeFatura());
        System.out.println("--------------------------");
    }
}
