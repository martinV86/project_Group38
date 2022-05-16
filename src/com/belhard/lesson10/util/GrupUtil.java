package com.belhard.lesson10.util;

import com.belhard.lesson10.exception.CourseException;
import com.belhard.lesson10.exception.Group_nameException;

public class GrupUtil {
    public static void checkGrup(int number, int curs) {

        try {
            checkCourseException(curs);
        } catch (CourseException e) {
            e.printStackTrace();
        }
        try {
            checkGrupException(number);
        } catch (Group_nameException e) {
            e.printStackTrace();
        }

        finally {
            System.out.println("номер и курс группы проверен");
        }
    }

    private static void checkGrupException(int number) throws Group_nameException {
        if (number < 0 || number > 100) {

            throw new Group_nameException("не верно указан номер группы");

        }
    }
    private static void checkCourseException(int curs) throws CourseException {
        if(curs<1||curs>5){
            throw new CourseException("не верно указан номер курса");
        }
    }
}
