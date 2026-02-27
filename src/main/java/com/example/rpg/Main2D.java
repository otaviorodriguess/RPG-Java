package com.example.rpg;

import com.example.rpg.personagens.Heroi;
import com.example.rpg.ui.GameCanvas;
import com.example.rpg.ui.GameController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main2D extends Application {

    @Override
    public void start(Stage stage) {

        double largura = 800;
        double altura = 600;

        Heroi heroi = new Heroi("Arthur", 100, 100);
        GameCanvas canvas = new GameCanvas(largura, altura, heroi);

        StackPane root = new StackPane(canvas);
        Scene scene = new Scene(root, largura, altura);

        new GameController(canvas, scene, heroi);

        stage.setTitle("RPG 2D");
        stage.setScene(scene);
        stage.show();

        canvas.requestFocus();
    }

    public static void main(String[] args) {
        launch(args);
    }
}