package util;

import exception.AgeException;
import exception.OldException;
import exception.YongException;

public class AgeUtil {
    public static void checkAge(int age) {
//        try {
//            if (age < 0) {
//                throw new AgeException("возраст меньше нуля");
//            }
//            if (age > 1000) {
//                throw new AgeException("нериальный возраст");
//            }
//        } catch (AgeException e) {
//            System.out.println(e.getMessage());


//            e.getMessage();
//            e.printStackTrace();
//        }



//        try {
//            if (age < 18) {
//                throw new YongException("не подходит к рабскому труду - слишком молод ");
//            }
//            if (age > 80) {
//                throw new OldException("не подходит к рабскому труду - слишком стар");
//            }
//            System.out.println("возраст подходит");
//        } catch (YongException | OldException ye)  { // catch (AgeException ye)
//            System.out.println(ye.getMessage());
//        }
//finally {
//            System.out.println("ales!");
//        }


        try {
            checkAgeYong(age);
            checkOld(age);
            System.out.println("возраст подходит");
        } catch (YongException | OldException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("ales!");
        }



    }
    private static void checkAgeYong(int age) throws YongException {
        if (age < 18) {
            throw new YongException("не подходит к рабскому труду - слишком молод ");
        }
    }
    private static void checkOld(int age) throws OldException {
        if (age > 80) {
            throw new OldException("не подходит к рабскому труду - слишком стар ");
        }
    }
}