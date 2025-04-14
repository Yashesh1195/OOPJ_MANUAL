package com.example.practical8a;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.Random;

public class Practical_8A_1 extends Application {
    @Override
    public void start(Stage primaryStage) {
        HBox hbox = new HBox(10); // Horizontal layout with spacing
        hbox.setStyle("-fx-alignment: center; -fx-padding: 20;");

        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            Text text = new Text("Java");

            // Set random color and opacity
            double r = rand.nextDouble();
            double g = rand.nextDouble();
            double b = rand.nextDouble();
            double opacity = 0.4 + rand.nextDouble() * 0.6; // opacity between 0.4 and 1
            text.setFill(new Color(r, g, b, opacity));

            // Set font to Times Roman, Bold, Italic, 22 pixels
            text.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));

            // Rotate the text to vertical (bottom-up)
            text.setRotate(90);

            hbox.getChildren().add(text);
        }

        Scene scene = new Scene(hbox, 300, 150);
        primaryStage.setTitle("Practical_8A_1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
