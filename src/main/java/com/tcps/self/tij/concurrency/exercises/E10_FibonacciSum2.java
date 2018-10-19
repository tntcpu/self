package com.tcps.self.tij.concurrency.exercises;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * @program: self
 * @description: E10_FibonacciSum2
 * @author: ZhangZhentao
 * @create: 2018-10-19
 **/
class FibonacciSum2 {
    private static ExecutorService exec;

    private static int fib(int n) {
        if (n < 2) {
            return 1;
        }
        return fib(n - 2) + fib(n - 1);
    }

    public static synchronized Future<Integer> runTask(final int n) {
        assert exec != null;
        return exec.submit(() -> {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += fib(i);
            }
            return sum;
        });
    }

    public static synchronized void init() {
        if (exec == null) {
            exec = Executors.newCachedThreadPool();
        }
    }

    public static synchronized void shutdown() {
        if (exec != null) {
            exec.shutdown();
        }
        exec = null;
    }
}

public class E10_FibonacciSum2 {
    public static void main(String[] args) {
        ArrayList<Future<Integer>> results = new ArrayList<>();
        FibonacciSum2.init();
        for (int i = 1; i <= 5; i++) {
            results.add(FibonacciSum2.runTask(i));
        }
        Thread.yield();
        FibonacciSum2.shutdown();
        for (Future<Integer> future : results) {
            try {
                System.out.println(future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }
}
