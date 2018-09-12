package com.example.TrialSwapi.apifilms;

import java.util.Arrays;

public class FilmFirstLayer {
	
	private int count;
	private FilmSecondLayer[] results;

	public FilmFirstLayer() {
		// TODO Auto-generated constructor stub
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	
	
	public FilmSecondLayer[] getResults() {
		return results;
	}

	public void setResults(FilmSecondLayer[] results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "FirstLayer [count=" + count + ", results=" + Arrays.toString(results) + "]";
	}

	

}
