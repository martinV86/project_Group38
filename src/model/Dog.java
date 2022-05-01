package model;

public class Dog {
    private String name;
    private int age;
    private int wage;

    public Dog(String name, int age,  int wage) {
        this.name = name;
        this.age = age;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWage() {
        return wage;
    }
}
