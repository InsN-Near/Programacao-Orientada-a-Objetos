package Exercicios.Lista13;

public enum Valor {
    AS("ÁS"),
    DOIS("2"),
    TRES("3"),
    QUATRO("4"),
    CINCO("5"),
    SEIS("6"),
    SETE("7"),
    OITO("8"),
    NOVE("9"),
    DEZ("10"),
    VALETE("VALETE"),
    DAMA("DAMA"),
    REI("REI");

    private final String nomeExibicao;

    Valor(String nomeExibicao) {
        this.nomeExibicao = nomeExibicao;
    }

    public String getNomeExibicao() {
        return this.nomeExibicao;
    }
}
