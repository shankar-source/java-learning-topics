package org.example.String_Templates;

import static java.util.FormatProcessor.FMT;

public class FMTExample {
    public static void main(String[] args) {
        double price = 1234.56789;

        String formatted = FMT."The price is %.2f\{price} USD";
        System.out.println(formatted);

        int qty = 5;
        double total = price * qty;
        String bill = FMT."Quantity: %d\{qty}, Total: %.2f\{total}";
        System.out.println(bill);
    }
}
