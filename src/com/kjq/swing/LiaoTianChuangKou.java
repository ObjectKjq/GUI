package com.kjq.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LiaoTianChuangKou {
    public static void main(String[] args) {
        new LiaoTianChuangKou().bb();
    }
    public void bb(){
        JFrame jFrame = new JFrame("���촰��");

        JTextArea jTextArea = new JTextArea();
        JPanel jPanel = new JPanel();
        JLabel jLabel = new JLabel("������Ϣ");
        JTextField jTextField = new JTextField(20);
        JButton jButton = new JButton("����");

        jPanel.add(jLabel);
        jPanel.add(jTextField);
        jPanel.add(jButton);
        jFrame.add(jTextArea);
        jFrame.add(jPanel, BorderLayout.SOUTH);

        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setBounds(400, 400, 400, 400);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.append(jTextField.getText()+"\n");
                jTextField.setText("");
            }
        });
    }
}
