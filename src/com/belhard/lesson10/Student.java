package com.belhard.lesson10;

import util.AgeUtil;

public class Student extends People {
    private Address address;

    public Student(String name, String family_name, int age, String gender, Address address) {
        super(name, family_name, age,gender);
        AgeUtil.checkAge(age);
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }


    public String displayInfo() {
        return "Студент: " + super.toString() + " " + address.displayInfo();
    }
}
