package org.example.record_patterns;


record Point(int x, int y) {}

public class RecordPatternExample {
    public static void main(String[] args) {
        Object obj = new Point(10, 20);

        if (obj instanceof Point(int x, int y)) {
            System.out.println("x = " + x + ", y = " + y);
        }
    }
}
