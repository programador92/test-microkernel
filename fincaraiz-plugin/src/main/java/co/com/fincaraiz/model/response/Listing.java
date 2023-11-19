package co.com.fincaraiz.model.response;

public class Listing {
	
	private String area;
	private Media media;
	private String price; 
	private Client client; 
	private boolean is_new;
	private String title;  
	private Integer fr_property_id;
	
	public Listing() {
		super();
	}

	public Listing(String area, Media media, String price, Client client, boolean is_new, String title,
			Integer fr_property_id) {
		super();
		this.area = area;
		this.media = media;
		this.price = price;
		this.client = client;
		this.is_new = is_new;
		this.title = title;
		this.fr_property_id = fr_property_id;
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

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public boolean isIs_new() {
		return is_new;
	}

	public void setIs_new(boolean is_new) {
		this.is_new = is_new;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getFr_property_id() {
		return fr_property_id;
	}

	public void setFr_property_id(Integer fr_property_id) {
		this.fr_property_id = fr_property_id;
	}
 
	@Override
	public String toString() {
		return "Listing [area=" + area + ", media=" + media + ", price=" + price + ", client=" + client + ", is_new="
				+ is_new + ", title=" + title + ", fr_property_id=" + fr_property_id + "]";
	} 

}
