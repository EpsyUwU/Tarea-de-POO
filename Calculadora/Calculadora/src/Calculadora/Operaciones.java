package Calculadora;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Operaciones extends Botones implements ActionListener {

    double num1, num2,resultado;
    int var = 1;
    int pos = 0;
    int ant = 0;
    String resul;

    public Operaciones() {
    }

    public void actionPerformed(ActionEvent e) {


        if (e.getSource() == btn1) {
            textF.setText(textF.getText() + "1");

        } else if (e.getSource() == btn2) {
            textF.setText(textF.getText() + "2");

        } else if (e.getSource() == btn3) {
            textF.setText(textF.getText() + "3");

        } else if (e.getSource() == btn4) {
            textF.setText(textF.getText() + "4");

        } else if (e.getSource() == btn5) {
            textF.setText(textF.getText() + "5");

        } else if (e.getSource() == btn6) {
            textF.setText(textF.getText() + "6");

        } else if (e.getSource() == btn7) {
            textF.setText(textF.getText() + "7");

        } else if (e.getSource() == btn8) {
            textF.setText(textF.getText() + "8");

        } else if (e.getSource() == btn9) {
            textF.setText(textF.getText() + "9");

        } else if (e.getSource() == btn0) {
            textF.setText(textF.getText() + "0");

        } else if (e.getSource() == btnD) {

            Num1 = String.valueOf(textF.getText());
            lista.list.add(Num1);
            lista.list.add("/");
            textF.setText("");

        } else if (e.getSource() == btnM) {

            Num1 = String.valueOf(textF.getText());
            lista.list.add(Num1);
            lista.list.add("*");
            textF.setText("");

        } else if (e.getSource() == btnN) {

            textF.setText("");
            Num1 = "";
            Num2 = "";
            lista.list.clear();

        } else if (e.getSource() == btnP) {

            if (!textF.getText().contains(".")) {
                textF.setText(textF.getText() + ".");
            }

        } else if (e.getSource() == btnR) {

            Num1 = String.valueOf(textF.getText());
            lista.list.add(Num1);
            lista.list.add("-");
            textF.setText("");

        } else if (e.getSource() == btnS) {

            Num1 = String.valueOf(textF.getText());
            lista.list.add(Num1);
            lista.list.add("+");
            textF.setText("");

        } else if (e.getSource() == btnI) {

            Num2 = String.valueOf(textF.getText());
            lista.list.add(Num2);


            /*
            switch (operadores) {
                case "/":
                    while(variable == 1)
                    resultado = Double.valueOf(num1 / num2);
                    textF.setText(String.valueOf(resultado));
                    lista.list.add(resultado);
                    break;
                case "*":

                    resultado = Double.valueOf(num1 * num2);
                    textF.setText(String.valueOf(resultado));
                    lista.list.add(resultado);
                    break;
                case "-":

                    resultado = Double.valueOf(num1 - num2);
                    textF.setText(String.valueOf(resultado));
                    lista.list.add(resultado);
                    break;
                case "+":

                    resultado = Double.valueOf(num1 + num2);
                    textF.setText(String.valueOf(resultado));
                    lista.list.add(resultado);
                    break;

            }*/
            var = 1;
            while (var == 1) {
                if (lista.list.contains("/")) {
                    pos = lista.list.indexOf("/");
                    ant = pos - 1;
                    num1 = Double.parseDouble(lista.list.remove(ant));
                    num2 = Double.parseDouble(lista.list.remove(pos));
                    resultado = num1 / num2;
                    lista.list.add(ant, String.valueOf(resultado));
                    lista.list.remove(pos);
                } else {
                    var = 0;
                }
            }

            var = 1;
            while (var == 1) {
                if (lista.list.contains("*")) {
                    pos = lista.list.indexOf("*");
                    ant = pos - 1;
                    num1 = Double.parseDouble(lista.list.remove(ant));
                    num2 = Double.parseDouble(lista.list.remove(pos));
                    resultado = num1 * num2;
                    lista.list.add(ant, String.valueOf(resultado));
                    lista.list.remove(pos);
                } else {
                    var = 0;
                }
            }
            var = 1;
            while (var == 1) {
                if (lista.list.contains("-")) {
                    pos = lista.list.indexOf("-");
                    ant = pos - 1;
                    num1 = Double.parseDouble(lista.list.remove(ant));
                    num2 = Double.parseDouble(lista.list.remove(pos));
                    resultado = num1 - num2;
                    lista.list.add(ant, String.valueOf(resultado));
                    lista.list.remove(pos);
                } else {
                    var = 0;
                }
            }
            var = 1;
            while (var == 1) {
                if (lista.list.contains("+")) {
                    pos = lista.list.indexOf("+");
                    ant = pos - 1;
                    num1 = Double.parseDouble(lista.list.remove(ant));
                    num2 = Double.parseDouble(lista.list.remove(pos));
                    resultado = num1 + num2;
                    lista.list.add(ant, String.valueOf(resultado));
                    lista.list.remove(pos);

                } else {
                    var = 0;
                }
            }
            resul = (lista.list.remove(0));
            textF.setText(resul);

        }

    }
}

