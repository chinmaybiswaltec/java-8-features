package com.chinmaybiswaltec.methodreference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InstanceMethodReferenceExample2 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Alex");list.add("John");list.add("Daren");
        Collections.sort(list, String::compareToIgnoreCase);
        list.forEach(System.out::println);
    }
}
//Alex Daren John
