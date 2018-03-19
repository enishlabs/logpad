package io.github.enishlabs.logpad;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;


public class Controller
{
    @FXML
    private TextArea textArea;

    public void close()
    {
        System.exit(0);
    }

    public void open() throws IOException
    {
        FileChooser fileChooser = new FileChooser();

        File file = fileChooser.showOpenDialog(null);

        textArea.clear();

        List<String> readAllLines = Files.readAllLines(file.toPath());
        for (int i = 0; i < readAllLines.size(); i++)
        {
            String l = readAllLines.get(i);
            textArea.appendText(l + "\n");
        }
    }
}
