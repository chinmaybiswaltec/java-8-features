package com.chinmaybiswaltec.stream;

import java.util.stream.IntStream;

public class CreatingIntStreamWithRange {
    public static void main(String[] args) {
        IntStream intStream1 = IntStream.range(20, 30);
        intStream1.forEach(System.out::println);
        //20 21 22 23 24 25 26 27 28 29
        IntStream intStream2 = IntStream.rangeClosed(20, 30);
        intStream2.forEach(System.out::println);
        //20 21 22 23 24 25 26 27 28 29 30
    }
}
