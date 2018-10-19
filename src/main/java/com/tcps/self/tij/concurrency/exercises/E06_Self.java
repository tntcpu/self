package com.tcps.self.tij.concurrency.exercises;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @program: self
 * @description: 并发E06_Self类
 * @author: ZhangZhentao
 * @create: 2018-09-21
 **/
class SleepTimeTest implements Runnable{
    private static int count;
    private final int id = count++;

    @Override
    public void run() {
        double rd = Math.random();
        int sleepTime = (int) (rd * 10);
        try {
            TimeUnit.MILLISECONDS.sleep(sleepTime * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("#" + id + " sleep time " + sleepTime + "s");
    }
}
public class E06_Self {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new SleepTimeTest());
        }
        exec.shutdown();
    }
}
