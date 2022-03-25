package com.chinmaybiswaltec.stream;

import java.util.Arrays;
import java.util.List;

public class StreamMatchExamples {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Zenny","Alex","Robbin");
        //This returns true if any of the object starts with A
        boolean anyMatch = list.stream().anyMatch(s->s.startsWith("A"));
        System.out.println(anyMatch);// true
        //This returns true if all the object starts with A
        boolean allMatch = list.stream().allMatch(s->s.startsWith("A"));
        System.out.println(allMatch);// false
        //This returns true if none of the object starts with A
        boolean noneMatch = list.stream().noneMatch(s->s.startsWith("A"));
        System.out.println(noneMatch);// false
        boolean noneMatch2 = list.stream().noneMatch(s->s.startsWith("B"));
        System.out.println(noneMatch2);// true
    }
}
