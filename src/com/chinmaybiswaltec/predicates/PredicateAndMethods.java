package com.chinmaybiswaltec.predicates;

import java.util.function.Predicate;

public class PredicateAndMethods {

    public static void main(String[] args) {
        // Creating one predicate
        Predicate<Integer> greaterThan50 = (i)->i>50;
        // Creating other predicate
        Predicate<Integer> lessThan100 = (i)->i<100;
        // Combining two predicates using AND operator to create a composite predicate
        Predicate<Integer> andCompositePredicate = greaterThan50.and(lessThan100);
        System.out.println(andCompositePredicate.test(70));//true
        System.out.println(andCompositePredicate.test(100));//false
    }
}
