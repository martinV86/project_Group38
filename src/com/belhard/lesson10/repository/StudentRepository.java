package com.belhard.lesson10.repository;

import com.belhard.lesson10.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    private List<Student>students=new ArrayList<>();
    public void removeStudent(List<Student>removeStudent){
        students.remove(removeStudent);
    }
    public void addStudent(List<Student>addStudent){
        students.addAll(addStudent);
    }

    public void changeStudent(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }
}
