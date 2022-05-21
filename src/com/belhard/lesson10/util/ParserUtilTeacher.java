package com.belhard.lesson10.util;

import com.belhard.lesson10.model.Address;
import com.belhard.lesson10.model.staff.Teacher;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParserUtilTeacher {
    public static List<Teacher> parserTeacher(String faile) {
        ArrayList<Teacher>teachers=new ArrayList<>();
        FileReader fileReader = null;
        List<String> dateTeacher = new ArrayList<>();
        try {
            fileReader = new FileReader(faile);
            int a;
            String name = "";
            while ((a = fileReader.read()) != -1) {
                name += (char) a;
            }
            String[] masString = name.split("\n");
            for (String n : masString) {
                String[] masValue = n.split(" ");
                Address address=new Address(masValue[4],masValue[5],Integer.valueOf(masValue[6]), Integer.valueOf(masValue[7]));
                Teacher teacher=new Teacher(masValue[0],masValue[1],Integer.valueOf(masValue[2]),masValue[3],address);
                teachers.add(teacher);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return teachers;
    }
}
