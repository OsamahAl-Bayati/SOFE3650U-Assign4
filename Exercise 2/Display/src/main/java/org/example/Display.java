package org.example;

import java.util.Observable;
import  java.util.Observer;

// Is a graphical display of scanned or manually entered item name and price
public class Display implements Observer {

    private String upc;

    // Displays some text on the screen.
    @Override
    public void update(Observable o, Object upc) {
        System.out.println("Display: " + (String)upc);

    }
}
