package com.tcps.self.tij.concurrency.examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: self
 * @description: SynchronizedEvenGenerator
 * @author: ZhangZhentao
 * @create: 2018-10-24
 **/
public class SynchronizedEvenGenerator extends IntGenerator {
        public int currentEvenValue = 0;
//    private int currentEvenValue = 0;

    @Override
    public synchronized int next() {
        ++currentEvenValue;
        ++currentEvenValue;
        return currentEvenValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new EvenGenerator());
    }
}
