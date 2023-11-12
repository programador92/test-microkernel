package co.com.fincaraiz.model.response;

import java.util.List;

public class Hits { 
	
	private List<Hit> hits;

	public Hits() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hits(List<Hit> hits) {
		super();
		this.hits = hits;
	}

	public List<Hit> getHits() {
		return hits;
	}

	public void setHits(List<Hit> hits) {
		this.hits = hits;
	}

	@Override
	public String toString() {  
		return "Hits [hits=" + hits + "]";
	}
	
}
