package com.udemy.selenumdesign.factory;

public class WebDeveloper implements Employee
{
    private int salary=0;

    @Override
    public int salary() {
        this.salary = 40000;
        System.out.println("Web Developer salary: "+this.salary);;
        return this.salary;
    }
}
