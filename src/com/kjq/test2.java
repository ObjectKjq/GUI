package com.kjq;

import javax.swing.*;
import java.awt.*;

public class test2 {
    public static void main(String[] args) {
        Frame frame = new Frame("信息界面");
        Box x1 = Box.createHorizontalBox();
        Box x11 = Box.createVerticalBox();
        Box x111 = Box.createHorizontalBox();
        x111.add(new TextArea());
        Box x112 = Box.createHorizontalBox();
        Panel panel = new Panel();
        x112.add(panel);
        Choice choice = new Choice();
        choice.add("红");
        choice.add("黄");
        choice.add("蓝");
        choice.add("绿");
        panel.add(choice);
        CheckboxGroup checkboxGroup = new CheckboxGroup();
        Checkbox c1 = new Checkbox("男", checkboxGroup, true);
        Checkbox c2 = new Checkbox("女", checkboxGroup, false);
        panel.add(c1);
        panel.add(c2);
        Checkbox checkbox = new Checkbox("是否已婚？");
        panel.add(checkbox);
        x11.add(x111);
        x11.add(x112);
        Box x12 = Box.createVerticalBox();
        x1.add(x11);
        x1.add(x12);
        List list = new List();
        list.add("红色");
        list.add("绿色");
        list.add("黄色");
        x12.add(list);
        Box x2 = Box.createHorizontalBox();
        x2.add(new TextField(60));
        x2.add(new Button("确定"));
        frame.add(x2, BorderLayout.SOUTH);
        frame.add(x1, BorderLayout.NORTH);
        frame.pack();
        frame.setVisible(true);
    }
}
