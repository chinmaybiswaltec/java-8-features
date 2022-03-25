package com.chinmaybiswaltec.function;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, String> biFunction = (x,y)-> x+"-->"+y;
        System.out.println(biFunction.apply(10,20));//10-->20
    }
}
