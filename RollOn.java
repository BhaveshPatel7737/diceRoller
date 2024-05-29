package com.example.assignment_5;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;
/*
 * @author: Bhavesh Patel
 * */
public class RollOn extends Application {

    RollController r1 = new RollController();
    String str;
    public Label out_label = new Label("");
    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();
        Scene scene = new Scene(root);
        Canvas canvas = new Canvas(1080,720);
        stage.setTitle("Rolling Game!");
        root.getChildren().add(canvas);
        stage.setScene(scene);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        stage.show();

//        gc.getCanvas();
        //this code going to create a Rectangle
        Rectangle rec = new Rectangle(200,200,80,80);
        rec.setFill(Color.TRANSPARENT);
        rec.setStroke(Color.BLACK);
        rec.setArcHeight(20);
        rec.setArcWidth(20);
        Rectangle rec2 = new Rectangle(400,200,80,80);
        rec2.setFill(Color.TRANSPARENT);
        rec2.setStroke(Color.BLACK);
        rec2.setArcHeight(20);
        rec2.setArcWidth(20);

        //this is for label
        Label label = new Label("Computer's Dice:");
        Label label1 =new Label("Your Dice:");
        label.setTextFill(Color.BLACK);
        label1.setTextFill(Color.BLACK);
        Button b1 = new Button("Roll");
        root.getChildren().addAll(label,label1,b1,rec,rec2,out_label);
        label.relocate(200,100);
        label1.relocate(400,100);
        b1.relocate(325,500);
        out_label.relocate(200,350);
        b1.setOnAction(this::buttonHandler);
        r1.setroot(root);
    }
    private void buttonHandler(ActionEvent actionEvent) {
        int a = (int)((Math.random() * 6) + 1);
        int b = (int)((Math.random() * 6) + 1);
        r1.roll(a,b);
        str = r1.toString();
        out_label.setText(str);
    }
    public static void main(String[] args) {
        launch();
    }
}