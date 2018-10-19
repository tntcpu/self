package com.tcps.self.tij.concurrency.examples;

import java.util.concurrent.ThreadFactory;

/**
 * @program: self
 * @description: DaemonThreadFactory
 * @author: ZhangZhentao
 * @create: 2018-10-15
 **/
public class DaemonThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setDaemon(true);
        return t;
    }
}
