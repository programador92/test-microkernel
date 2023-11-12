package co.com.fincaraiz.model.request;

import java.util.List;

public class PropertyType {
	
	private List<String> slug;

	public PropertyType() {  
		super();
		// TODO Auto-generated constructor stub
	}

	public PropertyType(List<String> slug) {
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
		return "PropertyType [slug=" + slug + "]";
	}
	
}
