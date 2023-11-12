package co.com.fincaraiz.model.response;

public class Listing {
	
	private String area;
	private Media media;
	private String price; 
	
	public Listing() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Listing(String area, Media media, String price) {
		super();
		this.area = area;
		this.media = media;
		this.price = price;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Media getMedia() {
		return media;
	}

	public void setMedia(Media media) {
		this.media = media;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Listing [area=" + area + ", media=" + media + ", price=" + price + "]";
	}

}
