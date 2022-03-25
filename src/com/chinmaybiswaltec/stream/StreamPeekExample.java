package com.chinmaybiswaltec.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPeekExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3);
        List<Integer> result = list.stream().peek(i->{i=i+1;
            System.out.println(i);}).collect(Collectors.toList());
        // 2 3 4
    }
}
