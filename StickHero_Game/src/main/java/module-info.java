module com.example.javafx_game {
    requires javafx.controls;
    requires javafx.fxml;
    requires junit;


    opens com.example.javafx_game to javafx.fxml;
    exports com.example.javafx_game;
}