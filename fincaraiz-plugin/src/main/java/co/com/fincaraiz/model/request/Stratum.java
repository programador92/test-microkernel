package co.com.fincaraiz.model.request;

import java.util.List;

public class Stratum {

	private List<String> id;

	public Stratum() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Stratum(List<String> id) {
		super();
		this.id = id;
	}

	public List<String> getId() {
		return id;
	}

	public void setId(List<String> id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Stratum [id=" + id + "]";
	}
	
}
