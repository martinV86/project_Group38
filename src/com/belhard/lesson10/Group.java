package com.belhard.lesson10;

public class Group {
    private int group_name;
    private int course;
    private Student[] student;
    private Teacher teacher;


    public Group(int group_name, int course, Student[] student, Teacher teacher) {
        if (group_name > 0) {
            this.group_name = group_name;
        }
        if (course > 0 && course < 6) {
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

    public Student[] getStudent() {
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

        for (int i = 0; i < student.length; i++) {
            if (i == name - 1) {
                student[i] = null;
            }
        }
        Student[] del = new Student[student.length - 1];
        int i = 0;
        for (int j = 0; j < student.length; j++) {
            if (student[j] != null) {
                del[i] = student[j];
                i++;
            }
        }
        for (Student n : del) {
            System.out.println(n.displayInfo());
        }
    }

    public void newStudent(Student newStudent) {
        Student[] newaray = new Student[student.length + 1];
        for (int i = 0; i < student.length; i++) {
            newaray[i] = student[i];
        }
        newaray[newaray.length - 1] = newStudent;
        for (Student n : newaray) {
            System.out.println(n.displayInfo());
        }
    }

    public String displayInfo() {
        return "группа: " + group_name + ", курс: " + course + " .\n" + "\n " + teacher.displayInfo();
    }

}
