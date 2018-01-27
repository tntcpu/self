package com.tcps.self.core.Interface;

/**
 * @author ZhangZhentao
 * @project self
 * @create 2018/01/26 11:42
 **/
public class Employee implements Comparable<Employee> {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {

        return name;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public int compareTo(Employee employee) {
        return Double.compare(salary, employee.salary);
    }
}
