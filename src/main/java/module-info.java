module com.example.jfx_practice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.jfx_practice to javafx.fxml;
    exports com.example.jfx_practice;
}