package com.chinmaybiswaltec.stream;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindCountRemoveDuplicatesInCustomObjects {
    public static void main(String[] args) {
        Student s1= new Student("Alex","IT",20);
        Student s2= new Student("Ram","IT", 19);
        Student s3= new Student("Simi","ECE", 21);
        Student s4= new Student("Simi","ECE", 21);
        List<Student> students = new ArrayList<>();
        students.add(s1);students.add(s2);students.add(s3);students.add(s4);
        System.out.println("Students before removing duplicate");
        students.forEach(s-> System.out.println(s.getName()));
        //Alex
        //Ram
        //Simi
        //Simi
        List<Student> distinctStudents = students.stream().distinct().collect(Collectors.toList());
        System.out.println("Students after removing duplicate");
        distinctStudents.forEach(s->System.out.println(s.getName()));
        //Alex
        //Ram
        //Simi
    }
}
