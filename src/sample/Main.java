package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Hello World");

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setMinHeight(420);
        gridPane.setMinWidth(560);
        gridPane.setHgap(22);
        gridPane.setVgap(22);
        gridPane.setPadding(new Insets(10,20,10,20));
        Scene scene = new Scene(gridPane,800,600);

        primaryStage.setMinWidth(560);
        primaryStage.setMinHeight(420);
        primaryStage.setScene(scene);
        primaryStage.show();

        TextArea inputTextField = new TextArea();

        Label inputLabel = new Label("从此输入");
        inputLabel.setFont(Font.font(20));
        gridPane.add(inputLabel,0,0,3,1);
        gridPane.add(inputTextField,0,1,3,16);

        TextArea outputTextField = new TextArea();
        outputTextField.setEditable(false);
        outputTextField.setWrapText(true);
        gridPane.add(outputTextField,5,1,3,16);

        Button button = new Button("转换");
        gridPane.add(button,3,8,2,1);

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String a = String.valueOf(inputTextField.getParagraphs());
                //转换处理
                outputTextField.setText(a);
            }
        });
    }



    public static void main(String[] args) {
        launch(args);
    }
}
