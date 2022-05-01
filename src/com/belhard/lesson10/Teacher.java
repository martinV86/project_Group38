package com.belhard.lesson10;

public class Teacher {
    private String name;
    private String family_name;
    private int age;
    private Address address;
    private double accued;

    public Teacher(String name, String family_name, int age, Address address) {
        this.name = name;
        this.family_name = family_name;
        if (age > 0 && age < 200) {
            this.age = age;
            this.address=address;
        }
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
            ;
        } else {
            System.out.println("проверьте вводные данные");
        }
        return accued;
    }

    public double getAccued() {
        return accued;
    }
    public String displayInfo(){
        return "Преподаватель: "+name+" "+family_name+" "+age+" лет "+address.displayInfo()+" "+" зарплата "+ accued;
    }
}
