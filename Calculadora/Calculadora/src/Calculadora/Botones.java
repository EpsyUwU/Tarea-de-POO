package Calculadora;

import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class Botones extends JFrame implements ActionListener {

    JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8,
            btn9, btn0, btnD, btnM, btnS, btnP, btnI, btnR,
            btnN;

    JTextField textF;

    public String Num1, Num2;


    public Botones() {

        setTitle("CALCULADORA BASICA");
        setBounds(0, 0, 295, 450);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);

        textF = new JTextField();
        textF.setBounds(10, 10, 260, 40);
        //textF.setEnabled(false);
        textF.setEditable(false);
        add(textF);
        textF.addActionListener(this);

        btn7 = new JButton("7");
        btn7.setBounds(10, 70, 50, 50);
        btn7.setFont(new Font("Cooper Black", 1, 15));
        add(btn7);
        btn7.addActionListener(this);

        btn8 = new JButton("8");
        btn8.setBounds(80, 70, 50, 50);
        btn8.setFont(new Font("Cooper Black", 1, 15));
        add(btn8);
        btn8.addActionListener(this);

        btn9 = new JButton("9");
        btn9.setBounds(150, 70, 50, 50);
        btn9.setFont(new Font("Cooper Black", 1, 15));
        add(btn9);
        btn9.addActionListener(this);

        btnD = new JButton("/");
        btnD.setBounds(220, 70, 50, 50);
        btnD.setFont(new Font("Cooper Black", 1, 15));
        add(btnD);
        btnD.addActionListener(this);

        btn4 = new JButton("4");
        btn4.setBounds(10, 140, 50, 50);
        btn4.setFont(new Font("Cooper Black", 1, 15));
        add(btn4);
        btn4.addActionListener(this);

        btn5 = new JButton("5");
        btn5.setBounds(80, 140, 50, 50);
        btn5.setFont(new Font("Cooper Black", 1, 15));
        add(btn5);
        btn5.addActionListener(this);

        btn6 = new JButton("6");
        btn6.setBounds(150, 140, 50, 50);
        btn6.setFont(new Font("Cooper Black", 1, 15));
        add(btn6);
        btn6.addActionListener(this);

        btnM = new JButton("*");
        btnM.setBounds(220, 140, 50, 50);
        btnM.setFont(new Font("Cooper Black", 1, 15));
        add(btnM);
        btnM.addActionListener(this);

        btn1 = new JButton("1");
        btn1.setBounds(10, 210, 50, 50);
        btn1.setFont(new Font("Cooper Black", 1, 15));
        add(btn1);
        btn1.addActionListener(this);

        btn2 = new JButton("2");
        btn2.setBounds(80, 210, 50, 50);
        btn2.setFont(new Font("Cooper Black", 1, 15));
        add(btn2);
        btn2.addActionListener(this);

        btn3 = new JButton("3");
        btn3.setBounds(150, 210, 50, 50);
        btn3.setFont(new Font("Cooper Black", 1, 15));
        add(btn3);
        btn3.addActionListener(this);

        btnS = new JButton("+");
        btnS.setBounds(220, 210, 50, 50);
        btnS.setFont(new Font("Cooper Black", 1, 15));
        add(btnS);
        btnS.addActionListener(this);

        btn0 = new JButton("0");
        btn0.setBounds(10, 280, 50, 50);
        btn0.setFont(new Font("Cooper Black", 1, 15));
        add(btn0);
        btn0.addActionListener(this);

        btnP = new JButton(".");
        btnP.setBounds(80, 280, 50, 50);
        btnP.setFont(new Font("Cooper Black", 1, 15));
        add(btnP);
        btnP.addActionListener(this);

        btnI = new JButton("=");
        btnI.setBounds(150, 280, 50, 50);
        btnI.setFont(new Font("Cooper Black", 1, 15));
        add(btnI);
        btnI.addActionListener(this);

        btnR = new JButton("-");
        btnR.setBounds(220, 280, 50, 50);
        btnR.setFont(new Font("Cooper Black", 1, 15));
        add(btnR);
        btnR.addActionListener(this);

        btnN = new JButton("NUEVA OPERACION");
        btnN.setBounds(10, 350, 260, 50);
        btnN.setFont(new Font("Cooper Black", 1, 10));
        add(btnN);
        btnN.addActionListener(this);


    }
    @Override
    public abstract void actionPerformed(ActionEvent e);

}







