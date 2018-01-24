package com.tcps.self.core.Object.equals;

import java.util.Objects;

/**
 * @author ZhangZhentao
 * @project self
 * @create 2018/01/23 18:27
 **/
public class EqualsTest2 {
    public static void main(String[] args) {
        String a = "asdf";
        Integer b = 1;
        Employee employee = new Employee("Alice Adams", 75000, 1987, 12, 15);
        Manager manager = new Manager("Alice Adams", 75000, 1987, 12, 15);
        System.out.println(employee.toString());
        System.out.println(employee.hashCode());
        System.out.println(Integer.toHexString(employee.hashCode()));
        System.out.println(manager.toString());
    }
}
