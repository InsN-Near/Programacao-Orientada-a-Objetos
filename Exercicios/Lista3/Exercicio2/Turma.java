package Exercicios.Lista3.Exercicio2;

public class Turma {
    private String curso;
    private String disciplina;

    public Turma(String curso, String disciplina) {
        this.curso = curso;
        this.disciplina = disciplina;
    }

    public String getCurso() {
        return curso;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void exibirDetalhes() {
        System.out.println("--- Detalhes da Turma ---");
        System.out.println("Curso: " + this.curso);
        System.out.println("Disciplina: " + this.disciplina);
        System.out.println("-------------------------");
    }
}
