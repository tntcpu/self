package com.tcps.self.tij.concurrency.examples;

/**
 * @program: self
 * @description: 并发LiftOff类
 * @author: ZhangZhentao
 * @create: 2018-09-21
 **/
public class LiftOff implements Runnable {
    public int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;

    public LiftOff() {
    }

    public LiftOff(int countDown) {
        this.countDown = countDown;
    }

    public String status() {
        return "#" + id + "(" + (countDown > 0 ? countDown : "LiftOff!") + ")";
    }

    @Override
    public void run() {
        while (countDown-- > 0) {
            System.out.println(status());
            Thread.yield();
        }

    }
}
