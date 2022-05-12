package com.belhard.lesson10.util;

import com.belhard.lesson10.exception.AgeException;
import com.belhard.lesson10.exception.AgeStudentException;
import com.belhard.lesson10.exception.AgeTeacherException;

public class AgeUtil {
    public static void checkAge(int age) {
        try {
            checkAgeException(age);
            checkAgeStudent(age);
//            checkAgeTeacher(age);
//        } catch (AgeTeacherException | AgeStudentException e) {

        } catch (AgeStudentException e) {
            e.printStackTrace();
        } catch (AgeException e) {
            e.printStackTrace();
        } finally {
            System.out.println("возраст студента проверен");
        }
    }
    public static void checkAgeT(int age){
        try {
            checkAgeTeacher(age);
            checkAgeException(age);
        } catch (AgeTeacherException e) {
            e.printStackTrace();
        } catch (AgeException e) {
            e.printStackTrace();
        }finally {
            System.out.println("возраст преподавателя проверен");
        }
    }

    private static void checkAgeException(int age) throws AgeException {
        if (age < 0||age>1000) {
            throw new AgeException("не верно указан возраст");
        }
    }
    private static void checkAgeStudent(int age) throws AgeStudentException {
        if(age<16){
            throw new AgeStudentException("слишком молод даже для судента");
        }
        if (age>50){
            throw new AgeStudentException("слишком стар для студента");
        }
    }
    private static void checkAgeTeacher(int age) throws AgeTeacherException {
        if (age<18){
            throw new AgeTeacherException("слишком молод для преподавателя");
        }
        if (age>100){
            throw new AgeTeacherException("слишком стар даже для преподавателя");
        }
    }
}
