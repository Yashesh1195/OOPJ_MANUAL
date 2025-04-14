package com.example.practical8a;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Practical_8A_3 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        Line l1 = new Line();
        Line l2 = new Line();
        Line l3 = new Line();
        Line l4 = new Line();
        Line l5 = new Line();
        Line l6 = new Line();
        Line l7 = new Line();
        Line l8 = new Line();
        Line l9 = new Line();
        Line l10 = new Line();
        Line l11 = new Line();
        Line l12 = new Line();

        pane.getChildren().addAll(l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12);

        pane.widthProperty().addListener(ov -> paint(pane, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12));
        pane.heightProperty().addListener(ov -> paint(pane, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12));

        paint(pane, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12);

        Scene scene = new Scene(pane, 250, 250);
        primaryStage.setTitle("Practical_8A_3");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void paint(Pane pane, Line l1, Line l2, Line l3, Line l4,
                       Line l5, Line l6, Line l7, Line l8,
                       Line l9, Line l10, Line l11, Line l12) {

        double width = pane.getWidth();
        double height = pane.getHeight();

        double gapX = width / 4;
        double gapY = height / 4;

        // Front face
        l1.setStartX(gapX); l1.setStartY(gapY);
        l1.setEndX(width - gapX); l1.setEndY(gapY);

        l2.setStartX(width - gapX); l2.setStartY(gapY);
        l2.setEndX(width - gapX); l2.setEndY(height - gapY);

        l3.setStartX(width - gapX); l3.setStartY(height - gapY);
        l3.setEndX(gapX); l3.setEndY(height - gapY);

        l4.setStartX(gapX); l4.setStartY(height - gapY);
        l4.setEndX(gapX); l4.setEndY(gapY);

        // Back face
        l5.setStartX(gapX + gapX / 2); l5.setStartY(gapY - gapY / 2);
        l5.setEndX(width - gapX + gapX / 2); l5.setEndY(gapY - gapY / 2);

        l6.setStartX(width - gapX + gapX / 2); l6.setStartY(gapY - gapY / 2);
        l6.setEndX(width - gapX + gapX / 2); l6.setEndY(height - gapY - gapY / 2);

        l7.setStartX(width - gapX + gapX / 2); l7.setStartY(height - gapY - gapY / 2);
        l7.setEndX(gapX + gapX / 2); l7.setEndY(height - gapY - gapY / 2);

        l8.setStartX(gapX + gapX / 2); l8.setStartY(height - gapY - gapY / 2);
        l8.setEndX(gapX + gapX / 2); l8.setEndY(gapY - gapY / 2);

        // Connect corners
        l9.setStartX(gapX); l9.setStartY(gapY);
        l9.setEndX(gapX + gapX / 2); l9.setEndY(gapY - gapY / 2);

        l10.setStartX(width - gapX); l10.setStartY(gapY);
        l10.setEndX(width - gapX + gapX / 2); l10.setEndY(gapY - gapY / 2);

        l11.setStartX(width - gapX); l11.setStartY(height - gapY);
        l11.setEndX(width - gapX + gapX / 2); l11.setEndY(height - gapY - gapY / 2);

        l12.setStartX(gapX); l12.setStartY(height - gapY);
        l12.setEndX(gapX + gapX / 2); l12.setEndY(height - gapY - gapY / 2);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
