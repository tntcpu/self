package com.tcps.self.tij.concurrency.examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: self
 * @description: NaiveExceptionHandling
 * @author: ZhangZhentao
 * @create: 2018-10-23
 **/
public class NaiveExceptionHandling {
    public static void main(String[] args) {
        try {
            ExecutorService exec = Executors.newCachedThreadPool();
            exec.execute(new ExceptionThread());
        } catch (Exception e) {
            System.out.println("dsadfadsfasdfa;lkjsfd");
        }
    }
}
