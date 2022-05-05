package com.belhard.lesson10.model;

import java.util.Comparator;

public class Track implements Comparable<Track> {
    private int wage;
    private String color;
    private int power;
    private String model;

    public Track(String color, int power, String model,int wage) {
        this.color=color;
        this.model=model;
        this.power=power;
        this.wage=wage;
    }

    public int getWage() {
        return wage;
    }
    @Override
    public int compareTo(Track arg0){
        return this.wage-arg0.wage;
    }

    @Override
    public String toString() {
        return "Track{" +
                "wage=" + wage +
                ", color='" + color + '\'' +
                ", power=" + power +
                ", model='" + model + '\'' +
                '}';
    }
}
