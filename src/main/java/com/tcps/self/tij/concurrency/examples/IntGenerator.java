package com.tcps.self.tij.concurrency.examples;

/**
 * @program: self
 * @description: IntGenerator
 * @author: ZhangZhentao
 * @create: 2018-10-23
 **/
public abstract class IntGenerator {
    private volatile boolean canceled = false;

    public abstract int next();

    public void cancel() {
        canceled = true;
    }

    public boolean isCanceled() {
        return canceled;
    }
}
