package com.kjq;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;

public class test7 {
    public static void main(String[] args) {
        new test7().dd();
    }
    public void dd(){
        Frame frame = new Frame();
        Choice choice = new Choice();
        choice.add("֣��");
        choice.add("����");
        choice.add("����");
        TextField textField = new TextField(30);

        choice.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                textField.setText(choice.getSelectedItem());
            }
        });

        frame.add(choice,BorderLayout.WEST);
        frame.add(textField);
        frame.setVisible(true);
        frame.pack();
    }
}
