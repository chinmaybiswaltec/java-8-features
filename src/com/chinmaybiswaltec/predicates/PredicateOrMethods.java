package com.chinmaybiswaltec.predicates;

import java.util.function.Predicate;

public class PredicateOrMethods {

    public static void main(String[] args) {
        // Creating one predicate
        Predicate<Integer> greaterThan50 = (i)->i>50;
        // Creating other predicate
        Predicate<Integer> lessThan100 = (i)->i<100;
        // Combining two predicates using OR operator to create a composite predicate
        Predicate<Integer> orCompositePredicate = greaterThan50.or(lessThan100);
        System.out.println(orCompositePredicate.test(70));//true
    }
}
