package com.chinmaybiswaltec.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMapExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,11,20,21,30,31);
        // Convert Integer to String suing map intermediate operation
        // With the help of String.valueOf() method
        Stream<String> evenStream = numbers.stream().map(i-> String.valueOf(i));
        // Use forEach terminating operation to print
        evenStream.forEach(System.out::println);//10 11 20 21 30 31
    }
}
