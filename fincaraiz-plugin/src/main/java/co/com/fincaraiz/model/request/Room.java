package co.com.fincaraiz.model.request;

import java.util.List;

public class Room {

	private List<String> slug;
 
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Room(List<String> slug) {
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
		return "Room [slug=" + slug + "]";
	}
	
}
