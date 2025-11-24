package org.example;

import java.util.*;
import java.util.stream.*;

public class StreamBasics {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ravi", "Rakesh", "Amit", "Raj");

        // Create stream and process
        List<String> result = names.stream()
                .filter(n -> n.startsWith("R"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Stream Basics: " + result);
    }
}
