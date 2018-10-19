package com.tcps.self.tij.concurrency.examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @program: self
 * @description: 并发 SleepingTask类
 * @author: ZhangZhentao
 * @create: 2018-09-21
 **/
public class SleepingTask extends LiftOff {
    @Override
    public void run() {
        while (countDown-- > 0) {
            System.out.println(status());
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                System.err.println("Interrupted");
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            exec.execute(new SleepingTask());
        }
        exec.shutdown();
    }
}
