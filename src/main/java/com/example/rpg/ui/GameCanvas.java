package com.example.rpg.ui;

import com.example.rpg.personagens.Heroi;
import com.example.rpg.objetos.Bolinha;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GameCanvas extends Canvas {

    private Heroi heroi;
    private List<Bolinha> bolinhas = new ArrayList<>();

    public GameCanvas(double width, double height, Heroi heroi) {
        super(width, height);
        this.heroi = heroi;

        for (int i = 0; i < 10; i++) {
            bolinhas.add(new Bolinha(width, height));
        }
    }

    public void update(boolean up, boolean down, boolean left, boolean right) {

        heroi.mover(up, down, left, right, getWidth(), getHeight());

        if (!heroi.estaVivo()) return;

        Iterator<Bolinha> iterator = bolinhas.iterator();
        while (iterator.hasNext()) {
            Bolinha b = iterator.next();

            if (colidiu(b)) {
                iterator.remove();
                heroi.crescer();
                bolinhas.add(new Bolinha(getWidth(), getHeight()));
            }
        }
    }

    private boolean colidiu(Bolinha b) {
        return heroi.getX() < b.getX() + b.getTamanho() &&
                heroi.getX() + heroi.getTamanho() > b.getX() &&
                heroi.getY() < b.getY() + b.getTamanho() &&
                heroi.getY() + heroi.getTamanho() > b.getY();
    }

    public void render() {

        GraphicsContext gc = getGraphicsContext2D();

        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, getWidth(), getHeight());

        // bolinhas
        gc.setFill(Color.YELLOW);
        for (Bolinha b : bolinhas) {
            gc.fillOval(b.getX(), b.getY(), b.getTamanho(), b.getTamanho());
        }

        // herói
        gc.setFill(Color.BLUE);
        gc.fillOval(heroi.getX(), heroi.getY(),
                heroi.getTamanho(),
                heroi.getTamanho());

        if (!heroi.estaVivo()) {
            gc.setFill(Color.RED);
            gc.fillText("GAME OVER", getWidth()/2 - 40, getHeight()/2);
        }
    }
}