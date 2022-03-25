package com.chinmaybiswaltec.predicates;

import java.util.function.Predicate;

public class PredicateNegateMethods {

    public static void main(String[] args) {
        // Creating one predicate
        Predicate<Integer> greaterThan50 = (i)->i>50;
        //Negate method returns a predicate that is logical negation of the current predicate
        Predicate<Integer> negationOfGreaterThan50 = greaterThan50.negate();
        System.out.println(negationOfGreaterThan50.test(100));//false
    }
}
