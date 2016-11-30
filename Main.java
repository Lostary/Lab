package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class main {
    public static void main(String[] args) {
            JFrame frame = new JFrame("First lab");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        //Оголошення компонентів
            JTextField txt1 = new JTextField("");
            JButton btn = new JButton("Запустити");
            JTextField res = new JTextField();
            GridLayout gbl = new GridLayout(4,0);
            frame.setLayout(gbl);
        //Розміщення компонентів у вікнні
            frame.getContentPane().add(txt1);
            frame.getContentPane().add(btn);
            frame.getContentPane().add(res);
        //Розмір вікна
            frame.setSize(300,200);
        //Дія при натискані на кнопку "Результат"
            btn.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e) {
                    String str,str2="";
                    char word1,word2;
                    str = txt1.getText();
                    int n = str.length();
                    int i=n-1;
                    do
                    {
                        if (i-1<0)
                            break;
                        else
                            {
                            str2 += str.charAt(i);
                            str2 += str.charAt(i-1);
                           /* str = str.replace(str.charAt(i+1), word2);
                            str = str.replace(str.charAt(i), word1); */
                            i = i - 2;
                            }
                    }while(i>=0);
                    if (n%2!=0) str2+=str.charAt(0);
                    res.setText(str2);
                    }
                }
            );
    }
}