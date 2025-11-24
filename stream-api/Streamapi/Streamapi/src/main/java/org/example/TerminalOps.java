package org.example;

import java.util.*;
import java.util.stream.*;

public class TerminalOps {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        numbers.stream().forEach(n -> System.out.print(n + " "));
        System.out.println();

        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum using reduce: " + sum);

        long count = numbers.stream().filter(n -> n % 2 == 0).count();
        System.out.println("Even count: " + count);

        Optional<Integer> first = numbers.stream().findFirst();
        System.out.println("findFirst: " + first.orElse(-1));
    }
}
