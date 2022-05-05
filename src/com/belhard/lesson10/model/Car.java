package com.belhard.lesson10.model;

public class Car implements Comparable<Car> {
    private String color;
    private int power;
    private String model;

    public Car(String color, int power, String model) {
        this.color = color;
        this.power = power;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public int getPower() {
        return power;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return color + " " + model + " " + power;
    }

    @Override
    public int compareTo(Car arg0) {
        //return  this.power-arg0.power;//  1.получить результат разницы, 2 сравниваем полученный результат с нулем, 3. >0||==0||<0
        int rez = this.model.compareTo(arg0.model);
        if (rez == 0) {
            rez = this.color.compareTo(arg0.color);
            if (rez == 0) {
                rez = this.power - arg0.power;
            }
        }
        return rez;
    }
}
