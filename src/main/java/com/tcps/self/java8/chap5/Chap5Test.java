package com.tcps.self.java8.chap5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @program: self
 * @description: Chap5Test
 * @author: ZhangZhentao
 * @create: 2019-02-14
 **/
public class Chap5Test {
	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario","Milan");
		Trader alan = new Trader("Alan","Cambridge");
		Trader brian = new Trader("Brian","Cambridge");
		List<Transaction> transactions = Arrays.asList(
				new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000),
				new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710),
				new Transaction(mario, 2012, 700),
				new Transaction(alan, 2012, 950)
		);
//		List<Transaction> result = transactions.stream().filter(item -> item.getYear() == 2011).collect(toList());
//		List<String> cityList = transactions.stream().map(item -> item.getTrader().getCity()).distinct().collect(toList());
//		System.out.println(cityList);
//		List<Trader> traderList = transactions
//				.stream()
//				.filter(item -> item.getTrader().getCity() == "Cambridge")
//				.map(item -> item.getTrader())
//				.distinct()
//				.sorted(Comparator.comparing(Trader::getName)).collect(toList());
//		System.out.println(traderList);
//		List<String> nameList = transactions.stream().map(item -> item.getTrader()).map(item -> item.getName()).distinct().sorted().collect(toList());
//		System.out.println(nameList);
//		boolean milanHaveOrNot = transactions.stream().map(item -> item.getTrader()).anyMatch(item -> item.getCity() == "Milan");
//		System.out.println(milanHaveOrNot);
//		transactions
//				.stream()
//				.filter(item->item.getTrader().getCity()=="Cambridge")
//				.map(item->item.getValue())
//				.forEach(System.out::println);
//		Optional<Integer> maxValueOptional = transactions.stream().map(item -> item.getValue()).reduce(Integer::max);
//		System.out.println(maxValueOptional.get());
		Optional<Transaction> smallestTransaction = transactions.stream().reduce((t1, t2) -> t1.getValue() > t2.getValue() ? t2 : t1);
		Optional<Transaction> smallestTransaction1 = transactions.stream().min(Comparator.comparing(Transaction::getValue));
		System.out.println();
	}
}
