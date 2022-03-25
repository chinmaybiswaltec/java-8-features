package com.chinmaybiswaltec.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionFunctionalInterfaceAndThenMethodExample {
    public static void main(String[] args) {
        Function<Integer, Integer> after = (i)->i*i;
        Function<String, Integer> thisFunction = (s)->s.length();
        Function<String, Integer> composed = thisFunction.andThen(after);
        System.out.println(composed.apply("Chinmaybiswaltech"));//289
    }
}
