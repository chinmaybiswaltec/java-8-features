package com.chinmaybiswaltec.stream;

import java.util.stream.IntStream;

public class CreatingIntStreamWithIteration {
    public static void main(String[] args) {
       IntStream intStream = IntStream.iterate(0, i->i+2).limit(5);
        intStream.forEach(System.out::println);
        //0 2 4 6 8
    }
}
