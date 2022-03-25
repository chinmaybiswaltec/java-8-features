package com.chinmaybiswaltec.supplier;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Integer> supplier = ()->  100;
        System.out.println(supplier.get());//100
    }
}
