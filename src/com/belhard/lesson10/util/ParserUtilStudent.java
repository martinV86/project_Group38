package com.belhard.lesson10.util;


import com.belhard.lesson10.model.Address;
import com.belhard.lesson10.model.Student;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParserUtilStudent {
    public static List<Student> parserStudent(String faile) {
        FileReader fileReader = null;
       ArrayList<Student>students=new ArrayList<>();
        try {
            fileReader = new FileReader(faile);
            int a;
            String num = "";
            while ((a = fileReader.read()) != -1) {
                num += (char)a;
            }
            String[] masString = num.split("\n");
            for (String n : masString) {
                String[] masValue = n.split(" ");
                Address address=new Address(masValue[4],masValue[5],Integer.valueOf(masValue[6]),Integer.valueOf(masValue[7]));
                Student student=new Student(masValue[0],masValue[1],Integer.valueOf(masValue[2]),masValue[3], address);
                students.add(student);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return students;

    }
}
