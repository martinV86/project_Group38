package com.belhard.lesson10.util;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParserUtilStudent {
    public static List<String> parserStudent(String faile) {
        FileReader fileReader = null;
        List<String> dateStudent = new ArrayList<>();
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
                for (String f : masValue) {
                    dateStudent.add(f);
                }
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
        return dateStudent;
    }
}
