package com.kjq.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ��ѡ�븴ѡ {
    public static void main(String[] args) {
        new ��ѡ�븴ѡ().bb();
    }

    public void bb(){

        JFrame jFrame = new JFrame();
        JLabel jLabel = new JLabel("hello word", JLabel.CENTER);//����
        jLabel.setFont(new Font("����",Font.PLAIN,20));//��������Ĵ�С
        JPanel jPanel = new JPanel();

        //��ѡ��ť
//        ButtonGroup buttonGroup = new ButtonGroup();
//        JRadioButton rb1 = new JRadioButton("�Ӵ�");
//        JRadioButton rb2 = new JRadioButton("��б");
//        buttonGroup.add(rb1);
//        buttonGroup.add(rb2);
//
//        jPanel.add(rb1);
//        jPanel.add(rb2);
        //��ѡ��ť

        JCheckBox jb1 = new JCheckBox("�Ӵ�");
        JCheckBox jb2 = new JCheckBox("��б");
        jPanel.add(jb1);
        jPanel.add(jb2);
//        rb1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                jLabel.setFont(new Font("����", Font.BOLD,20));
//            }
//        });

        //��Ӽ���
        ActionListener lis = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int mode = 0;
                //�ж�ʱ��ѡ��
                if(jb1.isSelected()){
                    mode = mode + Font.BOLD;
                }
                if (jb2.isSelected()){
                    mode = mode + Font.ITALIC;
                }
                jLabel.setFont(new Font("����", mode,20));
            }
        };
        jb1.addActionListener(lis);
        jb2.addActionListener(lis);

        jFrame.add(jLabel);
        jFrame.add(jPanel, BorderLayout.SOUTH);

        jFrame.setVisible(true);
        jFrame.setBounds(200,200,400,300);
        //���ô���ʱ��Ĭ�ϲ���
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
