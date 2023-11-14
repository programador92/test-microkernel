package com.metrocuadrado.dto;
 
import java.util.List;

import com.metrocuadrado.model.response.Result;

public class MetroCuadradoResponseDTO {
	
	private List<Result> results;

	public MetroCuadradoResponseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MetroCuadradoResponseDTO(List<Result> results) {
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
		return "MetroCuadradoResponseDTO [results=" + results + "]";
	}

}
