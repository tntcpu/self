package com.tcps.self.tij.concurrency.examples;

import java.util.concurrent.TimeUnit;

import static com.tcps.self.util.Print.print;

/**
 * @program: self
 * @description: Daemons
 * @author: ZhangZhentao
 * @create: 2018-10-17
 **/
public class Daemons {
    public static void main(String[] args) throws InterruptedException {
        Thread d = new Thread(new Daemon());
        d.setDaemon(true);
        d.start();
        print("d.isDaemon() = " + d.isDaemon() + ",");
//        TimeUnit.MILLISECONDS.sleep(1);
    }
}

class Daemon implements Runnable {
    private Thread[] t = new Thread[10];

    @Override
    public void run() {
        for (int i = 0; i < t.length; i++) {
            t[i] = new Thread(new DaemonSpawn());
            t[i].start();
            print("DaemonSpawn " + i + " started,");
        }
//        try {
//            TimeUnit.MILLISECONDS.sleep(100);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        for (int i = 0; i < t.length; i++) {
            print("t[" + i + "].isDaemon() = " + t[i].isDaemon() + ", ");
        }
        while (true) {
            Thread.yield();
        }
    }
}

class DaemonSpawn implements Runnable {
    @Override
    public void run() {
        while (true) {
            Thread.yield();
        }
    }
}
