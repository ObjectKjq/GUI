package com.kjq;

import java.awt.*;

public class test1 {
    public static void main(String[] args) {
        Frame frame = new Frame("kjq");
        frame.setSize(400, 300);
        frame.setVisible(true);
        //设置在屏幕中的位置
        frame.setLocation(300, 300);
        //关闭默认的布局
        frame.setLayout(null);

        Label label = new Label("请输入用户");
        label.setSize(100, 50);
        label.setLocation(30, 50);
        //文字居中显示
        label.setAlignment(Label.CENTER);
        label.setBackground(Color.cyan);
        label.setFont(new Font(null, Font.BOLD, 10));
        frame.add(label);
    }
}
