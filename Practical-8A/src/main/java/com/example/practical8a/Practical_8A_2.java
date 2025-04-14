package com.example.practical8a;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Practical_8A_2 extends Application {

    @Override
    public void start(Stage primaryStage) {
        HBox hbox = new HBox(15); // Horizontal box with spacing
        hbox.setStyle("-fx-padding: 20; -fx-alignment: bottom-left;");

        // Project - 20%
        VBox projectBox = createBar("Project -- 20%", 0.2, Color.RED);
        // Quiz - 10%
        VBox quizBox = createBar("Quiz -- 10%", 0.1, Color.BLUE);
        // Midterm - 30%
        VBox midtermBox = createBar("Midterm -- 30%", 0.3, Color.GREEN);
        // Final - 40%
        VBox finalBox = createBar("Final -- 40%", 0.4, Color.ORANGE);

        // Add all bars to the HBox
        hbox.getChildren().addAll(projectBox, quizBox, midtermBox, finalBox);

        Scene scene = new Scene(hbox, 400, 200);
        primaryStage.setTitle("Practical_8A_2");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private VBox createBar(String label, double percentage, Color color) {
        // Base height to scale bars
        double maxHeight = 150;
        double barHeight = maxHeight * percentage;

        Rectangle bar = new Rectangle(60, barHeight);
        bar.setFill(color);

        Text text = new Text(label);
        VBox vbox = new VBox(5);
        vbox.setStyle("-fx-alignment: bottom-center;");
        vbox.getChildren().addAll(text, bar);

        return vbox;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
