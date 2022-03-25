package com.chinmaybiswaltec.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFilterExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,11,20,21,30,31);
        //Filter all even numbers.
        // Filter Intermediate operation returns a stream of all even numbers
        Stream<Integer> evenStream = numbers.stream().filter(i-> i%2==0);
        // Use forEach terminating operation to print
        evenStream.forEach(System.out::println);//10 20 30
    }
}
