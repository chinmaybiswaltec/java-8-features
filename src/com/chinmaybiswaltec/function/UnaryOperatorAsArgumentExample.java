package com.chinmaybiswaltec.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorAsArgumentExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        UnaryOperator<Integer> unaryOperator = (i)->i+10;
        List<Integer> result = addTen(list, unaryOperator);
        System.out.println(result);//11, 12, 13, 14, 15]
    }

    private static List<Integer> addTen(List<Integer> list, UnaryOperator<Integer> unaryOperator){
        List<Integer> resultList = new ArrayList<>();
        for(Integer i: list){
            resultList.add(unaryOperator.apply(i) );
        }
        return resultList;
    }
}
