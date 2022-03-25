package com.chinmaybiswaltec.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindAndCountDuplicates {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A","B","A","C","B");
        System.out.println("List before removing duplicates");
        list.forEach(System.out::println);//A B A C B
        Map<String, Long> elementCountMap = list.stream()
                .collect(Collectors.toMap(Function.identity(), v -> 1L, Long::sum));
        System.out.println(elementCountMap);//{A=2, B=2, C=1}
    }
}
