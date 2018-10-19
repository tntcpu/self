package com.tcps.self.tij.concurrency.examples;

import static com.tcps.self.util.Print.*;

import java.util.concurrent.TimeUnit;

/**
 * @program: self
 * @description: DaemonsDontRunFinally
 * @author: ZhangZhentao
 * @create: 2018-10-17
 **/
class ADaemon implements Runnable {
    @Override
    public void run() {
        try {
            print("Starting ADaemon");
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            print("Exiting via InterruptedException");
        } finally {
            print("This should always run?");
        }
    }
}

public class DaemonsDontRunFinally {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new ADaemon());
        t.setDaemon(true);
        t.start();
        TimeUnit.SECONDS.sleep(1);
    }
}
