package io.github.enishlabs.logpad;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LogpadApp extends Application
{
    private AnnotationConfigApplicationContext context;
    private Parent root;

    @Override
    public void init() throws Exception
    {
        context = new AnnotationConfigApplicationContext(LogpadConfiguration.class);
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("main_window.fxml"));
        fxmlLoader.setControllerFactory(context::getBean);
        root = fxmlLoader.load();
    }

    @Override
    public void start(Stage primaryStage)
    {
        primaryStage.setTitle("LogPad");

        primaryStage.setScene(new Scene(root));

        primaryStage.show();
    }

    @Override
    public void stop() throws Exception
    {
        context.close();
    }

    public static void main(String[] args)
    {
        launch(LogpadApp.class, args);
    }
}

