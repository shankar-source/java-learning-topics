package org.example.Pattern_Matching_for_Switch;

public class SwitchPatternWhen {
    public static void main(String[] args) {
        System.out.println(checkNumber(-5));   // Negative number
        System.out.println(checkNumber(0));    // Zero
        System.out.println(checkNumber(15));   // Positive number
        System.out.println(checkNumber(null)); // Null value
    }

    static String checkNumber(Integer num) {
        return switch (num) {
            case Integer i when i < 0  -> "Negative number";
            case Integer i when i == 0 -> "Zero";
            case Integer i             -> "Positive number"; // covers remaining Integers
            case null                  -> "Null value";
        };
    }
}
