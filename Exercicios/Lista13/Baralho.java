package Exercicios.Lista13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
    private List<Carta> cartas;

    public Baralho() {
        this.cartas = new ArrayList<>();
        for (Naipe naipe : Naipe.values()) {
            for (Valor valor : Valor.values()) {
                this.cartas.add(new Carta(naipe, valor));
            }
        }
    }

    public void embaralhar() {
        Collections.shuffle(this.cartas);
    }

    public Carta comprar() {
        if (this.cartas.isEmpty()) {
            return null;
        }
        return this.cartas.remove(0);
    }

    public int cartasRestantes() {
        return this.cartas.size();
    }
}
