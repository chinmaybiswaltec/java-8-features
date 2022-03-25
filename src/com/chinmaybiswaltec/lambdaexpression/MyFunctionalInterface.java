package com.chinmaybiswaltec.lambdaexpression;

@FunctionalInterface
public interface MyFunctionalInterface {
    void method(String s);
    default void defaultMethod(){
        System.out.println("Default method in Functional Interface");
    }
}
