package com.chinmaybiswaltec.methodreference;

import java.util.function.Function;

public class MethodReferenceExample2 {
    public static void main(String[] args) {
        MethodReferenceExample2 obj = new MethodReferenceExample2();
        Function<Integer, Integer> multiplyFunction = i->obj.multiplyMethod(i);
        Function<Integer, Integer> divideFunction = i->obj.divideMethod(i);
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
