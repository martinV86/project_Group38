package com.belhard.lesson10.service;

import com.belhard.lesson10.model.Address;
import com.belhard.lesson10.model.staff.Teacher;
import com.belhard.lesson10.repository.TeacherRepository;
import com.belhard.lesson10.util.GroupComparator;
import com.belhard.lesson10.util.MaxAccuedComparator;
import com.belhard.lesson10.util.SalaryUtil;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TeacherService {
    private TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public void removeTeacher(List<Teacher> removeTeacher, Teacher remove) {
        Comparator maniComparator = new MaxAccuedComparator();
        System.out.println("removeTeacher: ");
        removeTeacher.remove(remove);
        removeTeacher.stream()
                .sorted(maniComparator)
                .forEach(System.out::println);
        teacherRepository.removeTeacher(removeTeacher);
    }

    public void addTeacher(List<Teacher> newTeacher, Teacher teacher) {
        Comparator maniComparator = new MaxAccuedComparator();
        System.out.println("addTeacher: ");
        newTeacher.add(teacher);
        newTeacher
                .stream()
                .sorted(maniComparator)
                .forEach(System.out::println);
        teacherRepository.addTeacher(newTeacher);
    }

    private static Address dataAddress() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Город: ");
        String city_t = scanner.nextLine();
        System.out.println("Улица: ");
        String street_t = scanner.nextLine();
        System.out.println("Дом: ");
        int hous_t = scanner.nextInt();
        System.out.println("Квартира: ");
        int apartment_t = scanner.nextInt();
        Address address = new Address(city_t, street_t, hous_t, apartment_t);
        return address;
    }

    public void changeTeacher(List<Teacher> changeTeacher, String name) {
        Comparator maniComparator = new MaxAccuedComparator();
        int index = 0;
        Teacher teacher = null;
        Scanner scanner = new Scanner(System.in);
        for (Teacher n : changeTeacher) {
            if (name.equalsIgnoreCase(n.getName())) {
                index = changeTeacher.indexOf(n);
                System.out.println("Введите данные :\n Имя ");
                String name_t = scanner.nextLine();
                System.out.println("Фамилия: ");
                String family_t = scanner.nextLine();
                System.out.println("пол (м/ж): ");
                String gender = scanner.nextLine();
                System.out.println("Возраст: ");
                int age_t = scanner.nextInt();
                teacher = new Teacher(name_t, family_t, age_t, gender, dataAddress());
                System.out.println("Введите через  данные для расчета зарплаты преподавателя: ");
                System.out.println(" Оклад:");
                int salary = scanner.nextInt();
                System.out.println("количество рбочих дней:");
                int working_days = scanner.nextInt();
                System.out.println("количество фвктически отработанных дней:");
                int days_worked = scanner.nextInt();
                System.out.println("предусмотрена ли премия? 1-да/2-нет):");
                scanner.nextLine();//(It consumes the \n character)
                int ipremium = scanner.nextInt();
                if (ipremium == 1) {
                    System.out.println(" премия (%):");
                    int premium = scanner.nextInt();
                    money(teacher, salary, premium, working_days, days_worked);
                } else {
                    money(teacher, salary, working_days, days_worked);
                }
            }
        }
        System.out.println("changeTeacher");
        changeTeacher.set(index, teacher);
        changeTeacher.stream()
                .sorted(maniComparator)
                .forEach(System.out::println);
        teacherRepository.setTeachers(changeTeacher);
    }

    public void money(Teacher teacher, int salary, int premium, int working_days, int days_worked) {
        SalaryUtil.checkSalary(salary, working_days, days_worked, premium);
        double money;// зарплата без налога
        double dues = 0.14; //налог
        money = (salary / working_days) * days_worked + salary * premium / 100;
        double accued = money - money * dues;

        teacher.setAccued(accued);
    }

    public void money(Teacher teacher, int salary, int working_days, int days_worked) {
        SalaryUtil.checkSalary(salary, working_days, days_worked);
        double money;// зарплата без налога
        double dues = 0.14; //налог
        money = (salary / working_days) * days_worked;
        double accued = money - money * dues;

        teacher.setAccued(accued);
    }

    public void sortPension(List<Teacher> teachers) {
        Comparator maniComparator = new MaxAccuedComparator();
        teachers.stream()
                .filter(s -> s.getAge() > 60 && s.getGender().equalsIgnoreCase("ж") || s.getAge() > 65 && s.getGender().equalsIgnoreCase("ж"))
                .sorted(maniComparator)
                .forEach(s -> System.out.println(s));
    }

    public void sortHighSalary(List<Teacher> teachers) {
        Comparator maniComparator = new MaxAccuedComparator();
        teachers.stream()
                .filter(s -> s.getAccued() > 2100)
                .sorted(maniComparator)
                .forEach(s -> System.out.println(s));
    }

}
