package com.tcps.self.core.Interface.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.*;

/**
 * @author ZhangZhentao
 * @project self
 * @create 2018/01/26 13:05
 **/
public class EmployeeSortTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        ArrayList<String> a = new ArrayList<>();
        staff[0] = new Employee("a", 100000);
        staff[1] = new Employee("b", 10000);
        staff[2] = new Employee("c", 1000);

        Arrays.sort(staff);

        for (Employee e : staff) {
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
        }
    }
}
