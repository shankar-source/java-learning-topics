package org.example;

import java.util.*;
import java.util.stream.*;

public class ShortCircuitingOps {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ravi", "Rakesh", "Raj", "Amit");

        names.stream().limit(2).forEach(System.out::println);

        boolean anyMatch = names.stream().anyMatch(n -> n.startsWith("R"));
        boolean allMatch = names.stream().allMatch(n -> n.length() > 2);
        boolean noneMatch = names.stream().noneMatch(n -> n.startsWith("Z"));

        System.out.println("anyMatch R: " + anyMatch);
        System.out.println("allMatch len>2: " + allMatch);
        System.out.println("noneMatch Z: " + noneMatch);
    }
}
