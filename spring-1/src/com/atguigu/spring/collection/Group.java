package com.atguigu.spring.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Group {

	private int id;
	private String[] leaders;
	private List<String> waiters;
	private Map<String, Car> map;

	public String[] getLeaders() {
		return leaders;
	}

	public void setLeaders(String[] leaders) {
		this.leaders = leaders;
	}

	public List<String> getWaiters() {
		return waiters;
	}

	public void setWaiters(List<String> waiters) {
		this.waiters = waiters;
	}

	public Map<String, Car> getMap() {
		return map;
	}

	public void setMap(Map<String, Car> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "Group [id=" + id + ", leaders=" + Arrays.toString(leaders) + ", waiters=" + waiters + ", map=" + map
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
