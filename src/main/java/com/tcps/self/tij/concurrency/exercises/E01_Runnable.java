package com.tcps.self.tij.concurrency.exercises;

/**
 * @program: self
 * @description: 并发E01_Runnable类
 * @author: ZhangZhentao
 * @create: 2018-09-21
 **/
class Printer implements Runnable {
    private static int taskCount;
    private final int id = taskCount++;

    Printer() {
        System.out.println("Printer started,ID = " + id);
    }

    @Override
    public void run() {
        System.out.println("Stage 1..., ID = " + id);
        Thread.yield();
        System.out.println("Stage 2..., ID = " + id);
        Thread.yield();
        System.out.println("Stage 3..., ID = " + id);
        Thread.yield();
    }
}

public class E01_Runnable {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new Printer()).start();
        }
    }

}
