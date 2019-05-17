package com.tcps.self.java8.chap7;


import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @program: self
 * @description:
 * @author: ZhangZhentao
 * @create: 2019-05-17
 **/
public class ParallelStreams {
	public static long measureSumPerf(Function<Long,Long> adder, long n){
		long fastest = Long.MAX_VALUE;
		for (int i = 0; i < 10; i++ ){
			long start = System.nanoTime();
			long sum = adder.apply(n);
			long duration = (System.nanoTime() - start)/1_000_000;
			System.out.println("Result: " + sum);
			if (duration < fastest) {
				fastest = duration;
			}
		}
		return fastest;
	}

	public static void main(String[] args) {
		System.out.println("Sequential sum done in:"+
				measureSumPerf(ParallelStreams::sequentialSum,10_000_000) + "msecs");
	}

	public static long sequentialSum(long n){
		return Stream.iterate(1L, i -> i+1)
				.limit(n)
				.reduce(0L,Long::sum);
	}
}
