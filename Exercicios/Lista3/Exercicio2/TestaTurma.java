package Exercicios.Lista3.Exercicio2;

public class TestaTurma {
    public static void main(String[] args) {
        System.out.println("Criando a Turma 1...");
        Turma turma1 = new Turma("Matemática Aplicada e Computacional", "Programação Orientada a Objetos");

        System.out.println("Detalhes Iniciais da Turma 1:");
        turma1.exibirDetalhes();

        System.out.println("\nCriando a Turma 2...");
        Turma turma2 = new Turma("Filosofia", "Estética II");

        System.out.println("Detalhes Iniciais da Turma 2:");
        turma2.exibirDetalhes();

        System.out.println("\nModificando a Turma 1...");
        turma1.setDisciplina("Banco de Dados");
        turma1.setCurso("Sistemas de Informação");

        System.out.println("Detalhes Modificados da Turma 1:");
        turma1.exibirDetalhes();

        System.out.println("\nAcessando dados da Turma 2 com Getters:");
        String cursoTurma2 = turma2.getCurso();
        String disciplinaTurma2 = turma2.getDisciplina();
        System.out.println("Curso (Getter): " + cursoTurma2);
        System.out.println("Disciplina (Getter): " + disciplinaTurma2);

        System.out.println("\nTodos os métodos foram utilizados.");
    }
}
