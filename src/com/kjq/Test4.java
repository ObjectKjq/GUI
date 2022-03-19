package com.kjq;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test4{
    Frame frame = new Frame("测试");
    TextField textField = new TextField(50);
    Button button = new Button("隐藏");
    public static void main(String[] args) {
        new Test4().test();
    }

    public void test() {
        frame.setLayout(new FlowLayout());
        frame.add(textField);
        frame.add(button);

        button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("隐藏")){
                    textField.setVisible(false);
                    button.setLabel("显示");
                }else {
                    textField.setVisible(true);
                    button.setLabel("隐藏");
                }
            }
        });

        frame.setVisible(true);
        frame.pack();
    }
}
