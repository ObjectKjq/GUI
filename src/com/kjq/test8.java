package com.kjq;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class test8 {
    public static void main(String[] args) {
        new test8().dd();
    }
    public void dd(){
        Frame frame = new Frame();
        TextField textField = new TextField();
        Button button = new Button("ȷ��");

        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                textField.setText("��굥��");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                textField.setText("��갴��");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                textField.setText("����ɿ�");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                textField.setText("������");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                textField.setText("����뿪");
            }
        });

        frame.setLayout(new FlowLayout());
        frame.add(textField);
        frame.add(button);
        frame.setVisible(true);
        frame.pack();
    }
}
