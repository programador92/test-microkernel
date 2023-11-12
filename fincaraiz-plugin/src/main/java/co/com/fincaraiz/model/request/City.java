package co.com.fincaraiz.model.request;

import java.util.List;

public class City {

	private List<String> slug;

	public City() {
		super();
		// TODO Auto-generated constructor stub
	}

	public City(List<String> slug) {
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
		return "City [slug=" + slug + "]";
	}
	
}
