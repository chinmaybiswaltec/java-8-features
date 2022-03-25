package com.chinmaybiswaltec.lambdaexpression;

public class LambdaExpressionExample {
    public static void main(String[] args) {
        MyFunctionalInterface myFunctionalInterface = (s)-> System.out.println("Printing "+s);
        myFunctionalInterface.method("Hello Chinmaybiswaltech!!!");
    }
}
//Printing Hello Chinmaybiswaltech!!!
