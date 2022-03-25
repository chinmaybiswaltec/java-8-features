package com.chinmaybiswaltec.functionalinterface;

public class RunnableWithFunctionalInterface {

    public static void main(String[] args) {
        new Thread(() ->System.out.println("New Thread Created")
       ).start();
    }
}
