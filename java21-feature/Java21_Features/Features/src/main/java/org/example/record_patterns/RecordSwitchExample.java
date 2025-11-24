package org.example.record_patterns;

import java.awt.*;

public class RecordSwitchExample {
    public static void main(String[] args) {
        Point p = new Point(5, 7);

        String result = switch (p) {
            case Point(int x, int y) when x == y -> "Equal coordinates";
            case Point(int x, int y) -> "x=" + x + ", y=" + y;
        };

        System.out.println(result);
    }
}
