package com.yzhao.composite1;

import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;
    private String title;
    private List<Employee> subordinates;

    public Employee(String name,String title) {
        this.name = name;
        this.title = title;
        subordinates = new ArrayList<Employee>();
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates(){
        return subordinates;
    }

    public String toString(){
        return "Employee :[ Name : "+ name
                +", dept : "+ title +subordinates +" ]";
    }
}

public class Main {
    public static void main(String[] args) {
        Employee CEO = new Employee("John","CEO");

        Employee headSales = new Employee("Rob","Sales");

        Employee headMarketing = new Employee("Mike","Marketing");

        Employee programmer1 = new Employee("Lili","Programmer");
        Employee programmer2 = new Employee("Bob","Programmer");

        Employee tester1 = new Employee("Jack","Tester");
        Employee tester2 = new Employee("Tom","Tester");

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(tester1);
        headSales.add(tester2);

        headMarketing.add(programmer1);
        headMarketing.add(programmer2);

        //print all employees of the organization
        System.out.println(CEO);
        for (Employee headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);
            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }
}
