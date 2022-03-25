package com.chinmaybiswaltec.optional;

import java.sql.SQLOutput;
import java.util.Optional;

public class OptionalOrElseExample {
    public static void main(String[] args) {
        Optional<String> nonEmptyOpt = Optional.of("Hello");
        Optional<String> emptyOpt = Optional.empty();
        //As Optional is non-empty it returns the contained object
        System.out.println(nonEmptyOpt.orElse("Default value as Optional is Empty"));
        //Hello
        //As Optional is empty it returns the default supplied value
        System.out.println(emptyOpt.orElse("Default value as Optional is Empty"));
        //Default value as Optional is Empty
    }
}
