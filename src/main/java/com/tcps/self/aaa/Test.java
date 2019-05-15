package com.tcps.self.aaa;

import java.util.*;

import static java.util.stream.Collectors.*;

public class Test {

	public static void main(String[] args) {
		List<String> strings = List.of("aaa", "bb", "cccc", "d","e");
		Map<Integer, List<String>> result = strings.stream().collect(groupingBy(String::length));
		System.out.println(result);

		TreeMap<Integer, List<String>> result1 = strings.stream().collect(groupingBy(String::length, TreeMap::new, toList()));
		System.out.println(result1);

		Map<Integer, TreeSet<String>> result2 = strings.stream().collect(groupingBy(String::length, toCollection(TreeSet::new)));
		System.out.println(result2);

		Map<Integer, Long> result3 = strings.stream().collect(groupingBy(String::length, counting()));
		System.out.println(result3);

		Map<Integer, String> result4 = strings.stream().collect(groupingBy(String::length, joining(",", "[", "]")));
		System.out.println(result4);

		Map<Integer, Integer> result5 = strings.stream().collect(groupingBy(String::length, summingInt(String::hashCode)));
		System.out.println(result5);
		Map<Integer, IntSummaryStatistics> result6 = strings.stream().collect(groupingBy(String::length, summarizingInt(String::hashCode)));
		System.out.println(result6);
	}
}
