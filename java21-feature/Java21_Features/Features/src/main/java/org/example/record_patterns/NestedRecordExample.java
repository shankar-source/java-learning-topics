package org.example.record_patterns;

record Rectangle(Point topLeft, Point bottomRight) {}

public class NestedRecordExample {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(new Point(0, 0), new Point(10, 10));

        if (rect instanceof Rectangle(Point(int x1, int y1), Point(int x2, int y2))) {
            System.out.println("Top-left: " + x1 + "," + y1);
            System.out.println("Bottom-right: " + x2 + "," + y2);
        }
    }
}
