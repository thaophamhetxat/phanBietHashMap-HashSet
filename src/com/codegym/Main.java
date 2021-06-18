package com.codegym;

import javafx.beans.binding.MapExpression;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("nam", 20, "HN");
        Student student2 = new Student("chiến", 22, "HY");
        Student student3 = new Student("Minh", 19, "HP");

        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1, student1);
        studentMap.put(2, student2);
        studentMap.put(3, student3);

        for (Map.Entry<Integer, Student> student : studentMap.entrySet()) {
            System.out.println(student.toString());
            System.out.println("................................set");
            Set<Student>students=new HashSet<Student>();
            students.add(student1);
            students.add(student2);
            students.add(student3);
            for(Student s:students){
                System.out.println(s.toString());
            }

        }

    }
}
