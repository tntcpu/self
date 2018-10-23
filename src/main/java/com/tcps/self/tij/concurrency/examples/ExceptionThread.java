package com.tcps.self.tij.concurrency.examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: self
 * @description: ExceptionThread
 * @author: ZhangZhentao
 * @create: 2018-10-22
 **/
public class ExceptionThread implements Runnable {

    @Override
    public void run() {
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new ExceptionThread());
    }
}
