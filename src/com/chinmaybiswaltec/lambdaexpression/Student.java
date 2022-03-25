package com.chinmaybiswaltec.lambdaexpression;

public class Student {
    private String name;
    private String dept;
    private Integer age;
    public Student(String name, String dept, Integer age){
        this.name = name;
        this.dept = dept;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }
}
