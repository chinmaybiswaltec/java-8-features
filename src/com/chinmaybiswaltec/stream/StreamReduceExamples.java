package com.chinmaybiswaltec.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExamples {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Zenny","Alex","Robbin");
       // Lets concat all these elements using reduce method
        Optional<String> reducedOpt = list.stream().reduce((s1, s2)->s1+" "+s2);
        reducedOpt.ifPresent(System.out::println);//Zenny Alex Robbin
    }
}
