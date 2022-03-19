package com.kjq;

import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class test5 {
    public static void main(String[] args) {
        new test5().aa();
    }

    public void aa(){
        Frame frame = new Frame();
        TextField textField = new TextField();
        TextArea textArea = new TextArea();

        textField.addTextListener(new TextListener() {
            @Override
            public void textValueChanged(TextEvent e) {
                //setText设置文本内容
                //getText获取里面的内容
                if (e.getSource() == textField){
                    textArea.setText(textField.getText());
                    //sjfs
                //fsf
                }
            }
        });

        frame.add(textField,BorderLayout.NORTH);
        frame.add(textArea);
        frame.setVisible(true);
        frame.pack();
    }
}
