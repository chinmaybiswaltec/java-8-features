package com.chinmaybiswaltec.function;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> biFunction = (i,j)->i*j;
        System.out.println(biFunction.apply(5,5));//25
        BinaryOperator<Integer> binaryOperator = (i, j)->i*j;
        System.out.println(binaryOperator.apply(10,20));//200
    }
}
