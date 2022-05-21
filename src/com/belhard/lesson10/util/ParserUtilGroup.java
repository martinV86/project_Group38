package com.belhard.lesson10.util;

import com.belhard.lesson10.model.Group;
import com.belhard.lesson10.model.Student;
import com.belhard.lesson10.model.staff.Teacher;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ParserUtilGroup {
    public static List<Group> parserGroup(String faile,List<Student>students,List<Teacher>teachers) {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        ArrayList<Group>groups=new ArrayList<>();
        List<Group>groupsName=new ArrayList<>();
        int i=0;
        ArrayList<Student> students1 = new ArrayList<>() {{
            add(students.get(0));
            add(students.get(1));
        }};
        ArrayList<Student> students2 = new ArrayList<>() {{
            add(students.get(2));
            add(students.get(3));
        }};
        ArrayList<Student> students3 = new ArrayList<>() {{
            add(students.get(4));
            add(students.get(5));
            add(students.get(6));
        }};
        try {
            fileReader = new FileReader(faile);
            int a;
            String num = "";
            while ((a = fileReader.read()) != -1) {
                num += (char) a;
            }
            String[] masString = num.split("\r\n");
            for (String n : masString) {
                ArrayList<Student>studentArrayList=students1;
                String[] masValueString = n.split(" ");
                Group group=new Group(Integer.valueOf(masValueString[0]),Integer.valueOf(masValueString[1]),Integer.valueOf(masValueString[2]),Integer.valueOf(masValueString[3]));
                groupsName.add(group);
            }
            Group group1=new Group(groupsName.get(0).getGroup_name(),groupsName.get(0).getCourse(),students1,teachers.get(0),groupsName.get(0).getYear_of_admission(),groupsName.get(0).getYear_of_issue());
            Group group2=new Group(groupsName.get(1).getGroup_name(),groupsName.get(1).getCourse(),students2,teachers.get(1),groupsName.get(1).getYear_of_admission(),groupsName.get(1).getYear_of_issue());
            Group group3=new Group(groupsName.get(2).getGroup_name(),groupsName.get(2).getCourse(),students3,teachers.get(2),groupsName.get(2).getYear_of_admission(),groupsName.get(2).getYear_of_issue());

               groups.add(group1);
               groups.add(group2);
               groups.add(group3);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return groups;
    }
}
