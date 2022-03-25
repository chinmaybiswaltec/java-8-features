package com.chinmaybiswaltec.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorAsMethodArgument {
    public static void main(String[] args) {
        Integer[] intArr = {10,20,30};
        Integer result = calculate(Arrays.asList(intArr), (i,j)->i*j);
        System.out.println(result);//6000
    }

    private static Integer calculate(List<Integer> list, BinaryOperator<Integer> binaryOperator){
        Integer result = 1;
        for(Integer i: list){
            result = binaryOperator.apply(result, i);
        }
        return result;
    }
}
