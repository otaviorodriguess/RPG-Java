package com.example.rpg.ui;

import com.example.rpg.personagens.Heroi;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;

public class GameController {

    private boolean up, down, left, right;

    public GameController(GameCanvas canvas, Scene scene, Heroi heroi) {

        scene.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.W) up = true;
            if (e.getCode() == KeyCode.S) down = true;
            if (e.getCode() == KeyCode.A) left = true;
            if (e.getCode() == KeyCode.D) right = true;
        });

        scene.setOnKeyReleased(e -> {
            if (e.getCode() == KeyCode.W) up = false;
            if (e.getCode() == KeyCode.S) down = false;
            if (e.getCode() == KeyCode.A) left = false;
            if (e.getCode() == KeyCode.D) right = false;
        });

        new javafx.animation.AnimationTimer() {
            @Override
            public void handle(long now) {
                canvas.update(up, down, left, right);
                canvas.render();
            }
        }.start();
    }
}