package com.tcps.self.tij.concurrency.exercises;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/**
 * @program: self
 * @description:
 * @author: ZhangZhentao
 * @create: 2018-10-19
 **/
public class TestDD implements Callable {
    public int a;

    public static void main(String[] args) throws Exception {
        TestDD tt =new TestDD();
        FutureTask futureTask = new FutureTask(tt);
        futureTask.run();
        int b = (int) futureTask.get();
        System.out.println(b);
    }

    @Override
    public Object call() throws Exception {
        a = 5;
        return 5;
    }
}
