package com.kjq;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JiSuanQi {

    String zong = "";
    Double num1 = 0.0;
    int num = 0;

    public static void main(String[] args) {
        new JiSuanQi().aa();
    }
    public void aa(){
        Frame frame = new Frame("计算器");
        TextField tf = new TextField(30);
        Button button = new Button("清空");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("");
                zong = "";
                num1 = 0.0;
                num = 0;
            }
        });

        Box hb = Box.createHorizontalBox();
        hb.add(tf);
        hb.add(button);

        frame.add(hb, BorderLayout.NORTH);
        Panel panel = new Panel(new GridLayout(4, 4, 4, 4));
        frame.add(panel);

        String name[] = {"1", "2", "3", "+", "4", "5", "6", "-", "7", "8", "9", "*", ".", "0", "=", "/"};

        for (int i = 0; i < name.length; i++) {
            Button button1 = new Button(name[i]);
            panel.add(button1);
            this.bb(button1, tf);
        }

        //给x号添加监听器
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

        frame.setVisible(true);
        frame.pack();
    }

    /**
     * 给按钮事件添加监听
     */
    public void bb(Button button, TextField tf){
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (button.getLabel()){
                    case "1":
                        zong = tf.getText() + "1";
                        tf.setText(zong);
                        break;
                    case "2":
                        zong = tf.getText() + "2";
                        tf.setText(zong);
                        break;
                    case "3":
                        zong = tf.getText() + "3";
                        tf.setText(zong);
                        break;
                    case "4":
                        zong = tf.getText() + "4";
                        tf.setText(zong);
                        break;
                    case "5":
                        zong = tf.getText() + "5";
                        tf.setText(zong);
                        break;
                    case "6":
                        zong = tf.getText() + "6";
                        tf.setText(zong);
                        break;
                    case "7":
                        zong = tf.getText() + "7";
                        tf.setText(zong);
                        break;
                    case "8":
                        zong = tf.getText() + "8";
                        tf.setText(zong);
                        break;
                    case "9":
                        zong = tf.getText() + "9";
                        tf.setText(zong);
                        break;
                    case "0":
                        zong = tf.getText() + "0";
                        tf.setText(zong);
                        break;
                    case "+":
                        num1 = Double.parseDouble(tf.getText());
                        num = 1;
                        tf.setText("");
                        break;
                    case "-":
                        num1 = Double.parseDouble(tf.getText());
                        num = 2;
                        tf.setText("");
                        break;
                    case "*":
                        num1 = Double.parseDouble(tf.getText());
                        num = 3;
                        tf.setText("");
                        break;
                    case "/":
                        num1 = Double.parseDouble(tf.getText());
                        num = 4;
                        tf.setText("");
                        break;
                    case ".":
                        Pattern compile = Pattern.compile("\\d.");
                        Matcher matcher = compile.matcher(tf.getText());
                        if (tf.getText().equals("")) {
                            tf.setText("0.");
                        }else if(matcher.find()){}else{
                            zong = tf.getText() + ".";
                            tf.setText(zong);
                        }
                        break;
                    case "=":
                        if (num == 1){
                            num1 = num1 + Double.parseDouble(tf.getText());
                            tf.setText(String.valueOf(num1));
                        }else if(num == 2){
                            num1 = num1 - Double.parseDouble(tf.getText());
                            tf.setText(String.valueOf(num1));
                        }else if(num == 3){
                            num1 = num1 * Double.parseDouble(tf.getText());
                            tf.setText(String.valueOf(num1));
                        }else if(num == 4){
                            num1 = num1 / Double.parseDouble(tf.getText());
                            tf.setText(String.valueOf(num1));
                        }
                        num = 0;
                        break;
                }
            }
        });
    }
}
