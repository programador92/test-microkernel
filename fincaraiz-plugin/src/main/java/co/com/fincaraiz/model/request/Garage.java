package co.com.fincaraiz.model.request;

import java.util.List;

public class Garage {

	private List<String> slug;   

	public Garage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Garage(List<String> slug) {
		super();
		this.slug = slug;
	}

	public List<String> getSlug() {
		return slug;
	}

	public void setSlug(List<String> slug) {
		this.slug = slug;
	}

	@Override
	public String toString() {
		return "Garage [slug=" + slug + "]";
	}
	
}
