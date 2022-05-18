package com.belhard.lesson10.util;

import com.belhard.lesson10.model.Group;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ParserUtilGroup {
    public static HashMap<String, Integer> parserGroup(String faile) {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        String k = "";
        int v = 0;
        String vStr = "";
        List<String> dateGroup = new ArrayList<>();
        HashMap<String, Integer> hashMapGroup = new HashMap<String, Integer>();
        try {
            fileReader = new FileReader(faile);
            int a;
            String num = "";
            while ((a = fileReader.read()) != -1) {
                num += (char) a;
            }
            String[] masString = num.split("\n");
            for (String n : masString) {
                String[] masValueString = n.split(" ");
                for (String f : masValueString) {
                    dateGroup.add(f);
                }
            }
            for (String n : dateGroup) {
                if (n.matches("^[0-9]*$") == false) {
                    k = n;
                } else {
                    vStr = n;
                    v = Integer.valueOf(vStr);
                }

                hashMapGroup.put(k, v);
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
        return hashMapGroup;
    }
}
