package com.example.assignment_5;

import javafx.scene.Group;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
/*
* @author: Bhaveshkumar Patel
* */
public class RollController {
    /*
     *  declaring group, circles variable, str and some counter variables globally.
     */
    private Group root;
    private Circle circle,Circle2,Circle3,Circle4,Circle5,Circle6,circles,Circles2,Circles3,Circles4,Circles5,Circles6 = new Circle();
    String str;
    int count,syscount,total,tiecount = 0;
    /*
    *   The below function will clear the previous output and assign the random numbers from the RollOn class and update and display the count and call the appropriate class.
    * */
    public void roll(int a, int b){
        root.getChildren().removeAll(circle,Circle2,Circle3,Circle4,Circle5,Circle6,circles,Circles2,Circles3,Circles4,Circles5,Circles6);
        int a1 = a;
        int b1 = b;
        total ++;
        if(a < b){
            count++;
            str = "You Won Click Roll to Roll the dice again.\nYou Played: "+ total +" \nYour score is: " +count +"\nComputer's score is:"+syscount+ "\nAnd Total Tied: "+tiecount;
        } else if (a > b) {
            syscount ++;
            str = "You Lost this time Click Roll to Roll the dice again.\nYou Played: "+ total +" \nYour score is: " +count +"\nComputer's score is:"+syscount+ "\nAnd Total Tied: "+tiecount;
        }
        else{
            tiecount++;
            str = "It's a Tie Click Roll to Roll the dice.\nYou Played: "+ total +" \nYour Score is: " +count +" \nComputer's score is: "+syscount+ "\nAnd Total Tied: "+tiecount;
        }
        coroll(a1);
        userroll(b1);
    }
    /*?
    * This function will call appropriate class as per the random number.
    * */
    private void coroll(int a) {
        switch (a){
            case 1:
                point1(1);
                break;
            case 2:
                point2(1);
                break;
            case 3:
                point3(1);
                break;
            case 4:
                point4(1);
                break;
            case 5:
                point5(1);
                break;
            case 6:
                point6(1);
                break;
        }
    }

    /*
    *   This function will call the appropriate number according to the random numbers.
    * */
    private void userroll(int b) {
        switch (b){
            case 1:
                point1(2);
                break;
            case 2:
                point2(2);
                break;
            case 3:
                point3(2);
                break;
            case 4:
                point4(2);
                break;
            case 5:
                point5(2);
                break;
            case 6:
                point6(2);
                break;
        }
    }
//This will display one circle on the dice.
    private void point1(int i) {
        if (i == 1) {
            circles =new Circle(240,240,10,Color.RED);
            root.getChildren().addAll(circles);
        }
        else if(i == 2) {
            circle = new Circle(440,240,10,Color.RED);
            root.getChildren().addAll(circle);
        }

    }
    //This will display Two circles on the dice.
    private void point2(int i) {

        if (i == 1) {
            circles =new Circle(225,240,10,Color.BLUE);
            Circles2 = new Circle(255,240,10,Color.BLUE);
            root.getChildren().addAll(circles,Circles2);
        } else if (i == 2) {
            circle = new Circle(425,240,10,Color.BLUE);
            Circle2 = new Circle(455,240,10,Color.BLUE);
            root.getChildren().addAll(circle,Circle2);
        }

    }
    //This will display Three circles on the dice.
    private void point3(int i) {
        if (i == 1) {
            circles = new Circle(215,215,10,Color.BLUE);
            Circles2 =new Circle(240,240,10,Color.BLUE);
            Circles3 = new Circle(265,265,10,Color.BLUE);
            root.getChildren().addAll(circles,Circles2,Circles3);
        } else if (i == 2) {
            circle = new Circle(415,215,10,Color.BLUE);
            Circle2 =new Circle(440,240,10,Color.BLUE);
            Circle3 = new Circle(465,265,10,Color.BLUE);
            root.getChildren().addAll(circle,Circle2,Circle3);
        }

    }
    //This will display Four circles on the dice.
    private void point4(int i) {
        if (i == 1) {
            circles = new Circle(215,215,10,Color.BLUE);
            Circles2 =new Circle(265,215,10,Color.BLUE);
            Circles3 =new Circle(215,265,10,Color.BLUE);
            Circles4 =new Circle(265,265,10,Color.BLUE);
            root.getChildren().addAll(circles,Circles2,Circles3,Circles4);
        } else if (i == 2) {
            circle = new Circle(415,215,10,Color.BLUE);
            Circle2 =new Circle(465,215,10,Color.BLUE);
            Circle3 =new Circle(415,265,10,Color.BLUE);
            Circle4 =new Circle(465,265,10,Color.BLUE);
            root.getChildren().addAll(circle,Circle2,Circle3,Circle4);
        }
    }
    //This will display Five circles on the dice.
    private void point5(int i) {
        if (i == 1) {
            circles = new Circle(215,215,10,Color.BLUE);
            Circles2 =new Circle(265,215,10,Color.BLUE);
            Circles3 =new Circle(215,265,10,Color.BLUE);
            Circles4 =new Circle(265,265,10,Color.BLUE);
            Circles5 =new Circle(240,240,10,Color.BLUE);
            root.getChildren().addAll(circles,Circles2,Circles3,Circles4,Circles5);
        } else if (i == 2) {
            circle = new Circle(415,215,10,Color.BLUE);
            Circle2 =new Circle(465,215,10,Color.BLUE);
            Circle3 =new Circle(415,265,10,Color.BLUE);
            Circle4 =new Circle(465,265,10,Color.BLUE);
            Circle5 =new Circle(440,240,10,Color.BLUE);
            root.getChildren().addAll(circle,Circle2,Circle3,Circle4,Circle5);
        }
    }
    //This will display Six circles on the dice.
    private void point6(int i) {
        if (i == 1) {
            circles = new Circle(225,215,10,Color.BLUE);
            Circles2 =new Circle(255,215,10,Color.BLUE);
            Circles3 =new Circle(225,265,10,Color.BLUE);
            Circles4 =new Circle(255,265,10,Color.BLUE);
            Circles5 =new Circle(225,240,10,Color.BLUE);
            Circles6 =new Circle(255,240,10,Color.BLUE);
            root.getChildren().addAll(circles,Circles2,Circles3,Circles4,Circles5,Circles6);
        } else if (i == 2) {
            circle = new Circle(425,215,10,Color.BLUE);
            Circle2 =new Circle(455,215,10,Color.BLUE);
            Circle3 =new Circle(425,265,10,Color.BLUE);
            Circle4 =new Circle(455,265,10,Color.BLUE);
            Circle5 =new Circle(455,240,10,Color.BLUE);
            Circle6 =new Circle(425,240,10,Color.BLUE);
            root.getChildren().addAll(circle,Circle2,Circle3,Circle4,Circle5,Circle6);
        }
    }
    //This function will set the variable root globally.
    public void setroot(Group root) {
        this.root = root;
    }
    //This function will pass the string output to the RollOn.java class.
    public String toString(){
        return str;
    }
}