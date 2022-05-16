package com.belhard.lesson10;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {
        FileReader fileReader=null;
        FileWriter fileWriter=null;
        try {
            fileReader=new FileReader("file.txt");
             fileWriter=new FileWriter("fileReader.txt");
            int a;
            while ((a=fileReader.read())!=-1){
                fileWriter.write(a);
                System.out.print((char) a);
            }
        }  catch (IOException e) {
            e.printStackTrace();
        }finally {

            try {
                fileReader.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static void faileByte(){
        // file
        try {

            FileInputStream fileInputStream=new FileInputStream("file.txt");
            InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream,"UTF-8");
            FileOutputStream fileOutputStream=new FileOutputStream("fileCopy.txt");
//            FileInputStream fileInputStream=new FileInputStream("file.txt", UTF_8);
            int a;
            String name="";
//            while ((a=fileInputStream.read())!=-1){
            while ((a=inputStreamReader.read())!=-1){
                fileOutputStream.write(a);
                //пока не дошло до конца файла (-1) - читай
//                System.out.print((char) a);
                name+=(char)a;
            }

            String[]massString=name.split("\n");
//                System.out.println(name);
            for (String n:massString){
                String[] nameMass=n.split(" ");
                System.out.println("имя "+nameMass[0]);
                System.out.println("фамилия "+nameMass[1]);
            }
//            System.out.println("имя "+mass[0]);
//            System.out.println("фамилия "+mass[1]);

        } catch (IOException e) {
            e.printStackTrace();
        }
// в дз создать файлы студент, учителя группы и туда перенести все данные. Создать отдельную утилиту, которая вытягивает данные (отдельные утилиты для студента, учителя, группы) на вход она
        //принемает имя файла и от туда вытягивает данные.
//парсер - преобразование в тот вид который нужен нам
    }
}
