package com.belhard.lesson10;

public class Associate {
    private String name;
    private int age;
    private int salary;
    private String specialization;

    public Associate(String name, int age, int salary, String specialization) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public String toString() {
        return
                 name + '\'' +
                ", " + age +
                ", " + salary +
                ", " + specialization + '\n' ;
    }
}
