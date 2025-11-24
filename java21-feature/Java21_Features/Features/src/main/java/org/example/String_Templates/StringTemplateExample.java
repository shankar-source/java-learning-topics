package org.example.String_Templates;

public class StringTemplateExample {
    public static void main(String[] args) {
        String name = "Rakesh";
        int age = 25;

        // Using String Template (preview feature)
        String message = STR."Hello, my name is \{name} and I am \{age} years old.";

        System.out.println(message);

        // You can also use expressions
        int a = 10, b = 20;
        System.out.println(STR."Sum of \{a} and \{b} is \{a + b}");
    }
}
