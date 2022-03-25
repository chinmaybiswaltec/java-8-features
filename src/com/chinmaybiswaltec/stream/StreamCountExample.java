package com.chinmaybiswaltec.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCountExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(20,11,21,30,10,31);
        long count = numbers.stream().count();
        System.out.println("Number of elements :"+ count);//Number of elements :6
    }
}
