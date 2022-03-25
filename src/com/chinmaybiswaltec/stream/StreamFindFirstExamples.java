package com.chinmaybiswaltec.stream;

import java.util.Arrays;
import java.util.List;

public class StreamFindFirstExamples {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Zenny","Alex","Alok","Robbin");
        //This returns the first element from the list
        String first = list.stream().findFirst().get();
        System.out.println(first);// Zenny
        //Let's apply a filter condition to it.
        String filter =  list.stream().filter(s->s.startsWith("A")).findFirst().get();
        System.out.println(filter);// Alex
    }
}
