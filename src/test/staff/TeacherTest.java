package test.staff;


import com.belhard.lesson10.model.Address;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.belhard.lesson10.model.staff.Teacher;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TeacherTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void money() {
        Teacher teacher1=new Teacher("Иван","Иванов",35,"м", new Address("Минск","Нововиленская",24,24));
        int salary=5000;
        int premium=30;
        int working_days=24;
        int days_worked=24;
        int money = (salary / working_days) * days_worked + salary * premium / 100;
        double rez = money - money * 0.14;
       double real_rez= teacher1.money(salary,premium,days_worked,days_worked);
        //уловие с которым будем сравнивать
        assertTrue(rez == real_rez);
        //assertEquals(rezal,rez);- для сравнения сложных объектов
        //assertTrue ();- для сравнения простых типов
    }
}