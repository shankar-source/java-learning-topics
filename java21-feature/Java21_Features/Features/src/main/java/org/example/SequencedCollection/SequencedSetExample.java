package org.example.SequencedCollection;
import java.util.*;

public class SequencedSetExample {
    public static void main(String[] args) {
        SequencedSet<String> set = new LinkedHashSet<>();
        set.add("One");
        set.add("five");
        set.add("six");
        set.add("Three");
        set.add("Two");

        System.out.println("First: " + set.getFirst()); // One
        System.out.println("Last: " + set.getLast());   // Three
        System.out.println("Reversed: " + set.reversed()); // [Three, Two, One]
    }
}
