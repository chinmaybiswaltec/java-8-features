package com.chinmaybiswaltec.function;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        Function<Integer, Integer> function = (i)->i*i;
        Integer result = function.apply(5);
        System.out.println("Result from Function is : "+ result);
        UnaryOperator<Integer> unaryOperator = (i)->i*i;
        Integer unaryOperatorResult = unaryOperator.apply(5);
        System.out.println("Result from UnaryOperator is : "+ unaryOperatorResult);
    }
}
