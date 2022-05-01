package com.belhard.lesson10;

import util.GrupUtil;

import java.util.ArrayList;

public class Group {
    private int group_name;
    private int course;
    private ArrayList<Student> student;
    private Teacher teacher;


    public Group(int group_name, int course, ArrayList<Student> student, Teacher teacher) {

        this.group_name = group_name;

        this.course = course;
        GrupUtil.checkGrup(group_name, course);
        this.student = student;
        this.teacher = teacher;
    }

    public int getGroup_name() {
        return group_name;
    }

    public int getCourse() {
        return course;
    }

    public ArrayList<Student> getStudent() {
        return student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void stInfo() {
        for (Student n : student) {
            System.out.println(n.displayInfo());
        }

    }

    public void dellit(int name) {
        student.remove(name);

        for (Student n : student) {
            System.out.println(n.displayInfo());

        }
    }

    public void newStudent(Student newStudent) {
        student.add(newStudent);
        for (Student n : student) {
            System.out.println(n.displayInfo());
        }
    }


    public String displayInfo() {
        return "группа: " + group_name + ", курс: " + course + " .\n" + "\n " + teacher.displayInfo();
    }

}
