package model;

public class Raccon {
    private String name;
    private int age;
    private int wage;
    private  String color;

    public Raccon( String name,int age , int wage, String color) {
        this.name = name;
        this.age = age;
        this.wage = wage;
        this.color = color;
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

    public String getColor() {
        return color;
    }
}