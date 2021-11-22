package org.example;

import java.util.*;
import java.io.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class DesktopApp extends JFrame {
    static ProductDB database = new ProductDB();

   static CashRegister register = new CashRegister(database);
   static Display observer1 = new Display();


    static String UPC = "";
    JTextField userInput = new JTextField(10);
    JButton submit = new JButton("Submit");

    public DesktopApp(){

        JPanel centerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 15));
        setSize(640, 480);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // This center the window on the screen
        submit.addActionListener( (e)-> {
            submitAction();
        });
        Border border = BorderFactory.createTitledBorder("Scanner");
        centerPanel.setBorder(border);

        centerPanel.add(new JLabel("Enter UPC into Scanner:"));
        centerPanel.add(userInput);
        JPanel southPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 15));
        southPanel.add(submit);
        Box theBox = Box.createVerticalBox();
        theBox.add(Box.createVerticalStrut(100));
        theBox.add(centerPanel);
        theBox.add(Box.createVerticalStrut(200));
        theBox.add(southPanel);
        add(theBox);

    }

    private void submitAction() {
        UPC = userInput.getText();
        register.setCurrentProductUPC(UPC);
        JOptionPane.showMessageDialog(null, register.setCurrentProductUPC(UPC),"Display", JOptionPane.PLAIN_MESSAGE);
    }

    public static void main(String[] args) {
        // Simulate cash register interaction for demonstration.
        database.initialize();
        register.addObserver(observer1);


        new DesktopApp().setVisible(true);



    }
}
