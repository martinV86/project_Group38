package com.belhard.lesson10;

public abstract class People {
    private String name;
    private String family_name;
    private int age;
    private String gender;

    public People(String name, String family_name, int age,String gender) {
        this.name = name;
        this.family_name = family_name;
        this.age = age;
        this.gender=gender;

    }

    public String getGender() {return gender;}

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
