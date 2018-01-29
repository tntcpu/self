package com.tcps.self.core.Interface.clone;

/**
 * @author ZhangZhentao
 * @project self
 * @create 2018/01/27 15:35
 **/
public class CloneTest {
    public static void main(String[] args) {
        Employee original = new Employee("zzt", 500000);
        original.setHireDay(2011, 5, 1);
        try {
            Employee cloned = original.clone();
            System.out.println(cloned);
            cloned.raiseSalary(100);
            cloned.setHireDay(2001, 5, 1);
            System.out.println("original:" + original);
            System.out.println("cloned:" + cloned);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
