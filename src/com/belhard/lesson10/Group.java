package com.belhard.lesson10;

import staff.Teacher;
import util.GrupUtil;

import java.util.ArrayList;

public class Group {
    private int group_name;
    private int course;
    private ArrayList<Student> students;
    private Teacher teacher;
    private int year_of_admission;
    private int year_of_issue;


    public Group(int group_name, int course, ArrayList<Student> students, Teacher teacher, int year_of_admission, int year_of_issue) {
        this.year_of_admission = year_of_admission;
        this.group_name = group_name;
        this.year_of_issue = year_of_issue;
        this.course = course;
        GrupUtil.checkGrup(group_name, course);
        this.students = students;
        this.teacher = teacher;
    }

    public int getYear_of_issue() {return year_of_issue;}

    public ArrayList<Student> getStudents() {
        return students;
    }

    public int getYear_of_admission() {
        return year_of_admission;
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

    }

    // для консольного ввода
    public void newStudent(ArrayList<Student> newStudents) {
        students.addAll(newStudents);
        for (Student n : students) {
            System.out.println(n.displayInfo());
        }
    }

    public void newStudent(Student newStudents) {
        students.add(newStudents);
        for (Student n : students) {
            System.out.println(n.displayInfo());
        }
    }

    public String displayInfo() {
        return "группа: " + group_name + ", курс: " + course + " .\n" +   teacher.displayInfo();
    }

}

