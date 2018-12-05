package com.tcps.self.tij.concurrency.exercises;

/**
 * @program: self
 * @description: E11_RaceCondition
 * @author: ZhangZhentao
 * @create: 2018-12-04
 **/
class Tank {
	enum State {EMPTY, LOADED}

	private State state = State.EMPTY;

	private int current_load = 0;

	public void volidate() {
		boolean result = (state == State.EMPTY && current_load != 0) || (state != State.EMPTY) || (state == State.LOADED && current_load == 0);
		if (result) {
			throw new IllegalStateException();
		}
	}

	public void fill() {
		state = State.LOADED;
		Thread.yield();
		current_load = 10;
	}

	public void drain() {
		state = State.EMPTY;
		Thread.yield();
		current_load = 0;
	}
}

public class E11_RaceCondition {

}
