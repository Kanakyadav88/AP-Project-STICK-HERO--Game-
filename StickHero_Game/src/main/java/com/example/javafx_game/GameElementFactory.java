package com.example.javafx_game;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public interface GameElementFactory {
    Rectangle createRectangle(double width, double height, Color fill, double layoutX, double layoutY);
    Circle createCircle(Color fill, double radius, double layoutX, double layoutY);
    Pane createPane();

    Rectangle createRectangle(double width, double height, Color black, int layoutX, int layoutY);
}
