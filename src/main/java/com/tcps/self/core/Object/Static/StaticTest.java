package com.tcps.self.core.Object.Static;

import com.tcps.self.core.Object.Employee.EmployeeTest;

import java.time.LocalDate;

/**
 * @author ZhangZhentao
 * @project self
 * @create 2018/01/17 13:31
 **/
public class StaticTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("张三", 100000);
        staff[1] = new Employee("李四", 80000);


        swap(staff[0], staff[1]);

        System.out.println(staff[0].getName());
    }

    private static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;
        System.out.println(x.getName());
    }
}

class Employee {
    private static int nextId = 1;

    private String name;
    private double salary;
    private int id;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        id = 0;
    }

    public static int getNextId() {
        return nextId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = nextId;
        nextId++;
    }

    public static void main(String[] args) {
        Employee e = new Employee("zzt", 100000);
        System.out.println(e.getName() + " " + e.getSalary());
    }
}
