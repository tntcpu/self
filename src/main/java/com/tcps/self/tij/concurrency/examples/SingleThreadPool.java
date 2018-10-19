package com.tcps.self.tij.concurrency.examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: self
 * @description: 并发SingleThreadPool类
 * @author: ZhangZhentao
 * @create: 2018-09-21
 **/
public class SingleThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }
}
