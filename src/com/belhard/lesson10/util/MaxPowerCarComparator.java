package com.belhard.lesson10.util;

import com.belhard.lesson10.model.Car;

import java.util.Comparator;

public class MaxPowerCarComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getPower()-o2.getPower();
    }
}
