package com.tcps.self.core.Object.constructor;

import java.util.Random;

/**
 * @author ZhangZhentao
 * @project self
 * @create 2018/01/17 15:43
 **/
public class ConstructorTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("zzt", 200000);
        staff[1] = new Employee(10000);
        staff[2] = new Employee();

        for (Employee e : staff) {
            System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary=" + e.getSalary());
        }

    }
}

class Employee {
    private static int nextId;

    private int id;
    private String name = "";
    private double salary;

    static {
        Random random = new Random();
        nextId = random.nextInt(10000);
    }

    {
        id = nextId;
        nextId++;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(double salary) {
        this("Employee #", salary);
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}