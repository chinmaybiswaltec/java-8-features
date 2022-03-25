package com.chinmaybiswaltec.methodreference;

import com.chinmaybiswaltec.lambdaexpression.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StaticMethodReferenceExample {
    public static void main(String[] args) {
        Student s1= new Student("Alex","IT",20);
        Student s2= new Student("Ram","IT", 19);
        Student s3= new Student("Simi","ECE", 21);
        List<Student> students = new ArrayList<>();
        students.add(s1);students.add(s2);students.add(s3);
        System.out.println("Before sorting");
        students.stream().map(s->s.getAge()).forEach(System.out::println);
        //20 19 21
        Collections.sort(students,StaticMethodReferenceExample::compareByAge);
        System.out.println("After sorting using static method reference");
        students.stream().map(s->s.getAge()).forEach(System.out::println);
        //19 20 21
    }

    private static int compareByAge(Student s1, Student s2){
         return s1.getAge().compareTo(s2.getAge());
    }
}
