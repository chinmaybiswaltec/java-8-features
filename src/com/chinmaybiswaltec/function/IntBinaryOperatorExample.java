package com.chinmaybiswaltec.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class IntBinaryOperatorExample {
    public static void main(String[] args) {
        int[] intArr = {10,20,30};
        Integer result = calculate(intArr, (i,j)->i*j);
        System.out.println(result);//6000
    }

    private static Integer calculate(int[] arr, IntBinaryOperator intbinaryOperator){
        Integer result = 1;
        for(Integer i=0;i< arr.length; i++){
            result = intbinaryOperator.applyAsInt(result, arr[i]);
        }
        return result;
    }
}
