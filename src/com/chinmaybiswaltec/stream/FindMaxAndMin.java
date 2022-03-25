package com.chinmaybiswaltec.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindMaxAndMin {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,5,3,9);
        Optional<Integer> maxOpt = list.stream().max(Comparator.comparing(Integer::valueOf));
        System.out.println("Max number is "+maxOpt.get());//Max number is 10
        Optional<Integer> minOpt = list.stream().min(Comparator.comparing(Integer::valueOf));
        System.out.println("Min number is "+minOpt.get());//Min number is 3
        List<String> strList = Arrays.asList("Zenny","Alex","Alok","Robbin");
        Optional<String> maxStrOpt =strList.stream().max(Comparator.comparing(String::valueOf));
        System.out.println("Maximum string is "+maxStrOpt.get());//Maximum string is Zenny
        Optional<String> minStrOpt =strList.stream().min(Comparator.comparing(String::valueOf));
        System.out.println("Minimum string is "+minStrOpt.get());//Minimum string is Alex
    }
}
