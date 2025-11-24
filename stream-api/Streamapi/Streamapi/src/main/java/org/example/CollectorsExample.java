package org.example;

import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

public class CollectorsExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ravi", "Rakesh", "Raj", "Amit", "Ankit", "Rohit");

        List<String> rNames = names.stream().filter(n -> n.startsWith("R")).collect(toList());
        System.out.println("toList: " + rNames);

        String joined = names.stream().collect(joining(", "));
        System.out.println("joining: " + joined);

        Map<Character, List<String>> grouped = names.stream().collect(groupingBy(n -> n.charAt(0)));
        System.out.println("groupingBy: " + grouped);

        Map<Boolean, List<String>> partitioned = names.stream().collect(partitioningBy(n -> n.length() > 4));
        System.out.println("partitioningBy: " + partitioned);
    }
}
