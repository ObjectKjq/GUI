package com.kjq;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class test6 {
    public static void main(String[] args) {
        new test6().bb();
    }

    public void bb(){
        Frame frame = new Frame();
        CheckboxGroup checkboxGroup = new CheckboxGroup();
        Checkbox checkbox1 = new Checkbox("红色", checkboxGroup, false);
        Checkbox checkbox2 = new Checkbox("绿色", checkboxGroup, false);
        Checkbox checkbox3 = new Checkbox("蓝色", checkboxGroup, false);
        Label label = new Label("显示颜色");

        checkbox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                label.setBackground(Color.red);
            }
        });
        checkbox2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                label.setBackground(Color.yellow);
            }
        });
        checkbox3.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                label.setBackground(Color.green);
            }
        });

        frame.setLayout(new FlowLayout());
        frame.add(checkbox1);
        frame.add(checkbox2);
        frame.add(checkbox3);
        frame.add(label);

        frame.setVisible(true);
        frame.pack();
    }
}
