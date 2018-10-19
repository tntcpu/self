package com.tcps.self.tij.concurrency.exercises;


import java.util.Arrays;

/**
 * @program: self
 * @description: 并发练习-生成斐波那契数列
 * @author: ZhangZhentao
 * @create: 2018-09-20
 **/
public class E02_Fibonacci {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for (int i = 1; i < 45; i++) {
            new Fibonacci(i).run();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("single thread: " + (endTime - startTime) / 1000.0 + "s");
        for (int i = 0; i < 45; i++) {
            new Thread(new Fibonacci(i)).start();
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("multi thread: " + (endTime2 - endTime) + "ms");
    }
}

class Fibonacci implements Runnable {
    private int count;
    private final int n;

    public Fibonacci(int n) {
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
    public void run() {
        Integer[] sequence = new Integer[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = next();
        }
        System.out.println("Seq. of" + n + ":" + Arrays.toString(sequence));
    }
}
