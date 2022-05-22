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
        ParserUtilStudent parserUtilStudent=new ParserUtilStudent();
        List<Student> studentDate=parserUtilStudent.parserStudent("student.txt");
        ParserUtilTeacher parserUtilTeacher=new ParserUtilTeacher();
        List<Teacher> teacherDate=parserUtilTeacher.parserTeacher("teacher.txt");
        ParserUtilGroup parserUtilGroup=new ParserUtilGroup();
        List<Group>groupDate=parserUtilGroup.parserGroup("Group.txt",studentDate,teacherDate);
        Scanner scanner = new Scanner(System.in);
        GroupRepository groupRepository = new GroupRepository();
        GroupService groupService = new GroupService(groupRepository);
        TeacherRepository teacherRepository = new TeacherRepository();
        teacherRepository.setTeachers(teacherDate);
        TeacherService teacherService = new TeacherService(teacherRepository);
        StudentRepository studentRepository = new StudentRepository();
        StudentService studentService = new StudentService(studentRepository);
        MethodistRepository methodistRepository = new MethodistRepository();
        MethodistService methodistService = new MethodistService(methodistRepository);
        Teacher teacher1 = teacherDate.get(0);
        teacherService.money(teacher1,2000, 24, 24);
        Teacher teacher2 = teacherDate.get(1);
        teacherService.money(teacher2,2000, 30, 24, 24);
        Teacher teacher3 = teacherDate.get(2);
        teacherService.money(teacher3,2520, 24, 24);
        Teacher teacher4 = teacherDate.get(3);
        teacherService.money(teacher4,2600, 30, 24, 24);
        ArrayList<Teacher>teachers=new ArrayList<>(){{
            add(teacher1);
            add(teacher2);
            add(teacher3);
            add(teacher4);
        }};
        ArrayList<Group> groups = new ArrayList<>(){{
            add(groupDate.get(0));
            add(groupDate.get(1));
        }};
        groupService.String(groups);
        System.out.println("новая группа");
        groupService.addGroups(groups,groupDate.get(2));
        System.out.println("добавить студента:");
        Student newStudents = studentDate.get(7);
        System.out.println("укажите группу");
        switch (scanner.nextInt()){
            case 1: studentService.addStudent(groupDate.get(0).getStudents(),newStudents);
                break;
            case 2: studentService.addStudent(groupDate.get(1).getStudents(),newStudents);
                break;
            case 3: studentService.addStudent(groupDate.get(2).getStudents(),newStudents);
                break;
        }
        System.out.println("удалить студента");
        System.out.println("укажите группу");
        int number=scanner.nextInt();
        switch (number){
            case 1: studentService.removeStudent(groupDate.get(0).getStudents(), groupDate.get(0).getStudents().get(1));
                break;
            case 2:studentService.removeStudent(groupDate.get(1).getStudents(), groupDate.get(1).getStudents().get(1));
                break;
            case 3:studentService.removeStudent(groupDate.get(2).getStudents(), groupDate.get(1).getStudents().get(1));
                break;
        }
        System.out.println("редактировать данные студента");
        System.out.println("укажите группу");
        number=scanner.nextInt();
        switch (number){
            case 1: studentService.changeStudent(groupDate.get(0).getStudents(),"Ирина");
                break;
            case 2: studentService.changeStudent(groupDate.get(1).getStudents(),"Юлия");
                break;
            case 3: studentService.changeStudent(groupDate.get(2).getStudents(),"Евгений");
                break;
        }
        System.out.println("преподавательский состав");
        Converter<Methodist, Teacher> converter = newTeacher -> new Methodist(newTeacher.getName(), newTeacher.getFamily_name(), newTeacher.getAge(), newTeacher.getGender(), teachers, 6000);
        Teacher newTeacher=teacherDate.get(4);
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
            case 1: groupService.removeGroups(groups,groupDate.get(0));
                break;
            case 2:groupService.removeGroups(groups,groupDate.get(1));
                break;
            case 3:groupService.removeGroups(groups,groupDate.get(2));
                break;
        }
    }
}
