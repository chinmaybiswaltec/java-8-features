package com.chinmaybiswaltec.functionalinterface;

public class RunnableBeforeJava8 {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("New Thread Created");
            }
        }).start();
    }
}
