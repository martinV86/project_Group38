package util;

import exception.PremiumException;
import exception.SalaryException;
import exception.Working_daysException;

public class SalaryUtil {
    public static void checkSalary(int salary,int working_days,int days_worked, int premium){
        try {
            checkSalaryException(salary);
        } catch (SalaryException e) {
            e.printStackTrace();
        }
        try {
            checkPremiumException(premium);
        } catch (PremiumException e) {
            e.printStackTrace();
        }
        try {
            checkWorking_days(working_days,days_worked);
        } catch (Working_daysException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("параметры для расчета заработной платы преподавателя проверены");
        }
    }
    public static void checkSalary(int salary,int working_days,int days_worked){

        try {
            checkSalaryException(salary);
        } catch (SalaryException e) {
            e.printStackTrace();
        }
        try {
            checkWorking_days(working_days,days_worked);
        } catch (Working_daysException e) {
            e.printStackTrace();
        }

        finally {
            System.out.println("параметры для расчета заработной платы преподавателя проверены");
        }
    }
    private static void checkSalaryException(int salary) throws SalaryException {
        if(salary < 0 || salary > 100000||salary==0){
            throw new SalaryException("оклад преподавателя указан не верно");
        }
    }
    private static void checkWorking_days(int working_days,int days_worked) throws Working_daysException {
        if(working_days<0||working_days>31||working_days==0){
            throw new Working_daysException("не верное количество отработанных дней");
        }
        if(days_worked<0||days_worked>31||days_worked==0){
            throw new Working_daysException("не верное количество рабочих дней");
        }
    }
    private static void checkPremiumException(int premium) throws PremiumException {
        if (premium < 0 || premium > 500||premium==0){
            throw new PremiumException("не верно указана премия преподавателя");
        }
    }
}
