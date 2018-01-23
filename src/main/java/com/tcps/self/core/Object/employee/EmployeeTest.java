package com.tcps.self.core.Object.employee;

import java.time.LocalDate;

/**
 * @author ZhangZhentao
 * @project self
 * @create 2018/01/16 17:22
 **/
public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("张三", 100000, 2018, 6, 20);
        staff[1] = new Employee("赵四", 80000, 2009, 10, 1);
        staff[2] = new Employee("王五", 60000, 1990, 10, 2);

        for (Employee employee : staff) {
            employee.raiseSalary(5);
            System.out.println(employee.getName()+"---薪水："+employee.getSalary()+"入职日期："+employee.getHireDay());
        }
    }
}

class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("孙六", 10000, 2013, 6, 20);
        System.out.println(employee.getName()+"---"+employee.getSalary()+"---"+employee.getHireDay());
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
