package com.chinmaybiswaltec.stream;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class CreatingStreamExample {
    public static void main(String[] args) {
        // Creating an empty Stream Instance
        Stream<String> emptyStream = Stream.empty();
        // Creating a stream from fixed set of objects
        Stream<String> stringStream = Stream.of("Tika","Sree","Ajit");
        stringStream.forEach(System.out::println); // Tika Sree Ajit
        // Creating a stream of an array
        Stream<String> stringArrayStream = Stream.of(new String[]{"Tika","Sree","Ajit"});
        stringArrayStream.forEach(System.out::println);// Tika Sree Ajit
        // Creating a stream from a list
        List<String> list = new ArrayList<>();
        list.add("Sandeep");list.add("Kadali");list.add("Bango");
        Stream<String> nameStream = list.stream();
        nameStream.forEach(System.out::println);// Sandeep Kadali Bango
        //Creating a stream using generate methdo
        Stream<Integer> generateStream = Stream.generate(()->(new Random()).nextInt(10));
        // limit) method is used to limit the number count to 10
        generateStream.limit(10).forEach(System.out::println);
    }
}
