package com.udemy.selenumdesign.factory;

public class EmployeeFactory
{
    public static Employee getInstance(String employeeType)
    {
        switch (employeeType)
        {
            case "ANDROID":
                return new AndroidDeveloper();
            case "WEB":
                return new WebDeveloper();
            default:
                return new WebDeveloper();
        }
    }
}