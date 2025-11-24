package org.example.SequencedCollection;
import java.util.*;

public class SequencedMapExample {
    public static void main(String[] args) {
        SequencedMap<Integer, String> map = new LinkedHashMap<>();

        map.putFirst(1, "One");
        map.putLast(2, "Two");
        map.putLast(3, "Three");

        System.out.println("First Entry: " + map.firstEntry()); // 1=One
        System.out.println("Last Entry: " + map.lastEntry());   // 3=Three
        System.out.println("Reversed: " + map.reversed()); // {3=Three, 2=Two, 1=One}
    }
}
