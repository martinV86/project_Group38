package com.belhard.lesson10;

import com.belhard.lesson10.model.Address;
import com.belhard.lesson10.model.Group;
import com.belhard.lesson10.model.Student;
import com.belhard.lesson10.model.staff.Methodist;
import com.belhard.lesson10.model.staff.Teacher;
import com.belhard.lesson10.repository.GroupRepository;
import com.belhard.lesson10.repository.MethodistRepository;
import com.belhard.lesson10.repository.StudentRepository;
import com.belhard.lesson10.repository.TeacherRepository;
import com.belhard.lesson10.service.GroupService;
import com.belhard.lesson10.service.MethodistService;
import com.belhard.lesson10.service.StudentService;
import com.belhard.lesson10.service.TeacherService;
import com.belhard.lesson10.util.*;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        ParserUtilGroup parserUtilGroup=new ParserUtilGroup();
       HashMap<String,Integer>hashMapGroup=parserUtilGroup.parserGroup("Group.txt");
//       for (Map.Entry<String,String>map:hashMapGroup.entrySet()){
//        System.out.println(map.getKey());
//       }
//        System.out.println(hashMapGroup.get("выпуск3"));
        ParserUtilStudent parserUtilStudent=new ParserUtilStudent();
        List<String> studentDate=parserUtilStudent.parserStudent("student.txt");
        ParserUtilTeacher parserUtilTeacher=new ParserUtilTeacher();
        List<String> teacherDate=parserUtilTeacher.parserTeacher("teacher.txt");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Teacher> teachers = new ArrayList<Teacher>();
        GroupRepository groupRepository = new GroupRepository();
        GroupService groupService = new GroupService(groupRepository);
        TeacherRepository teacherRepository = new TeacherRepository();
        TeacherService teacherService = new TeacherService(teacherRepository);
        StudentRepository studentRepository = new StudentRepository();
        StudentService studentService = new StudentService(studentRepository);
        MethodistRepository methodistRepository = new MethodistRepository();
        MethodistService methodistService = new MethodistService(methodistRepository);
        Teacher teacher1 = new Teacher("Иван", "Иванов", 35, "м", new Address("Минск", "Рокосовского", 24, 24));
        teacherService.money(teacher1,2000, 24, 24);
        Teacher teacher2 = new Teacher("Иванова", "Ивановна", 64, "ж", new Address("Минск", "Филимонова", 114, 4));
        teacherService.money(teacher2,2000, 30, 24, 24);
        Teacher teacher3 = new Teacher("Маргарита", "Петрова", 65, "ж", new Address("Минск", "Калинина", 15, 1));
        teacherService.money(teacher3,2520, 24, 24);
        Teacher teacher4 = new Teacher("Сергей", "Курильский", 25, "м", new Address("Минск", "Нововиленская", 15, 64));
        teacherService.money(teacher4,2600, 30, 24, 24);
        Student student1 = new Student("Денис", "Сухохват", 25, "м", new Address("Борисов", "Ленина", 25, 56));
        Student student2 = new Student("Ирина", "Ковалёва", 23, "ж", new Address("Минск", "Скарины", 19, 25));
        Student student3 = new Student("Юлия", "Ковалёва", 25, "ж", new Address("Минск", "Скарины", 19, 25));
        Student student4 = new Student("Егор", "Ганичев", 35, "м", new Address("Минск", "Жасминова", 10, 2));
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
        ArrayList<Group> groups = new ArrayList<>();
        Group group1 = new Group(1, 1, students1, teacher2, 2020, 2025);
        Group group2 = new Group(2, 1, students2, teacher3, 2019, 2024);
        Group group3 = new Group(3, 1, students3, teacher4, 2018, 2023);
        groups.add(group1);
        System.out.println(group1.displayInfo());
        groups.add(group2);
        System.out.println(group2.displayInfo());
        System.out.println("новая группа");
        groupService.addGroups(groups,group3);
        System.out.println("добавить студента:");
        Student newStudents = new Student("Федор", "Крипкевич", 36, "м", new Address("Минск", "Мележа", 4, 20));
        System.out.println("укажите группу");
        switch (scanner.nextInt()){
            case 1: studentService.addStudent(students1,newStudents);
                break;
            case 2: studentService.addStudent(students2,newStudents);
                break;
            case 3: studentService.addStudent(students3,newStudents);
                break;
        }
        System.out.println("удалить студента");
        System.out.println("укажите группу");
        int number=scanner.nextInt();
        switch (number){
            case 1: studentService.removeStudent(students1, "Денис");
                break;
            case 2:studentService.removeStudent(students2, "Егор");
                break;
            case 3:studentService.removeStudent(students3, "Ольга");
                break;
        }
        System.out.println("редактировать данные студента");
        System.out.println("укажите группу");
        number=scanner.nextInt();
        switch (number){
            case 1: studentService.changeStudent(students1,"Ирина");
                break;
            case 2: studentService.changeStudent(students2,"Юлия");
                break;
            case 3: studentService.changeStudent(students3,"Евгений");
                break;
        }
        System.out.println("преподавательский состав");
        Converter<Methodist, Teacher> converter = newTeacher -> new Methodist(newTeacher.getName(), newTeacher.getFamily_name(), newTeacher.getAge(), newTeacher.getGender(), teachers, 6000);
        Teacher newTeacher=new Teacher("Василий","Остроумов",50,"м",new Address("Минск","Ленина",45,1));
        teacherService.addTeacher(teachers,newTeacher);
        System.out.println("Назначить методиста");
        Methodist methodist = converter.convert(newTeacher);
        System.out.println(methodist.toString());
        teacherService.removeTeacher(teachers,newTeacher);
        System.out.println();
        System.out.println("Изменить данные преподавателя");
        teacherService.changeTeacher(teachers,"Сергей");
        System.out.println("Пркподаватели на пенсии: ");
        teacherService.sortPension(teachers);
        System.out.println();
        System.out.println("Преподаватели с зарплатой свыше 2100");
        teacherService.sortHighSalary(teachers);
        System.out.println();
        System.out.println("Группы которые выпустятся не позднее 2024");
        groupService.sortRelease(groups);
        System.out.println("Изменить группу");
        System.out.println("Укажите номер группы");
        number=scanner.nextInt();
        groupService.changeGroup(groups,number);
        System.out.println("Удалить группу");
        System.out.println("Укажите номер группы");
        number=scanner.nextInt();
        switch (number){
            case 1: groupService.removeGroups(groups,group1);
                break;
            case 2:groupService.removeGroups(groups,group2);
                break;
            case 3:groupService.removeGroups(groups,group3);
                break;
        }
    }
}
