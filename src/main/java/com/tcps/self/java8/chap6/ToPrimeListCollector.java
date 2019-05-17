package com.tcps.self.java8.chap6;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

import static com.tcps.self.java8.chap6.PrimeCheck.isPrime2;
import static java.util.stream.Collector.Characteristics.IDENTITY_FINISH;

/**
 * @program: self
 * @description:
 * @author: ZhangZhentao
 * @create: 2019-05-17
 **/
public class ToPrimeListCollector implements Collector<Integer, Map<Boolean, List<Integer>>,Map<Boolean,List<Integer>>> {
	@Override
	public Supplier supplier() {
		return () -> new HashMap<Boolean,List<Integer>>(){
			{
				put(true, new ArrayList<>());
				put(false,new ArrayList<>());
			}
		};

	}

	@Override
	public BiConsumer<Map<Boolean,List<Integer>>,Integer> accumulator() {
		return (Map<Boolean,List<Integer>> acc,Integer cadidate) -> {
			acc.get(isPrime2(acc.get(true),cadidate))
					.add(cadidate);
		};
	}

	@Override
	public BinaryOperator<Map<Boolean,List<Integer>>> combiner() {
		return (Map<Boolean, List<Integer>> map1,
				Map<Boolean, List<Integer>> map2) -> {
			map1.get(true).addAll(map2.get(true));
			map1.get(false).addAll(map2.get(false));
			return map1;
		};
	}

	@Override
	public Function finisher() {
		return Function.identity();
	}

	@Override
	public Set<Characteristics> characteristics() {
		return Collections.unmodifiableSet(EnumSet.of(IDENTITY_FINISH));
	}
}
