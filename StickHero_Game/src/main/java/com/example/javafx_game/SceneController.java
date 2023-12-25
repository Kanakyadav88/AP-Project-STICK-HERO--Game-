package com.example.javafx_game;

import javafx.animation.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.Random;
import java.util.ResourceBundle;

class PlatformWrapper {
    private Rectangle platformOne;
    private Rectangle platformTwo;

    public PlatformWrapper(Rectangle platformOne, Rectangle platformTwo) {
        this.platformOne = platformOne;
        this.platformTwo = platformTwo;
    }

    public Rectangle getPlatformOne() {
        return platformOne;
    }

    public void setPlatformOne(Rectangle platformOne) {
        this.platformOne = platformOne;
    }

    public Rectangle getPlatformTwo() {
        return platformTwo;
    }

    public void setPlatformTwo(Rectangle platformTwo) {
        this.platformTwo = platformTwo;
    }
}

public class SceneController {
    private static SceneController instance;

    public static SceneController getInstance() {
        if (instance == null) {
            instance = new SceneController();
        }
        return instance;
    }
    private GameElementFactory factory = new GameElementFactoryImpl();

    // Use the factory methods to create game elements
    private Rectangle platformOne = factory.createRectangle(80.0, 182.0, Color.BLACK, 38, 192);
    private Rectangle platformTwo = factory.createRectangle(100, 182.0, Color.BLACK, 300, 192);
    private Circle charFace = factory.createCircle(Color.YELLOW, 10, 96, 152);
    private Rectangle charBody = factory.createRectangle(23, 30, Color.DODGERBLUE, 85, 162);
    // Other game elements...

    // Update the rest of the code to use the factory-created elements
    // ...

    @FXML
    private AnchorPane Anchor;

    @FXML
    private Button EndButton;

    @FXML
    private ImageView bgimage;

    @FXML
    private Circle circile_face;

    @FXML
    private Circle circle_eye;

    @FXML
    private Rectangle firstpillar;

    @FXML
    private Text initial_score;

    @FXML
    private Line line_band;

    @FXML
    private Pane pane;

    private Pane globalPain;

    @FXML
    private Rectangle rec2;

    @FXML
    private Rectangle rec_body;

    @FXML
    private Rectangle secondPillar;

    @FXML
    private Rectangle stick;


    @FXML
    private Text wel_text;

    private Stage stage;
    private Scene scene;
    private Parent root;

    private static Rectangle platform1;
    private static Rectangle platform2;

    private boolean isSpace = false;
    private boolean isMoving = false;  // Flag to check if the character is moving

    private Rotate rotate;
    private Timeline rotateTimeline = new Timeline();  // Initialize rotateTimeline directly

    public static char[] getCurrScore() {
        return null;

    }

    public static char[] getCherrycount() {
        return null;
    }


    public void switchtoEndScreen(ActionEvent e) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("End.fxml")));
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchtoGameScreen(ActionEvent e) throws IOException {
//        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello-view.fxml")));
//        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();


        Rectangle stick1 = new Rectangle();
        stick1.setHeight(0);
        stick1.setWidth(4);
        stick1.setFill(Color.BROWN);
        stick1.setX(109);
        stick1.setY(192);

        Rectangle platformOne = new Rectangle();
        platformOne.setHeight(182.0);
        platformOne.setWidth(80.0);
        platformOne.setFill(Color.BLACK);
        platformOne.setLayoutX(38);
        platformOne.setLayoutY(192);
        platform1 = platformOne;

        Rectangle platformTwo = new Rectangle();
        platformTwo.setHeight(182.0);
        platformTwo.setWidth(100);
        platformTwo.setFill(Color.BLACK);
        platformTwo.setLayoutX(300);
        platformTwo.setLayoutY(192);
        platform2 = platformTwo;

        Circle charFace = new Circle();
        charFace.setFill(Color.YELLOW);
        charFace.setLayoutX(96);
        charFace.setLayoutY(152);
        charFace.setRadius(10);
        charFace.setStroke(Color.BLACK);
        charFace.setStrokeWidth(0.5);

        Rectangle charBody = new Rectangle(23, 30);
        charBody.setX(85);
        charBody.setY(162);
        charBody.setFill(Color.DODGERBLUE);
        charBody.setStroke(Color.BLACK);
        charBody.setStrokeWidth(0.5);

        Line charLine = new Line(88, 148, 104, 148);
        charLine.setFill(Color.RED);
        charLine.setStrokeWidth(3.0);
        charLine.setStroke(Color.RED);
        charLine.setStrokeLineCap(StrokeLineCap.ROUND);
        charLine.setStrokeLineJoin(StrokeLineJoin.MITER);

        //<Circle fx:id="circle_eye" fill="#f1f3f4" layoutX="92.0" layoutY="52.0" radius="3.0" stroke="BLACK" strokeType="INSIDE" strokeWidth="0.2"
        Circle charEye = new Circle();
        charEye.setFill(Color.WHITE);
        charEye.setRadius(3.0);
        charEye.setStroke(Color.BLACK);
        charEye.setStrokeWidth(0.5);
        charEye.setLayoutX(100);
        charEye.setLayoutY(150);

        Pane pane2 = new Pane();
        pane2.getChildren().addAll(charFace, charBody, charLine, charEye);
        pane2.setLayoutX(5);
        pane2.setLayoutY(2);

        Pane paneMain = new Pane();
        globalPain = paneMain;


//        pane1.setLayoutX(5); pane1.setLayoutY(2);

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello-view.fxml")));
        paneMain.getChildren().add(root);
        paneMain.getChildren().addAll(stick1, platform1, platform2, pane2);


        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scene = new Scene(paneMain);
        stage.setScene(scene);
        stage.show();


        Timeline extendTimeline = new Timeline(
                new KeyFrame(Duration.millis(10), event -> extendStick(stick1))
        );
        extendTimeline.setCycleCount(Animation.INDEFINITE);

        scene.getRoot().requestFocus();

        scene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.SPACE && !isSpace) {
                isSpace = true;
                extendTimeline.play();
            }
        });

        scene.setOnKeyReleased(event -> {
            if (event.getCode() == KeyCode.SPACE && isSpace) {
                // Space key is released
                extendTimeline.stop();
                isSpace = false;
                isMoving = true; // Set isMoving to true
                rotateStick(stick1, pane2, platformOne, platformTwo, pane2);
            }
        });


    }
    public void switchtoStartScreen(ActionEvent e) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Start.fxml")));
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    private void extendStick(Rectangle stick) {
        // Function to extend the stick when the space key is pressed
        if (isSpace) {
            stick.setHeight(stick.getHeight() + 1.0);
            stick.setY(stick.getY() - 1.0);
        }
    }

    @FXML
    private void rotateStick(Rectangle stick, Pane character, Rectangle platformOne, Rectangle platformTwo, Pane panes) {
        double pivotX = stick.getX() + stick.getWidth() / 2;
        double pivotY = stick.getY() + stick.getHeight();

        rotate = new Rotate(0, pivotX, pivotY);

        stick.getTransforms().add(rotate);

        rotateTimeline.getKeyFrames().clear();  // Clear any existing keyframes

        rotateTimeline.getKeyFrames().add(
                new KeyFrame(Duration.millis(10), event -> {
                    if (rotate.getAngle() < 90) {
                        rotate.setAngle(rotate.getAngle() + 1.0);
                    } else {
                        rotateTimeline.stop();
                        startMoveTimeline(stick, character, panes);
                    }
                })
        );
        rotateTimeline.setCycleCount(Animation.INDEFINITE);

        rotateTimeline.play();
    }

    private void fall(Pane character, Pane panes) {
        Path path = new Path();
        path.getElements().add(new MoveTo(character.getTranslateX(), character.getTranslateY()));
        path.getElements().add(new LineTo(character.getTranslateX(), 650)); // The Y coordinate where it falls to

        PathTransition pathTransition = new PathTransition();
        pathTransition.setPath(path);
        pathTransition.setNode(character);
        pathTransition.setCycleCount(1);

        pathTransition.setOnFinished(event -> {
            // Logic to handle character falling
            panes.getChildren().remove(character);
            // Other actions after falling
        });

        pathTransition.play();
    }


    private void startMoveTimeline(Rectangle stick, Pane character, Pane pane1) {

        PlatformWrapper platformWrapper = new PlatformWrapper(platform1, platform2);

        double pivotX = stick.getX() + stick.getWidth() / 2;
        double pivotY = stick.getY() + stick.getHeight();

        double angle = Math.toRadians(90); // Adjust the angle as needed

        // Calculate the end position of the stick
        double stickEndX = pivotX + (stick.getHeight() * Math.sin(angle));
        double stickEndY = pivotY - (stick.getHeight() * Math.cos(angle));

        // Calculate the character's initial position
        double startX = character.getLayoutX() + character.getBoundsInParent().getWidth() / 2;
        double startY = character.getLayoutY() + character.getBoundsInParent().getHeight() / 2;

        // Create a Path
        Path path = new Path();
        path.getElements().add(new MoveTo(startX, startY));
        path.getElements().add(new LineTo(stickEndX - character.getBoundsInParent().getWidth() / 2,
                stickEndY - character.getBoundsInParent().getHeight() / 2));

        // Create a PathTransition
        PathTransition pathTransition = new PathTransition();
        pathTransition.setPath(path);
        pathTransition.setNode(character);
        pathTransition.setCycleCount(1); // Change this back to 1 for a single movement

        // Set up a listener for the transition
        pathTransition.setOnFinished(event -> {
//            if (stickEndX - character.getBoundsInParent().getWidth() / 2 < platformTwo.getBoundsInParent().getMinX()) {
//                handleStickRemoval(stick, pane1);
//                createNewStick(platformTwo, pane1);
//                //shiftScreen(platformOne, platformTwo, pane1);
//
//                // Assuming 'character' is the pane containing the player, you might want to update its position accordingly
//                // character.setLayoutX(...); // Update character's X position if needed
//                // character.setLayoutY(...); // Update character's Y position if needed
//            } else {
//                fall(character, pane1);
//            }

            stick.setVisible(false);
            character.setTranslateX(0);
            character.setLayoutX(platform1.getLayoutX()-20);
            platform2.setLayoutX(platform1.getLayoutX());
            platform1.setVisible(false);
            platform1 = platform2;
            platform2 = randomRectangle();
            globalPain.getChildren().add(platform2);

            isMoving = false; // Set isMoving to false
        });

        // Play the PathTransition
        pathTransition.play();
    }

    private void handleStickRemoval(Rectangle stick, Pane pane1) {
        // Remove the stick from the AnchorPane
        pane1.getChildren().remove(stick);
    }

    private void createNewStick(Rectangle platform, Pane pane1) {
        // Create a new stick at the end of the platform
        Rectangle newStick = new Rectangle();
        newStick.setHeight(0);
        newStick.setWidth(4);
        newStick.setFill(Color.BROWN);
        newStick.setX(platform.getX() + platform.getWidth() - 4); // Place it at the end of the platform
        newStick.setY(platform.getY());

        Anchor.getChildren().add(newStick);
    }

    private void fall(Pane character, AnchorPane anchorPane) {
        PathTransition pathTransition = new PathTransition();
        Path path = new Path(new MoveTo(character.getTranslateX(), character.getTranslateY()), new LineTo(character.getTranslateX(), 650));
        pathTransition.setPath(path);
        pathTransition.setNode(character);
        pathTransition.setCycleCount(1);
        pathTransition.setDuration(Duration.seconds(2000)); // Set duration for the falling animation

        pathTransition.setOnFinished(event -> {
            anchorPane.getChildren().remove(character);
            // Other actions after falling
        });

        pathTransition.play();
    }



    Rectangle randomRectangle() {
        Random random = new Random();
        Rectangle newPillar = new Rectangle();
        newPillar.setHeight(platform1.getHeight());
        double minX = platform1.getWidth()+100;
        double maxX = 300;
        newPillar.setLayoutX(random.nextDouble() * (maxX - minX) + minX);
        newPillar.setWidth(random.nextDouble() * (100 - 30) + 30);
        newPillar.setLayoutY(platform1.getLayoutY());

        return newPillar;

    }
}