package com.belhard.lesson10;

public class Teacher extends People {

    private Address address;
    private double accued;

    public Teacher(String name, String family_name, int age, Address address) {
        super(name, family_name, age);
        this.address = address;
    }


    public Address getAddress() {
        return address;
    }

    public double money(int salary, int premium, int working_days, int days_worked) {
        if (salary > 0 && salary < 1000000 && premium > 0 && premium <= 100 && working_days > 0 && working_days < 31 && days_worked > 0 && days_worked < 31) {
            double money;// зарплата без налога
            double dues = 0.14; //налог
            money = (salary / working_days) * days_worked + salary * premium / 100;
            double accued = money - money * dues;
            this.accued = accued;

        } else {
            System.out.println("проверьте вводные данные");
        }
        return accued;
    }

    public double money(int salary, int working_days, int days_worked) {
        if (salary > 0 && salary < 1000000 && working_days > 0 && working_days < 31 && days_worked > 0 && days_worked < 31) {
            double money;// зарплата без налога
            double dues = 0.14; //налог
            money = (salary / working_days) * days_worked;
            double accued = money - money * dues;
            this.accued = accued;

        } else {
            System.out.println("проверьте вводные данные");
        }
        return accued;
    }
    // зделать перезагрузку метода.

    public double getAccued() {
        return accued;
    }

    public String displayInfo() {
        return "Преподаватель: " + super.toString() + " " + address.displayInfo() + " " + " зарплата " + accued;
    }
}
