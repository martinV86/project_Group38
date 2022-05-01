package com.belhard.lesson10;

import staff.Methodist;
import staff.Teacher;

import java.util.ArrayList;
import java.util.Scanner;


    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Teacher> teachers = new ArrayList<Teacher>();
            Converter<Methodist,Teacher>converter= teacher1->new Methodist(teacher1.getName(),teacher1.getFamily_name(),teacher1.getAge(),teachers,5000);
            System.out.println("укажите преподавателя для 1 группы");
            Teacher teacher1 = dataTeacher();
            System.out.println("Введите студентов 1 группы ");
            ArrayList<Student> students1 = dataStudent();
            System.out.println("укажите преподавателя для 2 группы");
            Teacher teacher2 = dataTeacher();
            System.out.println("Введите студентов 2 группы ");
            ArrayList<Student> students2 = dataStudent();
            System.out.println("укажите преподавателя для 3 группы");
            System.out.println("Введите студентов 3 группы ");
            ArrayList<Student> students3 = dataStudent();
            Teacher teacher3 = dataTeacher();
            teachers.add(teacher1);
            teachers.add(teacher2);
            teachers.add(teacher3);
            Group group1 = new Group(1, 1, students1, teacher1);
            group1.displayInfo();
            group1.stInfo();
            Group group2 = new Group(2, 1, students2, teacher2);
            group2.displayInfo();
            group2.stInfo();
            Group group3 = new Group(3, 1, students3, teacher3);
            group3.displayInfo();
            group3.stInfo();
            System.out.println("Укажите действие: 1 - добавть студента; 2 -отчислить студетна; 0-выйти из программы");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("укажите группу");
                    int grup = scanner.nextInt();
                    ArrayList<Student> newStudents = dataStudent();
                    switch (grup) {
                        case 1:
                            group1.newStudent(newStudents);
                            break;
                        case 2:
                            group2.newStudent(newStudents);
                            break;
                        case 3:
                            group3.newStudent(newStudents);
                            break;
                    }
                case 2:
                    System.out.println("укажите группу");
                    grup = scanner.nextInt();
                    scanner.nextLine();//(It consumes the \n character)
                    System.out.println("укажите имя студента");
                    String name = scanner.nextLine();
                    switch (grup) {
                        case 1:
                            group1.delStudent(name);
                            break;
                        case 2:
                            group2.delStudent(name);
                            break;
                        case 3:
                            group3.delStudent(name);
                            break;
                    }
                case 0:
                    break;
            }
            Methodist methodist=converter.convert(teacher1);



        }
        private static Teacher dataTeacher() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите данные :\n Имя ");
            String name_t = scanner.nextLine();
            System.out.println("Фамилия: ");
            String family_t = scanner.nextLine();
            System.out.println("Возраст: ");
            int age_t = scanner.nextInt();
            Teacher teacher = new Teacher(name_t, family_t, age_t, dataAddress());
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
                teacher.money(salary, premium, working_days, days_worked);
            } else {
                teacher.money(salary, working_days, days_worked);
            }
            return teacher;
        }
        private static ArrayList<Student> dataStudent() {
            Scanner scanner = new Scanner(System.in);
            int end;
            ArrayList<Student> students = new ArrayList<Student>();
            do {
                System.out.println("Введите данные :\n Имя ");
                String name_t = scanner.nextLine();
                System.out.println("Фамилия: ");
                String family_t = scanner.nextLine();
                System.out.println("Возраст: ");
                int age_t = scanner.nextInt();
                scanner.nextLine();//(It consumes the \n character)
                Student student = new Student(name_t, family_t, age_t, dataAddress());
                System.out.println(" Если группа заполнена введите 0");
                end = scanner.nextInt();
                scanner.nextLine();//(It consumes the \n character)
                students.add(student);
            } while (end != 0);
            return students;
        }
        private static Address dataAddress(){
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

    }
