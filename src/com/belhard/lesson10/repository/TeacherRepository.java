package com.belhard.lesson10.repository;

import com.belhard.lesson10.model.staff.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepository {
    private List<Teacher>teachers=new ArrayList<>();
    private double accued;
    public void removeTeacher(List<Teacher>removeTeacher){
        teachers.remove(removeTeacher);
    }
    public void addTeacher(List<Teacher>addTeacher){
        teachers.addAll(addTeacher);
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

}
