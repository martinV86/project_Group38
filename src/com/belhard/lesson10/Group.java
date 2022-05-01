package com.belhard.lesson10;

import java.util.Scanner;

public class Group {
    private int group_name;
    private int course;
    private Student student;
    private Teacher teacher;

    public Group(int group_name, int course, Student student, Teacher teacher) {
        if(group_name>0) {
            this.group_name = group_name;
        }
        if (course>0&&course<6) {
            this.course = course;
        }
        this.student = student;
        this.teacher = teacher;
    }

    public int getGroup_name() {
        return group_name;
    }

    public int getCourse() {
        return course;
    }

    public Student getStudent() {
        return student;
    }

    public Teacher getTeacher() {
        return teacher;
    }
    public void displayInfo(){
        System.out.println("группа: "+group_name+", курс: "+course+" .\n" +student.displayInfo()+"\n " +teacher.displayInfo());
    }

}
