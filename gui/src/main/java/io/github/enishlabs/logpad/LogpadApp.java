package io.github.enishlabs.logpad;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LogpadApp extends Application
{
    private Parent root;

    public static void main(String[] args)
    {
        launch(LogpadApp.class, args);
    }

    @Override
    public void init() throws Exception
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("main_window.fxml"));
        fxmlLoader.setControllerFactory(new LogpadControllerFactory());
        root = fxmlLoader.load();
    }

    @Override
    public void start(Stage primaryStage)
    {
        primaryStage.setTitle("LogPad");

        primaryStage.setScene(new Scene(root));

        primaryStage.show();
    }
}
