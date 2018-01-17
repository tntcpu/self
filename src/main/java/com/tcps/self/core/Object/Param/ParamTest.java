package com.tcps.self.core.Object.Param;

/**
 * @author ZhangZhentao
 * @project self
 * @create 2018/01/17 14:31
 **/
public class ParamTest {
    public static void main(String[] args) {
        System.out.println("测试三倍值：");
        double percent = 10;
        System.out.println("之前：percent=" + percent);
        tripleValue(percent);
        System.out.println("之后：percent=" + percent);

        System.out.println("\n测试三倍薪水：");
        Employee e = new Employee("zzt", 100000);
        System.out.println("之前：salary=" + e.getSalary());
        tripleSalary(e);
        System.out.println("之后：salary=" + e.getSalary());

        System.out.println("\n测试对象交换：");
        Employee e1 = new Employee("赵钱", 90000);
        Employee e2 = new Employee("孙李", 50000);
        System.out.println("之前：e1.name=" + e1.getName());
        System.out.println("之前：e2.name=" + e2.getName());
        swap(e1, e2);
        System.out.println("之后：e1.name=" + e1.getName());
        System.out.println("之后：e2.name=" + e2.getName());
    }

    public static void tripleValue(double x) {
        x = 3 * x;
        System.out.println("方法结束后：x=" + x);
    }

    public static void tripleSalary(Employee e) {
        e.raiseSalary(200);
        System.out.println("方法结束后：salary=" + e.getSalary());
    }

    public static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;
        System.out.println("方法结束后：x = " + x.getName());
        System.out.println("方法结束后：y = " + y.getName());
    }
}

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}