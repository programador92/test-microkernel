package com.ciencuadras.model.response;

import java.util.List;

public class Data {

	private List<Result> results;

	public Data() { 
		super();
		// TODO Auto-generated constructor stub
	}

	public Data(List<Result> results) {
		super();
		this.results = results;
	}

	public List<Result> getResults() {
		return results;
	}

	public void setResults(List<Result> results) {
		this.results = results;
	}

	@Override
	public String toString() {     
		return "Data [results=" + results + "]";
	}
	
}
