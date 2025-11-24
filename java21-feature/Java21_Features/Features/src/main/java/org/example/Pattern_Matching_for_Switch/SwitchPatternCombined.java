package org.example.Pattern_Matching_for_Switch;
public class SwitchPatternCombined {
    public static void main(String[] args) {
        System.out.println(findType("Java"));
        System.out.println(findType(100));
        System.out.println(findType(2.5f));
        System.out.println(findType(true));
    }
    static String findType(Object obj) {
        return switch (obj) {
            case String _, Integer _ -> "String or Integer: " + obj;
            case Float f   -> "Float: " + f;
            case Boolean b -> "Boolean: " + b;
            case null      -> "Null value";
            default        -> "Other type: " + obj;
        };
    }

}

