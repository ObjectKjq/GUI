package com.kjq.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 单选与复选 {
    public static void main(String[] args) {
        new 单选与复选().bb();
    }

    public void bb(){

        JFrame jFrame = new JFrame();
        JLabel jLabel = new JLabel("hello word", JLabel.CENTER);//剧中
        jLabel.setFont(new Font("楷体",Font.PLAIN,20));//设置字体的大小
        JPanel jPanel = new JPanel();

        //单选按钮
//        ButtonGroup buttonGroup = new ButtonGroup();
//        JRadioButton rb1 = new JRadioButton("加粗");
//        JRadioButton rb2 = new JRadioButton("倾斜");
//        buttonGroup.add(rb1);
//        buttonGroup.add(rb2);
//
//        jPanel.add(rb1);
//        jPanel.add(rb2);
        //复选按钮

        JCheckBox jb1 = new JCheckBox("加粗");
        JCheckBox jb2 = new JCheckBox("倾斜");
        jPanel.add(jb1);
        jPanel.add(jb2);
//        rb1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                jLabel.setFont(new Font("楷体", Font.BOLD,20));
//            }
//        });

        //添加监听
        ActionListener lis = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int mode = 0;
                //判断时否被选中
                if(jb1.isSelected()){
                    mode = mode + Font.BOLD;
                }
                if (jb2.isSelected()){
                    mode = mode + Font.ITALIC;
                }
                jLabel.setFont(new Font("楷体", mode,20));
            }
        };
        jb1.addActionListener(lis);
        jb2.addActionListener(lis);

        jFrame.add(jLabel);
        jFrame.add(jPanel, BorderLayout.SOUTH);

        jFrame.setVisible(true);
        jFrame.setBounds(200,200,400,300);
        //设置窗口时的默认操作
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
