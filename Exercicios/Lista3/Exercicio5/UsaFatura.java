package Exercicios.Lista3.Exercicio5;

public class UsaFatura {
    public static void main(String[] args) {
        System.out.println("Criando a primeira fatura...");
        Fatura fatura1 = new Fatura("001", "Teclado USB Gamer", 2, 150.00);

        System.out.println("Detalhes Iniciais da Fatura 1:");
        System.out.println("Número (get): " + fatura1.getNumero());
        System.out.println("Descrição (get): " + fatura1.getDescricao());
        System.out.println("Quantidade (get): " + fatura1.getQuantidade());
        System.out.printf("Preço Unitário (get): R$ %.2f\n", fatura1.getPreco());
        System.out.printf("Valor Total (getQtdeFatura): R$ %.2f\n", fatura1.getQtdeFatura());

        System.out.println("\n--------------------------\n");

        System.out.println("Modificando a Fatura 1...");
        fatura1.setQuantidade(3); 
        fatura1.setPreco(145.50);   
        fatura1.setDescricao("Teclado USB Gamer Pro"); 

        System.out.println("Detalhes Modificados da Fatura 1:");
        fatura1.exibirFatura(); 

        System.out.println("\n--------------------------\n");

        System.out.println("Criando a segunda fatura com quantidade inválida...");
        Fatura fatura2 = new Fatura("002", "Mouse sem Fio", -5, 75.00);
        System.out.println("Detalhes da Fatura 2 (quantidade deveria ser 0):");
        fatura2.exibirFatura();

        System.out.println("\nModificando Fatura 2 com preço inválido...");
        fatura2.setPreco(0.0);
        fatura2.setQuantidade(1); 
        System.out.println("Detalhes da Fatura 2 após tentativa de definir preço 0:");
        fatura2.exibirFatura();

    }
}
