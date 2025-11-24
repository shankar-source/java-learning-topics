package org.example.Pattern_Matching_for_Switch;
record Point(int x, int y) {}

public class SwitchRecordPattern {
    public static void main(String[] args) {
        System.out.println(describe(new Point(5, 5)));
        System.out.println(describe(new Point(10, 20)));
        System.out.println(describe("Not a point"));
    }

    static String describe(Object obj) {
        return switch (obj) {
            case Point(int x, int y) when x == y -> "Equal coordinates: (" + x + ", " + y + ")";
            case Point(int x, int y)             -> "Point at (" + x + ", " + y + ")";
            case null                            -> "Null value";
            default                              -> "Not a point";
        };
    }
}
