package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Hello World");

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(20,20,20,20));
        Scene scene = new Scene(gridPane,600,550);

        primaryStage.setScene(scene);
        primaryStage.show();

        TextArea inputTextField = new TextArea();
        gridPane.add(inputTextField,0,1,1,3);

        TextArea outputTextField = new TextArea();
        gridPane.add(outputTextField,6,1,1,3);

        Button button = new Button("转换");
        gridPane.add(button,1,3,5,1);

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String a = String.valueOf(inputTextField.getParagraphs());
                outputTextField.setText(a);
            }
        });
    }



    public static void main(String[] args) {
        launch(args);
    }
}
