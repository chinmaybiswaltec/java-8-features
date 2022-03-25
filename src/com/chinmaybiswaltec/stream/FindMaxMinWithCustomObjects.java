package com.chinmaybiswaltec.stream;

import com.chinmaybiswaltec.lambdaexpression.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindMaxMinWithCustomObjects {
    public static void main(String[] args) {
        Student s1= new Student("Alex","IT",20);
        Student s2= new Student("Ram","IT", 19);
        Student s3= new Student("Simi","ECE", 21);
        List<Student> students = new ArrayList<>();
        students.add(s1);students.add(s2);students.add(s3);
        Optional<Student> maxStudentOpt = students.stream().max(Comparator.comparing(Student::getAge));
        System.out.println("Maximum age of student "+maxStudentOpt.get().getAge());
        //Maximum age of student 21
        Optional<Student> minStudentOpt = students.stream().min(Comparator.comparing(Student::getAge));
        System.out.println("Minimum age of student "+minStudentOpt.get().getAge());
        //Minimum age of student 19
    }
}
