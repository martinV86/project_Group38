package com.belhard.lesson10;

import com.belhard.lesson10.model.Address;
import com.belhard.lesson10.model.Group;
import com.belhard.lesson10.model.Student;
import com.belhard.lesson10.model.staff.Methodist;
import com.belhard.lesson10.model.staff.Teacher;
import com.belhard.lesson10.repository.GroupRepository;
import com.belhard.lesson10.service.GroupService;
import com.belhard.lesson10.util.Converter;
import com.belhard.lesson10.util.GroupComparator;
import com.belhard.lesson10.util.MaxAccuedComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Teacher> teachers = new ArrayList<Teacher>();
        GroupRepository groupRepository=new GroupRepository();
        GroupService groupService=new GroupService(groupRepository);
        Converter<Methodist, Teacher> converter = teacher1 -> new Methodist(teacher1.getName(), teacher1.getFamily_name(), teacher1.getAge(), teacher1.getGender(), teachers, 5000);
        // если не требуется консольнный ввод данных
        Teacher teacher1 = new Teacher("Иван", "Иванов", 35, "м", new Address("Минск", "Рокосовского", 24, 24));
        teacher1.money(2000, 24, 24);
        Teacher teacher2 = new Teacher("Иванова", "Ивановна", 64, "ж", new Address("Минск", "Филимонова", 114, 4));
        teacher2.money(2000, 30, 24, 24);
        Teacher teacher3 = new Teacher("Маргарита", "Петрова", 65, "ж", new Address("Минск", "Калинина", 15, 1));
        teacher3.money(2520, 24, 24);
        Teacher teacher4 = new Teacher("Сергей", "Курильский", 25, "м", new Address("Минск", "Нововиленская", 15, 64));
        teacher4.money(2600, 30, 24, 24);
        Student student1 = new Student("Денис", "Сухохват", 25, "м", new Address("Борисов", "Ленина", 25, 56));
        Student student2 = new Student("Ирина", "Ковалёва", 23, "ж", new Address("Минск", "Скарины", 19, 25));
        Student student3 = new Student("Юлия", "Ковалёва", 25, "ж", new Address("Минск", "Скарины", 19, 25));
        Student student4 = new Student("Виктор", "Ганичев", 35, "м", new Address("Минск", "Жасминова", 10, 2));
        Student student5 = new Student("Евгений", "Соловьёв", 30, "м", new Address("Орша", "Героев", 5, 6));
        Student student6 = new Student("Ольга", "Качаловская", 28, "ж", new Address("Борисов", "Кижеватова", 16, 27));
        Student student7 = new Student("Григорий", "Желунович", 36, "м", new Address("Минск", "Белинского", 48, 20));
        ArrayList<Student> students1 = new ArrayList<>() {{
            add(student1);
            add(student2);
        }};
        ArrayList<Student> students2 = new ArrayList<>() {{
            add(student3);
            add(student4);
        }};
        ArrayList<Student> students3 = new ArrayList<>() {{
            add(student5);
            add(student6);
            add(student7);
        }};
        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);
        teachers.add(teacher4);
//         Если требуется консольный ввод данных
//         System.out.println("укажите преподавателя для 1 группы");
//         Teacher teacher1 = dataTeacher();
//        System.out.println("Введите студентов 1 группы ");
//        ArrayList<Student> students1 = dataStudent();
//        System.out.println("укажите преподавателя для 2 группы");
//        Teacher teacher2 = dataTeacher();
//        System.out.println("Введите студентов 2 группы ");
//        ArrayList<Student> students2 = dataStudent();
//        System.out.println("укажите преподавателя для 3 группы");
//        Teacher teacher3 = dataTeacher();
//        scanner.nextLine();//(It consumes the \n character)
//        System.out.println("Введите студентов 3 группы ");
//        ArrayList<Student> students3 = dataStudent();
//        teachers.add(teacher1);
//        teachers.add(teacher2);
//        teachers.add(teacher3);

        ArrayList<Group> group = new ArrayList<>();
        Group group1 = new Group(1, 1, students1, teacher2, 2020, 2025);
        System.out.println(group1.displayInfo());
        group1.stInfo();
        Group group2 = new Group(2, 1, students2, teacher3, 2019, 2024);
        System.out.println(group2.displayInfo());
        group2.stInfo();
        Group group3 = new Group(3, 1, students3, teacher4, 2018, 2023);
        System.out.println(group3.displayInfo());
        group3.stInfo();
        group.add(group1);
        group.add(group2);
        group.add(group3);
        groupService.addGroups(group);
        System.out.println("Укажите действие: 1 - добавть студента; 2 -отчислить студетна; 0-выйти из программы");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("укажите группу");
                int grup = scanner.nextInt();
                //если требуется консольный ввод данных
//                ArrayList<Student> newStudents = dataStudent();
                Student newStudents = new Student("Федор", "Крипкевич", 36, "м", new Address("Минск", "Мележа", 4, 20));

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
                break;
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
        Comparator maniComparator = new MaxAccuedComparator();
        Comparator groupComparator = new GroupComparator();
        System.out.println("\n преподавательский состав:");
        Methodist methodist = converter.convert(teacher1);
        System.out.println(methodist.toString());
        teachers.stream()
                .sorted(maniComparator)
                .forEach(System.out::println);
        System.out.println();
        System.out.println("Пркподаватели на пенсии: ");
        teachers.stream()
                .filter(s -> s.getAge() > 60 && s.getGender().equalsIgnoreCase("ж") || s.getAge() > 65 && s.getGender().equalsIgnoreCase("ж"))
                .sorted(maniComparator)
                .forEach(s -> System.out.println(s));
        System.out.println();
        System.out.println("Преподаватели с зарплатой свыше 2100");
        teachers.stream()
                .filter(s -> s.getAccued() > 2100)
                .sorted(maniComparator)
                .forEach(s -> System.out.println(s));
        System.out.println();
        System.out.println("Группы которые выпустятся не позднее 2024");
        group.stream()
                .filter(s -> s.getYear_of_issue() <= 2024)
                .sorted(groupComparator)
                .forEach(s -> System.out.println(((Group) s).displayInfo()));


    }

    //для консольного воода данных
    private static Teacher dataTeacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные :\n Имя ");
        String name_t = scanner.nextLine();
        System.out.println("Фамилия: ");
        String family_t = scanner.nextLine();
        System.out.println("пол (м/ж): ");
        String gender = scanner.nextLine();
        System.out.println("Возраст: ");
        int age_t = scanner.nextInt();
        Teacher teacher = new Teacher(name_t, family_t, age_t, gender, dataAddress());
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
            System.out.println("пол (м/ж): ");
            String gender = scanner.nextLine();
            System.out.println("Возраст: ");
            int age_t = scanner.nextInt();
            scanner.nextLine();//(It consumes the \n character)
            Student student = new Student(name_t, family_t, age_t, gender, dataAddress());
            System.out.println(" Если группа заполнена введите 0");
            end = scanner.nextInt();
            scanner.nextLine();//(It consumes the \n character)
            students.add(student);
        } while (end != 0);
        return students;
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

}
