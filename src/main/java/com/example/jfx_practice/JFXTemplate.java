package com.example.jfx_practice;

import javafx.application.Application;
import javafx.stage.Stage;
import java.io.IOException;

public class JFXTemplate extends Application {
    @Override
    public void start(Stage main_stage) throws IOException {
        main_stage.setTitle("Hello!");
        main_stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}