package test.staff;


import com.belhard.lesson10.model.Address;
import com.belhard.lesson10.model.staff.Teacher;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PeopleTestAge {
    Teacher teacher1;
    @Before
    public void setUp() throws Exception {
        teacher1=new Teacher("Иван","Иванов",40,"м", new Address("Минск","Нововиленская",24,24));

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
        int age =0;

        teacher1.setAge(age);

        assertTrue(teacher1.getAge()==age);

    }
}