package org.exception.exercice4;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int age;
    List<Student> students = new ArrayList<Student>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
        this.name = "Roger";
        this.age = 15;
        students.add(this);
    }


    public void createStudent(String name, int age) {
        students.add(new Student(name, age));
    }

    public void afficherStudents() {
        for (Student student : students) {
            System.out.println("Nom : " + student.getName() + " | Age : " + student.getAge());
        }
    }
}
