package com.chinmaybiswaltec.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class AndThenMethodInConsumer {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (i)-> System.out.println("Printing "+i);
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Consumer<Integer> anotherConsumer = (i)-> System.out.println("Printing "+i*i);
        Consumer<Integer> combinedConsumer = consumer.andThen(anotherConsumer);
        print(list,combinedConsumer);
    }

    private static void print(List<Integer> list, Consumer<Integer> consumer){
        for(Integer i : list){
            consumer.accept(i);
        }
    }
}

