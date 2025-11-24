package org.example.Pattern_Matching_for_Switch;
public class SwitchPatternBasic {
    public static void main(String[] args) {
        System.out.println(describe("Rakesh"));
        System.out.println(describe(42));
        System.out.println(describe(3.14));
        System.out.println(describe(null));
    }

    static String describe(Object obj) {
        return switch (obj) {
            case String s  -> "It's a String: " + s.toUpperCase();
            case Integer i -> "It's an Integer: " + (i * 2);
            case Double d  -> "It's a Double: " + (d + 1.0);
            case null      -> "It's null!";
            default        -> "Unknown type";
        };
    }
}
