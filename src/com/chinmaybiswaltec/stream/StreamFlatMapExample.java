package com.chinmaybiswaltec.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFlatMapExample {
    public static void main(String[] args) {
        List<Integer> numbers1 = Arrays.asList(10,11);
        List<Integer> numbers2 = Arrays.asList(20,21);
        List<Integer> numbers3 = Arrays.asList(30,31);
        List<List<Integer>> lists = Arrays.asList(numbers1, numbers2, numbers3);
        List<Integer> results= lists.stream().
                flatMap(e->e.stream()).collect(Collectors.toList());
        results.forEach(System.out::println);//10 11 20 21 20 31
    }
}
