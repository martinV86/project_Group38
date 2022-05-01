package com.belhard.lesson10;

import util.LoginUtil;
import util.PasswordUtil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("введите login: ");
        StringBuilder login=new StringBuilder(scanner.nextLine());
        System.out.println("введите password: ");
        StringBuilder password=new StringBuilder(scanner.nextLine());
        System.out.println("введите confirmPassword: ");
        StringBuilder confirmPassword=new StringBuilder(scanner.nextLine());
        if(LoginUtil.checkLogin(login)&&PasswordUtil.checkPassword(password,confirmPassword)){
            System.out.println(true);}
        else {
            System.out.println(false);
        }

    }
}