package com.tcps.self.tij.concurrency.exercises;

import com.tcps.self.tij.concurrency.examples.LiftOff;

import java.util.concurrent.TimeUnit;

/**
 * @program: self
 * @description: E08_MoreBasicDaemonThreads
 * @author: ZhangZhentao
 * @create: 2018-10-17
 **/
public class E08_MoreBasicDaemonThreads {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(new LiftOff());
//            t.setDaemon(true);
            t.start();
        }
//        TimeUnit.SECONDS.sleep(1);
//        System.out.println("Waiting for liftOff!");
    }
}
