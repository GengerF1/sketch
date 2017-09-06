package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        final VBox vBox;
        final Button button1, button2, button3;
        final Scene scene;

        vBox = new VBox();
        {
            button1 = new Button("test");
            button1.setId("white_button");
            button2 = new Button("test");
            button2.setId("black_button");
            button3 = new Button("test");
            button3.setId("white_button");
        }
        scene = new Scene(vBox, 150, 100);

        vBox.getChildren().addAll(button1, button2, button3);
        scene.getStylesheets().add((getClass().getResource("style.css")).toExternalForm());
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
