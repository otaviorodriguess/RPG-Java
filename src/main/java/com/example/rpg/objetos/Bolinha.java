package com.example.rpg.objetos;

import java.util.Random;

public class Bolinha {

    private static final Random random = new Random();

    private double x;
    private double y;
    private double tamanho = 15;

    public Bolinha(double larguraTela, double alturaTela) {
        this.x = random.nextDouble() * (larguraTela - tamanho);
        this.y = random.nextDouble() * (alturaTela - tamanho);
    }

    public double getX() { return x; }
    public double getY() { return y; }
    public double getTamanho() { return tamanho; }
}