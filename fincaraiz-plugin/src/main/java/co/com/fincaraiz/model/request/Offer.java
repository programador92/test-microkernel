package co.com.fincaraiz.model.request;

import java.util.List;

public class Offer {
	
	public Offer() {
		super();
		// TODO Auto-generated constructor stub
	}

	private List<String> slug;

	public Offer(List<String> slug) {
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
		return "Offer [slug=" + slug + "]";
	}
	
}
