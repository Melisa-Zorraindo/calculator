package com.melisazor.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        try {
//        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("main-view.fxml"));
            BorderPane root = new BorderPane();
            GridPane grid = new GridPane();
//            grid.setGridLinesVisible(true);

            root.setCenter(grid);
            Scene scene = new Scene(root, 325, 495);

            Image calculatorIcon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("calculator-icon.png")));
            stage.getIcons().add(calculatorIcon);

            stage.setTitle("Calculator");

            double btnWidth = 75.0;
            double btnHeight = 50.0;
            double inset = 2.5;

            Font fontSize = new Font(16.0);

            Button backspace = new Button("C");
            backspace.setMinSize(btnWidth, btnHeight);
            backspace.setStyle("-fx-background-color: #ffcbcb");
            backspace.setFont(fontSize);
            GridPane.setMargin(backspace, new Insets(inset,inset,inset,inset));
            Button openBracket = new Button("(");
            openBracket.setMinSize(btnWidth, btnHeight);
            openBracket.setFont(fontSize);
            GridPane.setMargin(openBracket, new Insets(inset,inset,inset,inset));
            Button closeBracket = new Button(")");
            closeBracket.setMinSize(btnWidth, btnHeight);
            closeBracket.setFont(fontSize);
            GridPane.setMargin(closeBracket, new Insets(inset,inset,inset,inset));
            Button plus = new Button("+");
            plus.setMinSize(btnWidth, btnHeight);
            plus.setFont(fontSize);
            GridPane.setMargin(plus, new Insets(inset,inset,inset,inset));
            Button seven = new Button("7");
            seven.setMinSize(btnWidth, btnHeight);
            seven.setFont(fontSize);
            GridPane.setMargin(seven, new Insets(inset,inset,inset,inset));
            Button eight = new Button("8");
            eight.setMinSize(btnWidth, btnHeight);
            eight.setFont(fontSize);
            GridPane.setMargin(eight, new Insets(inset,inset,inset,inset));
            Button nine = new Button("9");
            nine.setMinSize(btnWidth, btnHeight);
            nine.setFont(fontSize);
            GridPane.setMargin(nine, new Insets(inset,inset,inset,inset));
            Button minus = new Button("-");
            minus.setMinSize(btnWidth, btnHeight);
            minus.setFont(fontSize);
            GridPane.setMargin(minus, new Insets(inset,inset,inset,inset));
            Button four = new Button("4");
            four.setMinSize(btnWidth, btnHeight);
            four.setFont(fontSize);
            GridPane.setMargin(four, new Insets(inset,inset,inset,inset));
            Button five = new Button("5");
            five.setMinSize(btnWidth, btnHeight);
            five.setFont(fontSize);
            GridPane.setMargin(five, new Insets(inset,inset,inset,inset));
            Button six = new Button("6");
            six.setMinSize(btnWidth, btnHeight);
            six.setFont(fontSize);
            GridPane.setMargin(six, new Insets(inset,inset,inset,inset));
            Button times = new Button("×");
            times.setMinSize(btnWidth, btnHeight);
            times.setFont(fontSize);
            GridPane.setMargin(times, new Insets(inset,inset,inset,inset));
            Button one = new Button("1");
            one.setMinSize(btnWidth, btnHeight);
            one.setFont(fontSize);
            GridPane.setMargin(one, new Insets(inset,inset,inset,inset));
            Button two = new Button("2");
            two.setMinSize(btnWidth, btnHeight);
            two.setFont(fontSize);
            GridPane.setMargin(two, new Insets(inset,inset,inset,inset));
            Button three = new Button("3");
            three.setMinSize(btnWidth, btnHeight);
            three.setFont(fontSize);
            GridPane.setMargin(three, new Insets(inset,inset,inset,inset));
            Button split = new Button("÷");
            split.setMinSize(btnWidth, btnHeight);
            split.setFont(fontSize);
            GridPane.setMargin(split, new Insets(inset,inset,inset,inset));
            Button dot = new Button(".");
            dot.setMinSize(btnWidth, btnHeight);
            dot.setFont(fontSize);
            GridPane.setMargin(dot, new Insets(inset,inset,inset,inset));
            Button zero = new Button("0");
            zero.setMinSize(btnWidth, btnHeight);
            zero.setFont(fontSize);
            GridPane.setMargin(zero, new Insets(inset,inset,inset,inset));
            Button equal = new Button("=");
            equal.setMinSize((btnWidth * 2) + (inset * 2), btnHeight);
            equal.setStyle("-fx-background-color: #d0f0c0");
            zero.setFont(fontSize);
            GridPane.setMargin(equal, new Insets(inset,inset,inset,inset));

            grid.add(backspace, 0, 0, 1, 1);
            grid.add(openBracket, 1, 0, 1, 1);
            grid.add(closeBracket, 2, 0, 1, 1);
            grid.add(plus, 3, 0, 1, 1);

            grid.add(seven, 0, 1, 1, 1);
            grid.add(eight, 1, 1, 1, 1);
            grid.add(nine, 2, 1, 1, 1);
            grid.add(minus, 3, 1, 1, 1);

            grid.add(four, 0, 2, 1, 1);
            grid.add(five, 1, 2, 1, 1);
            grid.add(six, 2, 2, 1, 1);
            grid.add(times, 3, 2, 1, 1);

            grid.add(one, 0, 3, 1, 1);
            grid.add(two, 1, 3, 1, 1);
            grid.add(three, 2, 3, 1, 1);
            grid.add(split, 3, 3, 1, 1);

            grid.add(dot, 0, 4, 1, 1);
            grid.add(zero, 1, 4, 1, 1);
            grid.add(equal, 2, 4, 2, 1);

            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}