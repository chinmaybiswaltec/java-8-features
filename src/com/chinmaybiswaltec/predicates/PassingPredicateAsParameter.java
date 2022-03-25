package com.chinmaybiswaltec.predicates;

import java.util.function.Predicate;

public class PassingPredicateAsParameter {

    public static void main(String[] args) {
        Predicate<Integer> predicate = (i)->i<10;
        predicateAsParameter(100, predicate);//false
        predicateAsParameter(8, predicate);//true
    }
    static void predicateAsParameter(int number, Predicate<Integer> predicate){
        System.out.println(predicate.test(number));
    }
}
