package com.belhard.lesson10.util;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParserUtilTeacher {
    public static List<String> parserTeacher(String faile) {
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
                for (String f : masValue) {
                    dateTeacher.add(f);
                }
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
        return dateTeacher;
    }
}
