package co.com.fincaraiz.dto;

import co.com.fincaraiz.model.response.Hits;

public class FincaRaizResponseDTO {
	
	private Hits hits;

	public FincaRaizResponseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FincaRaizResponseDTO(Hits hits) {
		super();
		this.hits = hits;
	}

	public Hits getHits() {
		return hits;
	}

	public void setHits(Hits hits) {
		this.hits = hits;
	}

	@Override
	public String toString() {
		return "FincaRaizResponseDTO [hits=" + hits + "]";
	}
	
}
