package com.kjq;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class test9 {
    int num = 0;
    public static void main(String[] args) {
        new test9().dd();
    }

    public void dd(){
        int random = (int)(Math.random() * 100) + 1;
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

        button1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if(Integer.parseInt(tf1.getText()) > random){
                    num ++;
                    label2.setText("猜大了,共答了" + num);
                    tf1.setText("");
                }else if (Integer.parseInt(tf1.getText()) < random){
                    num ++;
                    label2.setText("猜小了,共答了" + num);
                    tf1.setText("");
                }else {
                    num ++;
                    label2.setText("");
                    label4.setText("恭喜答对了,共答了" + num);
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }
        });

        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                frame.dispose();
                System.exit(0);
            }
        });

        frame.setVisible(true);
        frame.pack();
    }
}
