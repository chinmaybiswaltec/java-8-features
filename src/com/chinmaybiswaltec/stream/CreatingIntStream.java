package com.chinmaybiswaltec.stream;

import java.util.stream.IntStream;

public class CreatingIntStream {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(10);
        intStream.forEach(i-> System.out.println(i));//10
        IntStream intStreamVals = IntStream.of(10,20,30);
        intStreamVals.forEach(i-> System.out.println(i));//10 20 30
    }
}
