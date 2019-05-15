package com.tcps.self.java8.chap5;

/**
 * @program: self
 * @description: Trader
 * @author: ZhangZhentao
 * @create: 2019-02-14
 **/
public class Trader {
	private final String name;
	private final String city;

	public Trader(String n, String c) {
		this.name = n;
		this.city = c;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "Trader{" + "name='" + name + '\'' + ", city='" + city + '\'' + '}';
	}
}
