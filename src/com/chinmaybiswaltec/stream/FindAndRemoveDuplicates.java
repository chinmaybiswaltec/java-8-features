package com.chinmaybiswaltec.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAndRemoveDuplicates {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A","B","A","C","B");
        System.out.println("List before removing duplicates");
        list.forEach(System.out::println);//A B A C B
        List<String> distinctList = list.stream().distinct().collect(Collectors.toList());
        System.out.println("List after removing duplicates");
        distinctList.forEach(System.out::println);//A B C
    }
}
