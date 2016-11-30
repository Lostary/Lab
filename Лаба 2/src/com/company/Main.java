package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame("Лабораторна №2");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        My_Window myWindow = new My_Window();

        JTextField txt1 = new JTextField("");
        JButton btn = new JButton("Відкрити/закрити");
        JButton btnWash = new JButton("Помити");
        JButton btnShow = new JButton("Показати стан");
        JButton btnStuff = new JButton("Матеріал");
        JTextField res = new JTextField();
        res.setSize(20,20);
        Timer timer = new Timer(1000, null);
        // timer
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (myWindow.getPure() == 0) {
                    res.setText("Вікно сильно забруднене, з'явився надпис: \"Помий мене!\"");
                } else {
                    res.setText("Вікно забруднюється, чистота його = " + Integer.toString(myWindow.getPure()));
                    myWindow.setPure(myWindow.getPure() - 1);
                }
            }
        };

        timer.start();
        timer.addActionListener(listener);
        window.getContentPane().add(btn,BorderLayout.NORTH);
        window.getContentPane().add(btnWash,BorderLayout.WEST);
        window.getContentPane().add(btnStuff,BorderLayout.EAST);
        window.getContentPane().add(res, BorderLayout.AFTER_LAST_LINE);
        window.getContentPane().add(btnShow,BorderLayout.CENTER);
        window.setSize(400,150);
        btn.addActionListener(new ActionListener() {
                                                  public void actionPerformed(ActionEvent e) {
                                                     myWindow.Open_or_Close();
                                                  }
                                              }
        );
        btnWash.addActionListener(new ActionListener() {
                                  public void actionPerformed(ActionEvent e) {
                                      myWindow.Wash();
                                  }
                              }
        );
        btnShow.addActionListener(new ActionListener() {
                                      public void actionPerformed(ActionEvent e) {
                                          myWindow.Show();
                                      }
                                  }
        );
        btnStuff.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame inWindow = new JFrame("Введіть назву матеріалу рами");
                JTextField input = new JTextField();
                inWindow.setSize(400,100);
                input.setSize(400,50);
                JButton btn = new JButton("OK");
                inWindow.getContentPane().add(input,BorderLayout.NORTH);
                inWindow.getContentPane().add(btn,BorderLayout.SOUTH);
                inWindow.setVisible(true);
                btn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                    myWindow.setStuff(input.getText());
                        inWindow.setVisible(false);
                    }
                }
                );
            }
        }
        );
    }
}