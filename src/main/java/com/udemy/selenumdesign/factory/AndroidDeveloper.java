package com.udemy.selenumdesign.factory;

public class AndroidDeveloper implements Employee
{
    private int salary;

    @Override
    public int salary()
    {
        this.salary = 50000;
        System.out.println("Salary for Android developer is: "+salary);
        return salary;
    }
}