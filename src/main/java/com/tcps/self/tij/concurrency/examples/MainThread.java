package com.tcps.self.tij.concurrency.examples;

/**
 * @program: self
 * @description: 并发MainThread类
 * @author: ZhangZhentao
 * @create: 2018-09-21
 **/
public class MainThread {
    public static void main(String[] args) {
        LiftOff lunch = new LiftOff();
        lunch.run();
        LiftOff lunch1 = new LiftOff();
        lunch1.run();
    }
}
