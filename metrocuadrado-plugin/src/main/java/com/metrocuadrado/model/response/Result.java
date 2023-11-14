package com.metrocuadrado.model.response;

public class Result {     
	
	private String contactPhone;   
	private String whatsapp;
	private String title;
	private String imageLink;
	private Double mvalorventa; 
	private String marea; 
	private String mbarrio; 
	private String mnombrecomunbarrio; 
	private String mestadoinmueble; 
	
	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Result(String contactPhone, String whatsapp, String title, String imageLink, Double mvalorventa,
			String marea, String mbarrio, String mnombrecomunbarrio, String mestadoinmueble) {
		super();
		this.contactPhone = contactPhone; 
		this.whatsapp = whatsapp;
		this.title = title;
		this.imageLink = imageLink;
		this.mvalorventa = mvalorventa;
		this.marea = marea;
		this.mbarrio = mbarrio;
		this.mnombrecomunbarrio = mnombrecomunbarrio;
		this.mestadoinmueble = mestadoinmueble;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getWhatsapp() {
		return whatsapp;
	}

	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImageLink() {
		return imageLink;
	}

	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}

	public Double getMvalorventa() {
		return mvalorventa;
	}

	public void setMvalorventa(Double mvalorventa) {
		this.mvalorventa = mvalorventa;
	}

	public String getMarea() {
		return marea;
	}

	public void setMarea(String marea) {
		this.marea = marea;
	}

	public String getMbarrio() {
		return mbarrio;
	}

	public void setMbarrio(String mbarrio) {
		this.mbarrio = mbarrio;
	}

	public String getMnombrecomunbarrio() {
		return mnombrecomunbarrio;
	}

	public void setMnombrecomunbarrio(String mnombrecomunbarrio) {
		this.mnombrecomunbarrio = mnombrecomunbarrio;
	}

	public String getMestadoinmueble() {
		return mestadoinmueble;
	}

	public void setMestadoinmueble(String mestadoinmueble) {
		this.mestadoinmueble = mestadoinmueble;
	}  

	@Override
	public String toString() {  
		return "Result [contactPhone=" + contactPhone + ", whatsapp=" + whatsapp + ", title=" + title + ", imageLink="
				+ imageLink + ", mvalorventa=" + mvalorventa + ", marea=" + marea + ", mbarrio=" + mbarrio
				+ ", mnombrecomunbarrio=" + mnombrecomunbarrio + ", mestadoinmueble=" + mestadoinmueble + "]";
	}
	
}
