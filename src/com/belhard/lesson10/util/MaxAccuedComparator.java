package com.belhard.lesson10.util;

import com.belhard.lesson10.model.staff.Teacher;

import java.util.Comparator;

public class MaxAccuedComparator implements Comparator<Teacher> {
    @Override
    public int compare(Teacher o1, Teacher o2) {
        int rez= (int) (Math.round(o2.getAccued())-Math.round(o1.getAccued()));
        if (rez==0){
            rez=o1.getAge()-o2.getAge();
        }
        return rez;
    }
}
