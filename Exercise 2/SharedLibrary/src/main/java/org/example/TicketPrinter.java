package org.example;

import java.util.Observable;
import java.util.Observer;

// Prints on paper the scanned or manually entered item name and price
public class TicketPrinter implements Observer {

    private String upc;

    // Prints some text on the paper.

    @Override
    public void update(Observable o, Object upc) {

        System.out.println("Receipt: " + (String)upc);

    }
}