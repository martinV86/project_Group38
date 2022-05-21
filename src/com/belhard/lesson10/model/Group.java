package com.belhard.lesson10.model;

import com.belhard.lesson10.model.staff.Teacher;
import com.belhard.lesson10.util.GrupUtil;

import java.util.ArrayList;
import java.util.List;

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

    public Group(int group_name, int course, int year_of_admission, int year_of_issue) {
        this.group_name = group_name;
        this.course = course;
        this.year_of_admission = year_of_admission;
        this.year_of_issue = year_of_issue;
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

    public List<Student> stInfo() {
        students.stream()
                .sorted()
                .forEach(System.out::println);
        return students;
    }
    public String displayInfo() {
        return "группа: " + group_name + ", курс: " + course + " .\n" +   teacher.displayInfo()+students;
    }

}
