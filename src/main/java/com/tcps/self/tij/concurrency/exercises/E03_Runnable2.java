package com.tcps.self.tij.concurrency.exercises;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: self
 * @description: 并发E03_Runnable类
 * @author: ZhangZhentao
 * @create: 2018-09-21
 **/
public class E03_Runnable2 {
    public static void main(String[] args) {
        ExecutorService exec;
        exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new Printer());
        }
        Thread.yield();
        exec.shutdown();
        exec = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            exec.execute(new Printer());
        }
        Thread.yield();
        exec.shutdown();
        exec = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            exec.execute(new Printer());
        }
        Thread.yield();
        exec.shutdown();
    }
}
