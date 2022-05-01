package com.belhard.lesson10;

public abstract class People {
    private String name;
    private String family_name;
    private int age;


    public People(String name, String family_name, int age) {
        this.name = name;
        this.family_name = family_name;
        if (age > 0 && age < 200)
            this.age = age;

    }

    public String getName() {
        return name;
    }

    public String getFamily_name() {
        return family_name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " " + family_name + " " + age + " лет ";
    }
}
