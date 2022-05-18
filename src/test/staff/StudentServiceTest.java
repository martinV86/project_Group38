package test.staff;

import com.belhard.lesson10.model.Address;
import com.belhard.lesson10.model.Student;
import com.belhard.lesson10.repository.StudentRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StudentServiceTest {
    List<Student> students;
    Student student1;
    Student student2;
    Student student3;
    Student student4;
    Student student5;
    Student student6;
    Student student7;
    Student newStudents;
    StudentRepository studentRepository = new StudentRepository();
    List<Student> studentList;

    @Before
    public void setUp() throws Exception {
        student1 = new Student("Денис", "Сухохват", 25, "м", new Address("Борисов", "Ленина", 25, 56));
        student2 = new Student("Ирина", "Ковалёва", 23, "ж", new Address("Минск", "Скарины", 19, 25));
        student3 = new Student("Юлия", "Ковалёва", 25, "ж", new Address("Минск", "Скарины", 19, 25));
        student4 = new Student("Егор", "Ганичев", 35, "м", new Address("Минск", "Жасминова", 10, 2));
        student5 = new Student("Евгений", "Соловьёв", 30, "м", new Address("Орша", "Героев", 5, 6));
        student6 = new Student("Ольга", "Качаловская", 28, "ж", new Address("Борисов", "Кижеватова", 16, 27));
        student7 = new Student("Григорий", "Желунович", 36, "м", new Address("Минск", "Белинского", 48, 20));
        newStudents = new Student("Федор", "Крипкевич", 36, "м", new Address("Минск", "Мележа", 4, 20));
        students = new ArrayList<>() {{
            add(student1);
            add(student2);
            add(student3);
            add(student4);
            add(student5);
            add(student6);
            add(student7);
        }};
        studentList = students;
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("тест закончен");

    }

    @Test
    public void removeStudent() {
        int size=6;;
        String name = "Денис";
        for (Student n : studentList) {
            if (name.equalsIgnoreCase(n.getName())) {
                studentList.remove(n);
            }
        }
        studentRepository.removeStudent(studentList);
        assertTrue(size==studentList.size());
    }

    @Test
    public void addStudent() {
        int size=8;
        studentList.add(newStudents);
        studentRepository.addStudent(studentList);
        assertTrue(size==studentList.size());
    }

    @Test
    public void changeStudent() {
        int index = 1;
        String name = "Ирина";
        students.set(1, new Student("Федор", "Крипкевич", 36, "м", new Address("Минск", "Мележа", 4, 20)));
        for (Student n : studentList) {
            if (name.equals(n.getName())) {
                index = studentList.indexOf(n);
            }
        }
        studentList.set(index,newStudents);
        studentRepository.changeStudent(studentList);
        assertEquals(students,studentList);
    }
}