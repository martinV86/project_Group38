package com.belhard.lesson10.model.staff;
import com.belhard.lesson10.base.People;

import java.util.ArrayList;

public class Methodist extends People {
    private double salary;
    private ArrayList<Teacher> teachers;
    public Methodist(String name, String family_name, int age, String gender, ArrayList <Teacher>teachers, double salary) {
        super(name, family_name, age,gender);
        this.teachers=teachers;
        this.salary=salary;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }
    public double getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return super.toString()+"Methodist , " +
                "оклад " + salary
                ;
    }
}
//создать сервис и репозиторий с методами добавлени/удаления, расчет зп, а также выполнить задание на слайдах

