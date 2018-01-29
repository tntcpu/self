package com.tcps.self.aaa;

import com.tcps.self.core.Interface.comparator.Employee;

/**
 * @author ZhangZhentao
 * @project self
 * @create 2018-01-13 12:28
 **/
public class MyTest {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";
        System.out.println(b.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a.hashCode());
        System.out.println(a.hashCode());
        a = "cde";
        System.out.println(a.hashCode());

    }
}
