package staff;

import com.belhard.lesson10.People;

import java.util.ArrayList;

public class Methodist extends People {
    private double salary;
    private ArrayList<Teacher> teachers;
    public Methodist(String name, String family_name, int age, ArrayList <Teacher>teachers, double salary) {
        super(name, family_name, age);
        this.teachers=teachers;
        this.salary=salary;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString()+"Methodist" +
                "salary=" + salary +
                ", teachers=" + teachers +
                '}';
    }
}

