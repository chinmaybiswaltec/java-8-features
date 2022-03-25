package com.chinmaybiswaltec.methodreference;

import java.util.ArrayList;
import java.util.List;

public class MethodReferencesExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Alex");list.add("John");list.add("Daren");
        //Without Method Reference
        list.forEach(s-> System.out.print(s));
        //With Method Reference
        list.forEach(System.out::print);
    }
}
