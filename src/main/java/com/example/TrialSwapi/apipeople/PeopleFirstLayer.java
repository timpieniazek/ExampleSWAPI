package com.example.TrialSwapi.apipeople;

import java.util.Arrays;

public class PeopleFirstLayer {
	
	private int count;
	private PeopleSecondLayer[] results;
	
	public PeopleFirstLayer() {
		// TODO Auto-generated constructor stub
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public PeopleSecondLayer[] getResults() {
		return results;
	}

	public void setResults(PeopleSecondLayer[] results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "FirstLayer [count=" + count + ", results=" + Arrays.toString(results) + "]";
	}
	
	

}
