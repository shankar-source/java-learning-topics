package org.example;

import java.util.*;
import java.util.stream.*;

public class ParallelStreams {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1, 10).boxed().toList();

        System.out.println("Sequential:");
        numbers.stream().forEach(n -> System.out.println(Thread.currentThread().getName() + " -> " + n));

        System.out.println("\nParallel:");
        numbers.parallelStream().forEach(n -> System.out.println(Thread.currentThread().getName() + " -> " + n));
    }
}
