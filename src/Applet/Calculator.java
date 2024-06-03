package Applet;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

// Define the applet
public class Calculator extends java.awt.Panel implements ActionListener {
    TextField tf;
    String operator;
    double num1, num2, result;

    // Initialize the applet
    public void init() {
        tf = new TextField(10);
        add(tf);

        // Create buttons for digits
        for (int i = 0; i <= 9; i++) {
            Button b = new Button(String.valueOf(i));
            b.addActionListener(this);
            add(b);
        }

        // Create buttons for operators
        Button addBtn = new Button("+");
        Button subBtn = new Button("-");
        Button mulBtn = new Button("*");
        Button divBtn = new Button("/");
        Button equalBtn = new Button("=");
        Button clearBtn = new Button("C");

        addBtn.addActionListener(this);
        subBtn.addActionListener(this);
        mulBtn.addActionListener(this);
        divBtn.addActionListener(this);
        equalBtn.addActionListener(this);
        clearBtn.addActionListener(this);

        add(addBtn);
        add(subBtn);
        add(mulBtn);
        add(divBtn);
        add(equalBtn);
        add(clearBtn);
    }

    // Perform action when a button is clicked
    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();
        if (command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/")) {
            num1 = Double.parseDouble(tf.getText());
            operator = command;
            tf.setText("");
        } else if (command.equals("=")) {
            num2 = Double.parseDouble(tf.getText());
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
            }
            tf.setText(String.valueOf(result));
        } else if (command.equals("C")) {
            tf.setText("");
        } else {
            tf.setText(tf.getText() + command);
        }
    }
}

