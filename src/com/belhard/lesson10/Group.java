package com.belhard.lesson10;

import staff.Teacher;
import util.GrupUtil;

import java.util.ArrayList;

public class Group {
    private int group_name;
    private int course;
    private ArrayList<Student> students;
    private Teacher teacher;


    public Group(int group_name, int course, ArrayList<Student> students, Teacher teacher) {

        this.group_name = group_name;

        this.course = course;
        GrupUtil.checkGrup(group_name, course);
        this.students = students;
        this.teacher = teacher;
    }

    public int getGroup_name() {
        return group_name;
    }

    public int getCourse() {
        return course;
    }

    public ArrayList<Student> getStudent() {
        return students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void stInfo() {
        for (Student n : students) {
            System.out.println(n.displayInfo());
        }

    }

    public void delStudent(String name) {
        for (Student n : students) {
            if (n.getName().equals(name)) {
                students.remove(n);
            }
        }
        for (Student t : students) {
            System.out.println(t.displayInfo());
        }
//
    }


    public void newStudent(ArrayList<Student> newStudents) {
        students.addAll(newStudents);
        for (Student n : students) {
            System.out.println(n.displayInfo());
        }
    }


    public void displayInfo() {
        System.out.println("группа: " + group_name + ", курс: " + course + " .\n" + "\n " + teacher.displayInfo());
    }

}

