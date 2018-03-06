package io.github.enishlabs.logpad;

import javafx.application.Application;
import javafx.stage.Stage;

public class LogpadApp extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
        System.out.println("Crunch trhough logs!");

        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}

