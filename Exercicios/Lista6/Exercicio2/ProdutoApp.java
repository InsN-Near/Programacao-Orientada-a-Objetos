package Exercicio2;

// c. Classe ProdutoApp para teste.
public class ProdutoApp {
    public static void main(String[] args) {
        Produto p1 = new Produto("Tablet", 120.00);
        p1.mostrarDetalhes(); System.out.println("Produto p1 eh caro (^>100)? " + p1.ehCaro());
        p1.aplicarDesconto(10.0, false); System.out.print("Apos desconto: "); p1.mostrarDetalhes(); System.out.println();

        Livro l1 = new Livro(250, "Autor Exemplo", 75.00, "Java Avancado");
        l1.mostrarDetalhes(); System.out.println("Livro l1 eh caro (^>50)? " + l1.ehCaro());
        System.out.println("Livro l1 eh extenso (^>100)? " + l1.ehExtenso());
        System.out.println("Livro l1 eh extenso (^>200)? " + l1.ehExtenso(200));
        l1.aplicarDesconto(5.0, true); System.out.print("Apos desconto fixo: "); l1.mostrarDetalhes(); System.out.println();

        Livro l2 = new Livro(80, "Outro Autor", 40.00, "Contos Curtos");
        l2.mostrarDetalhes(); System.out.println("Livro l2 eh caro (^>50)? " + l2.ehCaro());
        System.out.println("Livro l2 eh extenso (^>100)? " + l2.ehExtenso());
    }
}
