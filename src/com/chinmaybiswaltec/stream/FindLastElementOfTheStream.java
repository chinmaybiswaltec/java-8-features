package com.chinmaybiswaltec.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindLastElementOfTheStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(20,11,21,30,10,31);
        Integer lastElement = numbers.stream().reduce((first,second)->second).orElse(-1);
        System.out.println("Last element in the list is "+lastElement);
        //Last element in the list is 31
        //If the list itself is empty it will return -1
        List<Integer> emptyList = new ArrayList<>();
        Integer lastElementInEmptyList = emptyList.stream().reduce((first,second)->second).orElse(-1);
        System.out.println("Last element in the empty list is "+lastElementInEmptyList);
        //Last element in the empty list is -1
    }
}
