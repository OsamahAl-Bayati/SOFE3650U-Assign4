package org.example;

// Capture of UPC code using a bar scanner.
public class Scanner {

    private CashRegister register;

    public Scanner(CashRegister register) {
        this.register = register;
    }

    // Captures the UPC code read by the scanner.
    public void setUPCCode(String input) {
        this.register.setCurrentProductUPC(input);
    }
}
