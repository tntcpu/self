package com.tcps.self.tij.concurrency.exercises;

import java.util.concurrent.Callable;

/**
 * @program: self
 * @description: 并发E05_Fibonacci3类
 * @author: ZhangZhentao
 * @create: 2018-09-21
 **/
public class E05_Fibonacci3 {
    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) {

        }
    }
}

class Fibonacci2 implements Callable<String> {
    private int count;
    private final int n;

    public Fibonacci2(int n) {
        this.n = n;
    }

    public Integer next() {
        return fib(count++);
    }

    private Integer fib(int n) {
        if (n < 2) {
            return 1;
        } else {
            return fib(n - 2) + fib(n - 1);
        }
    }

    @Override
    public String call() {
        return null;
    }
}
