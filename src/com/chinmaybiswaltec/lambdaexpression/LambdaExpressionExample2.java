package com.chinmaybiswaltec.lambdaexpression;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionExample2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Alex");list.add("John");list.add("Daren");
        //No need to provide parenthesis in case of single argument
        list.forEach(str-> System.out.println(str));
        list.forEach(str->{
            if(str.startsWith("A")){
                System.out.println(str);
            }
        });
    }
}
