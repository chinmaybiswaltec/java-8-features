package com.chinmaybiswaltec.stream;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(getName(), student.getName()) && Objects.equals(getDept(), student.getDept()) && Objects.equals(getAge(), student.getAge());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDept(), getAge());
    }
}
