package com.chinmaybiswaltec.consumer;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<Integer> consumerExample = (i)-> System.out.println("Printing accepted value "+i);
        consumerExample.accept(100);
    }
}
