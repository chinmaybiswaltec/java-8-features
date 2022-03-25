package com.chinmaybiswaltec.predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInCollection {

    public static void main(String[] args) {
        Student s1= new Student("Alex","IT");
        Student s2= new Student("Ram","IT");
        Student s3= new Student("Simi","ECE");
        List<Student> students = new ArrayList<>();
        students.add(s1);students.add(s2);students.add(s3);
        Predicate<Student> predicate = (student)->student.getDept().equals("IT");
        filterItStudents(students, predicate);
    }

    private static void filterItStudents(List<Student> students, Predicate<Student> predicate){
        for(Student student : students){
          if(predicate.test(student)){
              System.out.println(student.getName());//Alex//Ram
          }
        }
    }
}
