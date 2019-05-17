package com.tcps.self.java8.chap6;

import java.util.List;
import java.util.function.Predicate;

/**
 * @program: self
 * @description:
 * @author: ZhangZhentao
 * @create: 2019-05-17
 **/
public class PrimeCheck {
	public static boolean isPrime1(List<Integer> primes,int candidate){
		return primes.stream()
				.noneMatch(i -> candidate % i == 0);
	}

	public static boolean isPrime2(List<Integer> primes,int candidate){
		int candidateRoot = (int) Math.sqrt(candidate);
		return takeWhile(primes,i -> i <= candidateRoot)
				.stream()
				.noneMatch(p -> candidate % p ==0);
	}

	public static <A> List<A> takeWhile(List<A> list, Predicate<A> p){
		int i = 0;
		for (A item:list){
			if (!p.test(item)){
				return list.subList(0,i);
			}
			i++;
		}
		return list;
	}
}
