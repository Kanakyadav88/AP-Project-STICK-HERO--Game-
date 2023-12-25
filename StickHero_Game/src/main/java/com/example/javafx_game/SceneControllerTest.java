package com.example.javafx_game;


import javafx.scene.shape.Rectangle;
import org.junit.Test;

import static org.junit.Assert.*;

public class SceneControllerTest {

    @Test
    public void testRandomRectangleAdded() {
        // Arrange
        SceneController sceneController = new SceneController();
        Rectangle platform1 = new Rectangle();
        platform1.setHeight(182.0);
        platform1.setWidth(80.0);
        platform1.setLayoutX(38);
        platform1.setLayoutY(192);

        // Act
        Rectangle randomRectangle = sceneController.randomRectangle();

        // Assert
        assertEquals("Height should be the same as platform1", randomRectangle.getHeight(), platform1.getHeight(), 0.0);
        assertTrue("Width should be between 30.0 and 100.0", randomRectangle.getWidth() >= 30.0 && randomRectangle.getWidth() <= 100.0);
        assertTrue("LayoutX should be between platform1.getWidth() + 100.0 and 300.0",
                randomRectangle.getLayoutX() >= platform1.getWidth() + 100.0 && randomRectangle.getLayoutX() <= 300.0);
        assertEquals("LayoutY should be the same as platform1", randomRectangle.getLayoutY(), platform1.getLayoutY(), 0.0);
    }
}