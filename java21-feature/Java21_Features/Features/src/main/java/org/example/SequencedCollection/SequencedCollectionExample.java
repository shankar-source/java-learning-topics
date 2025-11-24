package org.example.SequencedCollection;
import java.util.*;

public class SequencedCollectionExample {
    public static void main(String[] args) {
        SequencedCollection<String> list = new ArrayList<>();

        list.addFirst("A");
        list.addLast("B");
        list.addLast("C");

        System.out.println("First: " + list.getFirst()); // A
        System.out.println("Last: " + list.getLast());   // C
        System.out.println("Reversed: " + list.reversed()); // [C, B, A]
    }
}

