package com.tcps.self.java8.chap6;

import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.partitioningBy;

/**
 * @program: self
 * @description:
 * @author: ZhangZhentao
 * @create: 2019-05-17
 **/
public class CollectorHarness {
	public static void main(String[] args) {
		long fastest = Long.MAX_VALUE;
		for (int i = 0 ; i < 10; i++){
			long start = System.nanoTime();
//			partitionPrimes(1_000_000);
			partitionPrimesWithCustomCollector(1_000_000);
			long duration = (System.nanoTime() - start) / 1_000_000;
			if (duration<fastest) {
				fastest = duration;
			}
		}
		System.out.println("Fastest execution does in "+fastest+" msecs");
	}
	public static Map<Boolean, List<Integer>> partitionPrimes(int n){
		return IntStream.rangeClosed(2,n)
				.boxed()
				.collect(partitioningBy(cadidate -> isPrime(cadidate)));
	}

	public static boolean isPrime(int candidate){
		int candidateRoot = (int) Math.sqrt(candidate);
		return IntStream.rangeClosed(2,candidateRoot)
				.noneMatch(i -> candidate % i == 0 );
	}
	public static Map<Boolean,List<Integer>> partitionPrimesWithCustomCollector(int n){
		return IntStream.rangeClosed(2,n).boxed()
				.collect(new ToPrimeListCollector());
	}
}
