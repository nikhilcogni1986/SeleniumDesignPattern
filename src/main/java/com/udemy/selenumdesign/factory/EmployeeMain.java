package com.udemy.selenumdesign.factory;

import java.util.Scanner;

public class EmployeeMain
{
    public static void main(String[] args) {

        System.out.println("Enter the language (ANDROID/WEB) to know the salary");
        Scanner sc1 = new Scanner(System.in);
        String language = sc1.next();
        Employee EP1 = EmployeeFactory.getInstance(language);
        EP1.salary();
    }
}
