package com.chinmaybiswaltec.function;

import java.util.function.Function;

public class FunctionFunctionalInterfaceComposeMethodExample {
    public static void main(String[] args) {
        Function<Integer, Integer> after = (i)->i*i;
        Function<String, Integer> before = (s)->s.length();
        Function<String, Integer> composed = after.compose(before);
        System.out.println(composed.apply("Chinmaybiswaltech"));//289
    }
}
