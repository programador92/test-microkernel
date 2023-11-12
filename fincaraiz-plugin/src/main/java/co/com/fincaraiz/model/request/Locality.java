package co.com.fincaraiz.model.request;

import java.util.List;

public class Locality {
	
	private List<String> slug;

	public Locality() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Locality(List<String> slug) {
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
		return "Locality [slug=" + slug + "]";
	}
	
	
	
}
