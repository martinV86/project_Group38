package com.belhard.lesson10.service;

import com.belhard.lesson10.model.Address;
import com.belhard.lesson10.model.Student;
import com.belhard.lesson10.repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void removeStudent(List<Student> removeStudent, String name) {
        System.out.println("removeStudent: ");
        for (Student n : removeStudent) {
            if (name.equalsIgnoreCase(n.getName())) {
                removeStudent.remove(n);
            }
        }
        removeStudent.forEach(student -> System.out.println(student.displayInfo()));
        studentRepository.removeStudent(removeStudent);
    }

    public void addStudent(List<Student> newStudent, Student student) {
        System.out.println("addStudent");
        newStudent.add(student);
        newStudent.forEach(s-> System.out.println(s.displayInfo()));
        studentRepository.addStudent(newStudent);

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

    public void changeStudent(List<Student> changeStudent, String name) {
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        Student student=null;
        for (Student n : changeStudent) {
            if (name.equals(n.getName())) {
                index = changeStudent.indexOf(n);
                System.out.println("Введите данные :\n Имя ");
                String name_t = scanner.nextLine();
                System.out.println("Фамилия: ");
                String family_t = scanner.nextLine();
                System.out.println("пол (м/ж): ");
                String gender = scanner.nextLine();
                System.out.println("Возраст: ");
                int age_t = scanner.nextInt();
                scanner.nextLine();//(It consumes the \n character)
                student = new Student(name_t, family_t, age_t, gender, dataAddress());
            }
        }

        System.out.println("changeStudent");
        changeStudent.set(index,student);
        studentRepository.changeStudent(changeStudent);
        changeStudent.forEach(student1 -> System.out.println(student1.displayInfo()) );


    }
}
