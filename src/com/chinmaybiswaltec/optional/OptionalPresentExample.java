package com.chinmaybiswaltec.optional;

import java.util.Optional;

public class OptionalPresentExample {
    public static void main(String[] args) {
        Optional<String> nonEmptyOpt = Optional.of("Hello");
        Optional<String> emptyOpt = Optional.empty();
        if(nonEmptyOpt.isPresent()){
            // As this is a non-empty optional if clause will be executed
            System.out.println("This optional contains an object");
        }else{
            System.out.println("This optional doesn't contains an object");
        }

        if(emptyOpt.isPresent()){
            System.out.println("This optional contains an object");
        }else{
            // As this is an empty optional else clause will be executed
            System.out.println("This optional doesn't contains an object");
        }

        nonEmptyOpt.ifPresent(s-> System.out.println("Object inside optional is "+s));
        //Object inside optional is Hello
        emptyOpt.ifPresent(s-> System.out.println("Object inside optional is "+s));
        // As the Optional is empty nothing got printed
    }
}
