package com.tcps.self.tij.concurrency.exercises;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: self
 * @description: 并发E04_Fibonacci2类
 * @author: ZhangZhentao
 * @create: 2018-09-21
 **/
public class E04_Fibonacci2 {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 1; i <= 5; i++) {
            exec.execute(new Fibonacci(i));
        }
        Thread.yield();
        exec.shutdown();
        exec = Executors.newFixedThreadPool(5);
        for (int i = 1; i <= 5; i++) {
            exec.execute(new Fibonacci(i));
        }
        Thread.yield();
        exec.shutdown();
        exec = Executors.newSingleThreadExecutor();
        for (int i = 1; i <= 5; i++) {
            exec.execute(new Fibonacci(i));
        }
        Thread.yield();
        exec.shutdown();

    }
}
