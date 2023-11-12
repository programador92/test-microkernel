package co.com.fincaraiz.model.request;

import java.util.List;

public class Bath {

	private List<String> slug;

	public Bath() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bath(List<String> slug) {
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
		return "Bath [slug=" + slug + "]";
	}
	
}
