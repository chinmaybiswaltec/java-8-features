package com.chinmaybiswaltec.methodreference;

import java.util.function.Function;

public class MethodReferenceExample3 {
    public static void main(String[] args) {
        MethodReferenceExample3 obj = new MethodReferenceExample3();
        Function<Integer, Integer> multiplyFunction = obj::multiplyMethod;
        Function<Integer, Integer> divideFunction =   obj::divideMethod;
        methodRef(10,multiplyFunction);
        methodRef(10,divideFunction);
    }

    private  Integer multiplyMethod(int i){
        return i*10;
    }

    private  Integer divideMethod(int i){
        return i/10;
    }

    private static void methodRef(Integer i,Function<Integer, Integer> function){
        System.out.println(function.apply(i));
    }
}
//Output : 100
// 1
