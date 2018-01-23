package com.tcps.self.core.Object.abstractTest;

/**
 * @author ZhangZhentao
 * @project self
 * @create 2018/01/18 15:51
 **/
public class Student extends Person {
    private String major;

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    @Override
    public String getDescription() {
        return "a student major in " + major;
    }
}
