package org.example;

import java.util.*;
import java.util.stream.*;

public class IntermediateOps {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ravi", "Rakesh", "Raj", "Amit", "Ankit", "Rohit");

        List<String> result = names.stream()
                .filter(n -> n.startsWith("R"))
                .map(String::toUpperCase)
                .sorted()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Intermediate Ops: " + result);
    }
}
