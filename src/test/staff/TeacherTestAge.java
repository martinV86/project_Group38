package test.staff;

import com.belhard.lesson10.model.Address;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.belhard.lesson10.model.staff.Teacher;

import static org.junit.Assert.*;

public class TeacherTestAge {
    Teacher teacher1;
    //инициализация
    @Before
    public void setUp() throws Exception {
        teacher1=new Teacher("Иван","Иванов",15,"м", new Address("Минск","Нововиленская",24,24));
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("тест закончен");
    }

    @Test
    public void getAge() {
        int age =40;

        teacher1.setAge(age);

        assertTrue(teacher1.getAge()==age);

    }
    @Test
    public void getAgeZero() {
        int age =-40;

        teacher1.setAge(-40);

        assertTrue(teacher1.getAge()==age);

    }
}