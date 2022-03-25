package com.chinmaybiswaltec.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConvertingIntStreamToList {
    public static void main(String[] args) {
        List<Integer> intList =
                IntStream.of(20,30,40).boxed().collect(Collectors.toList());
    }
}
