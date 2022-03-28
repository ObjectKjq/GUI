package com.kjq;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ComputerDemo {

    //定义临时变量
    static String zt,z;
    static double num1,num2,result;
    static int a;

    public static void main(String[] args) {
        Frame frame=new Frame("计算器");
        //上半
        TextField tf=new TextField(20);
        Panel p=new Panel();
        //创建 清除 Button 对象
        Button eliminate=new Button("Eliminate");

        //下半
        Panel p1=new Panel();
        //设置按钮表格为 4x4 行间隔，列间隔为 4
        p1.setLayout(new GridLayout(4,4,4,4));
        //数字字符串
        String[] number={"1","2","3","4","5","6","7","8","9","0","."};

        //循环添加数字按钮
        for (int i = 0; i < number.length; i++) {
            //创建数字 Button 对象
            Button button = new Button(number[i]);

            //给每个数字按钮添加监听器
            int finalI = i;//不知道为什么
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == button) {
                        /*
                            实现输入个位及以上的数字输入
                            zt：接收文本框里的字符串
                            z：把文本框里的字符串和 “i” 连接在一起
                            最后在文本框里输出
                            例子：按下 按钮1
                            zt="";
                            z=""+"1";
                            z="1";
                            tf.setText("1");
                         */
                        zt= tf.getText();
                        z=zt+number[finalI];
                        tf.setText(z);
                    }
                }
            });

            //添加到p1
            p1.add(button);
        }


        //循环添加 + - * / 按钮添加到p1 中
        String[] operator={"+","-","*","/"};
        for (int i = 0; i < operator.length; i++) {
            //创建运算符 Button 对象
            Button button = new Button(operator[i]);

            //给每个运算符按钮添加监听器
            int finalI = i;
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == button) {
                        //接收文本框里的字符串，并强转为Double 类型存储到 num1内
                        num1=Double.parseDouble(tf.getText());
                        tf.setText("");//把文本框里内容清零
                        //为每个运算符添加一个标签，用来在 = 号按钮里判断是什么运算
                        a= finalI+1;//1 +,2 -,3 *,4 /
                    }
                }
            });

            //添加到p1
            p1.add(button);
        }


        //添加 = 按钮
        Button equal=new Button("=");
        //添加监听器
        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //接收文本框里的字符串，并强转为Double 类型存储到 num2 内
                num2=Double.parseDouble(tf.getText());
                if (e.getSource() == equal) {
                    //用 switch 语句来实现不同形式的运算
                    switch (a){
                        case 1://加
                            result=num1+num2;
                            break;
                        case 2://减
                            result=num1-num2;
                            break;
                        case 3://乘
                            result=num1*num2;
                            break;
                        case 4://除
                            result=num1/num2;
                            break;
                    }
                    //在文本框里输出 强制转换为String 后的结果
                    tf.setText(String.valueOf(result));
                }

            }
        });
        //添加到p1
        p1.add(equal);


        //给清除按钮添加监听器
        eliminate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == eliminate) {
                    //清除：把有关运算的按钮重置，并把文本框置为空
                    num1=0.0;
                    num2=0.0;
                    result=0.0;
                    a=0;
                    tf.setText("");
                }
            }
        });


        //在程序框添加
        p.add(tf);//文本框
        p.add(eliminate);//清除
        frame.add(p,BorderLayout.NORTH);//默认布局为BorderLayout
        //下半
        frame.add(p1);


        //窗体监听
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
                frame.dispose();//关闭窗口
            }
        });

        frame.pack();          //设置窗口为最佳大小
        frame.setVisible(true);//设置窗口为可见
    }
}
