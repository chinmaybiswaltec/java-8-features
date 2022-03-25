package com.chinmaybiswaltec.optional;

import java.util.Optional;

public class OptionalNullableExample {
    public static void main(String[] args) {
        // Creating an empty Optional Object
        Optional emptyOpt = Optional.empty();
        // Trying to get object from empty optional throws NuSuchElementException
       // System.out.println("Empty Optional "+emptyOpt.get());
        Integer nonNullVal = 10;
        Integer nullValue = null;
        Optional<Integer> ofNullableOptWithNonNull = Optional.ofNullable(nonNullVal);
        Optional<Integer> ofNullableOptWithNull = Optional.ofNullable(nullValue);
        System.out.println("Getting value from Non Null object ofNullable "
                +ofNullableOptWithNonNull.get());//10
        Optional<Integer> ofOptWithNull = Optional.of(nullValue);
        System.out.println("Getting value from null value"+ofOptWithNull);
        //Exception in thread "main" java.lang.NullPointerException
    }
}
