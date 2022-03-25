package com.chinmaybiswaltec.function;

import java.util.function.Function;

public class FunctionFunctionalInterfaceExample {
    public static void main(String[] args) {
        Function<String, Integer> function = (s)->s.length();
        System.out.println(function.apply("Chinmaybiswaltech"));//17
    }
}
