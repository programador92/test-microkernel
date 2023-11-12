package co.com.fincaraiz.model.response;

import java.util.List;

public class Media {
	
	private List<Photo> photos;

	public Media() {  
		super();
		// TODO Auto-generated constructor stub
	}

	public Media(List<Photo> photos) {
		super();
		this.photos = photos;
	}

	public List<Photo> getPhotos() {
		return photos;
	}

	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}

	@Override
	public String toString() {
		return "Media [photos=" + photos + "]";
	} 
	
}
