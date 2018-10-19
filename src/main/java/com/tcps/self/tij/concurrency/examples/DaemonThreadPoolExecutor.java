package com.tcps.self.tij.concurrency.examples;

import java.util.concurrent.*;

import static com.tcps.self.util.Print.printnb;

/**
 * @program: self
 * @description: DaemonThreadPoolExecutor
 * @author: ZhangZhentao
 * @create: 2018-10-15
 **/
public class DaemonThreadPoolExecutor extends ThreadPoolExecutor {
    public DaemonThreadPoolExecutor() {
        super(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
        new DaemonThreadFactory();
    }
}