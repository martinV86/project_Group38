package staff;

import com.belhard.lesson10.Address;
import com.belhard.lesson10.People;
import util.AgeUtil;
import util.SalaryUtil;

public class Teacher extends People implements Comparable<Teacher>{

    private Address address;
    private double accued;

    public Teacher(String name, String family_name, int age, String gender, Address address) {
        super(name, family_name, age, gender);
        this.address = address;
        AgeUtil.checkAgeT(age);
    }


    public Address getAddress() {
        return address;
    }

    public double money(int salary, int premium, int working_days, int days_worked) {
        SalaryUtil.checkSalary(salary, working_days, days_worked, premium);
        double money;// зарплата без налога
        double dues = 0.14; //налог
        money = (salary / working_days) * days_worked + salary * premium / 100;
        double accued = money - money * dues;
        this.accued = accued;
        return accued;
    }

    public double money(int salary, int working_days, int days_worked) {
        SalaryUtil.checkSalary(salary, working_days, days_worked);
        double money;// зарплата без налога
        double dues = 0.14; //налог
        money = (salary / working_days) * days_worked;
        double accued = money - money * dues;
        this.accued = accued;
        return accued;
    }

    public double getAccued() {
        return accued;
    }

    public String displayInfo() {
        return "Преподаватель: " + super.toString() + " " + address.displayInfo() + " " + " зарплата " + accued;
    }

    @Override
    public int compareTo(Teacher o) {
        return this.getName().compareTo(o.getName());
    }
}