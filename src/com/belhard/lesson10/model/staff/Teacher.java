package com.belhard.lesson10.model.staff;

import com.belhard.lesson10.model.Address;
import com.belhard.lesson10.base.People;
import com.belhard.lesson10.repository.TeacherRepository;
import com.belhard.lesson10.util.AgeUtil;
import com.belhard.lesson10.util.SalaryUtil;

public class Teacher extends People implements Comparable<Teacher> {

    private Address address;
    private double accued;
    TeacherRepository teacherRepository = new TeacherRepository();

    public Teacher(String name, String family_name, int age, String gender, Address address) {
        super(name, family_name, gender);
        this.address = address;
        if (age > 0) {
            super.setAge(age);
        } else {
            super.setAge(1);
        }
        AgeUtil.checkAgeT(age);
    }

    public Address getAddress() {
        return address;
    }

    public void setAccued(double accued) {
        this.accued = accued;
    }

    public double getAccued() {
        return accued;
    }

    public String displayInfo() {

        return "Преподаватель: " + super.toString() + " " + address.displayInfo() + " " + " зарплата " + accued;
    }

    @Override
    public int compareTo(Teacher o) {
        return this.getName().compareTo(o.getName());
    }
}
