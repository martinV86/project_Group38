package com.belhard.lesson10;

public class Student {
    private String name;
    private String family_name;
    private int age;
    private Address address;

    public Student(String name, String family_name, int age,Address address) {
        if (age > 0 && age < 200) {
            this.age = age;
        }
        this.family_name = family_name;
        this.name = name;
        this.address =address;
    }


    public int getAge() {
        return age;
    }

    public String getFamily_name() {
        return family_name;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
    public String displayInfo(){
        return "Студент: "+name+" "+family_name+" "+age+" лет "+address.displayInfo();
    }
}
