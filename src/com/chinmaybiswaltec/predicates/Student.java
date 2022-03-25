package com.chinmaybiswaltec.predicates;

public class Student {
    private String name;
    private String dept;
    public Student(String name, String dept){
        this.name = name;
        this.dept = dept;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }
}
