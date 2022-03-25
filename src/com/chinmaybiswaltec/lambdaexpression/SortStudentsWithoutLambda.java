package com.chinmaybiswaltec.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortStudentsWithoutLambda {
    public static void main(String[] args) {
        Student s1= new Student("Alex","IT",20);
        Student s2= new Student("Ram","IT", 19);
        Student s3= new Student("Simi","ECE", 21);
        List<Student> students = new ArrayList<>();
        students.add(s1);students.add(s2);students.add(s3);
        System.out.println("Students before sorting");
        students.forEach(s-> System.out.println(s.getAge()));
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        System.out.println("Students after sorting");
        students.forEach(s-> System.out.println(s.getAge()));
    }
}
