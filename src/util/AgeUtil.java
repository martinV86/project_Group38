package util;

import exception.AgeException;
import exception.AgeStudentException;
import exception.AgeTeacherException;

public class AgeUtil {
    public static void checkAge(int age) {
        try {
            checkAgeException(age);
            checkAgeStudent(age);
            checkAgeTeacher(age);
        } catch (AgeTeacherException | AgeStudentException e) {
            e.printStackTrace();
        } catch (AgeException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("возраст проверен");
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
