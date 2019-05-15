package com.tcps.self.java8.chap6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: self
 * @description:
 * @author: ZhangZhentao
 * @create: 2019-03-29
 **/
public class Test6 {
	public static void main(String[] args) {
		List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT), new Dish("beef", false, 700, Dish.Type.MEAT), new Dish("chicken", false, 400, Dish.Type.MEAT), new Dish("french fries", true, 530, Dish.Type.OTHER), new Dish("rice", true, 350, Dish.Type.OTHER), new Dish("season fruit", true, 120, Dish.Type.OTHER), new Dish("pizza", true, 550, Dish.Type.OTHER), new Dish("prawns", false, 300, Dish.Type.FISH), new Dish("salmon", false, 450, Dish.Type.FISH));
		List<Dish> collect = menu.stream().collect(new ToListCollector<>());
		List<Dish> collect1 = menu.stream().collect(Collectors.toList());
		System.out.println(collect);
		System.out.println(collect1);
		List<Dish> collect2 = menu.stream().collect(new ToList<>());
		System.out.println(collect2);

		ArrayList<Object> collect3 = menu.stream().collect(ArrayList::new, List::add, List::addAll);
		System.out.println(collect3);
	}
}