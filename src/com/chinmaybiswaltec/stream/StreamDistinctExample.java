package com.chinmaybiswaltec.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDistinctExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,1,3,4,5,5);
        List<Integer> distinctList = list.stream().distinct().collect(Collectors.toList());
        distinctList.forEach(System.out::println);//1 2 3 4 5
    }
}
