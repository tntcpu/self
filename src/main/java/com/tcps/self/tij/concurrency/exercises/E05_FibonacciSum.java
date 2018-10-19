package com.tcps.self.tij.concurrency.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @program: self
 * @description: 并发E05_FibonacciSum类
 * @author: ZhangZhentao
 * @create: 2018-09-21
 **/
class FibonacciSum implements Callable<String> {
    private int count;
    private final int n;

    public FibonacciSum(int n) {
        this.n = n;
    }

    private Integer next() {
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
        Integer fibonacciSum = 0;
        for (int i = 0; i < n; i++) {
            fibonacciSum += next();
        }
        return String.valueOf(fibonacciSum);
    }
}

public class E05_FibonacciSum {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        List<Future<String>> results = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            results.add(exec.submit(new FibonacciSum(i)));
        }
        Thread.yield();
        exec.shutdown();
        for (Future<String> fs : results) {
            try {
                System.out.println(fs.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }
}
