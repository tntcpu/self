package com.tcps.self.tij.concurrency.examples;

/**
 * @program: self
 * @description: 并发BasicThread类
 * @author: ZhangZhentao
 * @create: 2018-09-21
 **/
public class BasicThread {
    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Wating for LiftOff");
    }
}
