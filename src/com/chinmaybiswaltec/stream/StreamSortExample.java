package com.chinmaybiswaltec.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamSortExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(20,11,21,30,10,31);
        // Sort the objects in the stream
        Stream<Integer> sortedStream = numbers.stream().sorted();
        // Use forEach terminating operation to print
        sortedStream.forEach(System.out::println);//10 11 20 21 30 31
        // Note that sorting order in original collection is not touched
        numbers.forEach(System.out::println);// 20 11 21 30 10 31
    }
}
