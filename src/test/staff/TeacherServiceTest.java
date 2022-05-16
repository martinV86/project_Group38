package test.staff;

import com.belhard.lesson10.model.Address;
import com.belhard.lesson10.model.staff.Teacher;
import com.belhard.lesson10.repository.TeacherRepository;
import com.belhard.lesson10.service.TeacherService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TeacherServiceTest {
    Teacher teacher1;
    Teacher teacher2;
    Teacher teacher3;
    Teacher teacher4;
    Teacher newTeacher;
    TeacherRepository teacherRepository=new TeacherRepository();
    List<Teacher>teachers;
    List<Teacher>teacherList;
    @Before
    public void setUp() throws Exception {
        teacher1 = new Teacher("Иван", "Иванов", 35, "м", new Address("Минск", "Рокосовского", 24, 24));
        teacher2 = new Teacher("Иванова", "Ивановна", 64, "ж", new Address("Минск", "Филимонова", 114, 4));
        teacher3 = new Teacher("Маргарита", "Петрова", 65, "ж", new Address("Минск", "Калинина", 15, 1));
        teacher4 = new Teacher("Сергей", "Курильский", 25, "м", new Address("Минск", "Нововиленская", 15, 64));
        newTeacher = new Teacher("Василий", "Остроумов", 50, "м", new Address("Минск", "Ленина", 45, 1));
        teachers=new ArrayList<>(){{
            add(teacher1);
            add(teacher2);
            add(teacher3);

        }};
        teacherList=teachers;
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("тест закончен");

    }

    @Test
    public void removeTeacher() {
        teachers.remove(new Teacher("Иван", "Иванов", 35, "м", new Address("Минск", "Рокосовского", 24, 24)));
        teacherList.remove(teacher1);
        teacherRepository.removeTeacher(teacherList);
        assertEquals(teachers,teacherList);

    }

    @Test
    public void addTeacher() {
        teachers.add(new Teacher("Сергей", "Курильский", 25, "м", new Address("Минск", "Нововиленская", 15, 64)));
        teacherList.add(teacher4);
        teacherRepository.addTeacher(teacherList);
        assertEquals(teachers,teacherList);

    }

    @Test
    public void changeTeacher() {
        int index = 1;
        String name = "Иванова";
        teachers.set(index, newTeacher);
        for (Teacher n : teacherList) {
            if (name.equalsIgnoreCase(n.getName())) {
                index = teacherList.indexOf(n);
            }
            teacherList.set(index, newTeacher);
            teacherRepository.setTeachers(teacherList);
            assertEquals(teachers, teacherList);
        }
    }

    @Test
    public void money() {
        TeacherRepository teacherRepository = new TeacherRepository();
        TeacherService teacherService = new TeacherService(teacherRepository);
        int salary = 5000;
        int premium = 30;
        int working_days = 24;
        int days_worked = 24;
        int money = (salary / working_days) * days_worked + salary * premium / 100;
        double rez = money - money * 0.14;
        teacherService.money(teacher1, salary, premium, days_worked, days_worked);
        double real_rez = teacher1.getAccued();
        assertTrue(rez == real_rez);
    }
}