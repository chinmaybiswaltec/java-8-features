package com.chinmaybiswaltec.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(20,11,21,30,10,31);
        List<String> numbersString =
                numbers.stream().map(i->String.valueOf(i)).sorted().collect(Collectors.toList());
        numbersString.forEach(System.out::println);//10 11 20 21 30 31
    }
}
