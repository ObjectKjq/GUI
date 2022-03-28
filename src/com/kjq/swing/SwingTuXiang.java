package com.kjq.swing;

import javax.swing.*;
import java.awt.*;

public class SwingTuXiang {
    public static void main(String[] args) {
        new SwingTuXiang().aa();
    }
    public void aa() {
        JFrame jFrame = new JFrame();
        JLabel jLabel = new JLabel();
        JLabel jLabel1 = new JLabel("欢迎来到我的家园", JLabel.CENTER);

        //创建图片对象
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\86175\\Documents\\Tencent Files\\1208230746\\FileRecv\\MobileFile\\1636196419825.jpg");
        Image image = imageIcon.getImage();
        Image scaledInstance = image.getScaledInstance(500, 400, image.SCALE_DEFAULT);//图像的缩放
        imageIcon.setImage(scaledInstance);

        jLabel.setIcon(imageIcon);
        jLabel1.setOpaque(true);//显示背景颜色
        jLabel1.setBackground(Color.red);

        jFrame.add(jLabel);
        jFrame.add(jLabel1,BorderLayout.SOUTH);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jFrame.setBounds(200, 200, 500, 450);
    }
}
