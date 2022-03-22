package com.kjq;

import javax.swing.*;
import java.awt.*;

public class test9 {
    public static void main(String[] args) {
        new test9().dd();
    }

    public void dd(){
        Frame frame = new Frame();
        Box verticalBox = Box.createVerticalBox();
        Label label = new Label("请输入100以内的整数", Label.CENTER);
        TextField tf1 = new TextField(50);

        Box horizontalBox1 = Box.createHorizontalBox();
        Label label1 = new Label("错误提示: ", Label.CENTER);
        Label label2 = new Label();
        label2.setBackground(Color.red);
        horizontalBox1.add(label1);
        horizontalBox1.add(label2);


        Box horizontalBox2 = Box.createHorizontalBox();
        Label label3 = new Label("正确提示: ", Label.CENTER);
        Label label4 = new Label();
        label4.setBackground(Color.cyan);
        horizontalBox2.add(label3);
        horizontalBox2.add(label4);


        Box horizontalBox = Box.createHorizontalBox();
        Button button1 = new Button("确定");
        Button button2 = new Button("取消");
        horizontalBox.add(button1);
        horizontalBox.add(button2);

        verticalBox.add(label);
        verticalBox.add(tf1);
        verticalBox.add(horizontalBox1);
        verticalBox.add(horizontalBox2);
        verticalBox.add(horizontalBox);

        frame.add(verticalBox);
        frame.setVisible(true);
        frame.pack();
    }
}
