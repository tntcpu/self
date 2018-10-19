package com.tcps.self.tij.concurrency.examples;

/**
 * @program: self
 * @description: 并发MoreThreads类
 * @author: ZhangZhentao
 * @create: 2018-09-21
 **/
public class MoreBasicThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new LiftOff()).start();
        }
        System.out.println("Waiting for LiftOff");
    }
}
