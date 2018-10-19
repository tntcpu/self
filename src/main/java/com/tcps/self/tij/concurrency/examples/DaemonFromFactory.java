package com.tcps.self.tij.concurrency.examples;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @program: self
 * @description: DaemonFromFactory
 * @author: ZhangZhentao
 * @create: 2018-10-15
 **/
public class DaemonFromFactory implements Runnable {
    @Override
    public void run() {
        try {
            TimeUnit.MILLISECONDS.sleep(100);
            System.out.println(Thread.currentThread() + "------" +this);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool(new DaemonThreadFactory());
        for (int i = 0; i < 1000; i++) {
            exec.execute(new DaemonFromFactory());
        }
        System.out.println("All daemons started");
        TimeUnit.MILLISECONDS.sleep(50);
    }
}
