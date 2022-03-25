package com.chinmaybiswaltec.predicates;

import java.util.function.Predicate;

public class PredicateExamples {

    public static void main(String[] args) {
        //Creating a predicate
        Predicate<Integer> greaterThan50 = (i)->i>50;
        System.out.println(greaterThan50.test(100));//true
        System.out.println(greaterThan50.test(40));//false
    }
}
