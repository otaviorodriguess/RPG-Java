package com.example.rpg.personagens;

public class Heroi {

    private String nome;
    private double x;
    private double y;
    private double tamanho = 40;
    private double velocidade = 4;
    private boolean vivo = true;

    public Heroi(String nome, double x, double y) {
        this.nome = nome;
        this.x = x;
        this.y = y;
    }

    public void mover(boolean up, boolean down, boolean left, boolean right,
                      double larguraTela, double alturaTela) {

        if (!vivo) return;

        if (up) y -= velocidade;
        if (down) y += velocidade;
        if (left) x -= velocidade;
        if (right) x += velocidade;

        // MORRE se encostar na borda
        if (x < 0 || y < 0 ||
                x + tamanho > larguraTela ||
                y + tamanho > alturaTela) {
            vivo = false;
        }
    }

    public void crescer() {
        tamanho += 5;
    }

    public boolean estaVivo() {
        return vivo;
    }

    public String getNome() { return nome; }
    public double getX() { return x; }
    public double getY() { return y; }
    public double getTamanho() { return tamanho; }
}