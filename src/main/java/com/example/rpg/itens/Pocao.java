package com.example.rpg.itens;

import com.example.rpg.personagens.Heroi;

public class Pocao {
    private int cura;

    public Pocao(int cura) {
        this.cura = cura;
    }

    public void usar(Heroi heroi) {
        System.out.println("Herói usou uma poção e recuperou " + cura + " de vida!");
        // Pode implementar para aumentar a vida 
    }
}
