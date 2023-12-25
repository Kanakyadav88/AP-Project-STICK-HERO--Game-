package com.example.javafx_game;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class GameElementFactoryImpl implements GameElementFactory{
    @Override
    public Rectangle createRectangle(double width, double height, Color fill, double layoutX, double layoutY) {
        Rectangle rectangle = new Rectangle(width, height);
        rectangle.setFill(fill);
        rectangle.setLayoutX(layoutX);
        rectangle.setLayoutY(layoutY);
        return rectangle;
    }

    @Override
    public Circle createCircle(Color fill, double radius, double layoutX, double layoutY) {
        Circle circle = new Circle(radius);
        circle.setFill(fill);
        circle.setLayoutX(layoutX);
        circle.setLayoutY(layoutY);
        return circle;
    }

    @Override
    public Pane createPane() {
        return new Pane();
    }

    @Override
    public Rectangle createRectangle(double width, double height, Color black, int layoutX, int layoutY) {
        return null;
    }
}
