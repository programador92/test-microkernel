package com.ciencuadras.model.response;

public class Result {
 
	private Integer salePrice;
	private String area;  
	private String contactPhone;
	private String contactWhatsapp;
	private String image; 
	
	public Result() { 
		super();
		// TODO Auto-generated constructor stub
	}

	public Result(Integer salePrice, String area, String contactPhone, String contactWhatsapp, String image) {
		super();
		this.salePrice = salePrice;
		this.area = area;
		this.contactPhone = contactPhone;
		this.contactWhatsapp = contactWhatsapp;
		this.image = image;
	}

	public Integer getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(Integer salePrice) {
		this.salePrice = salePrice;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getContactWhatsapp() {
		return contactWhatsapp;
	}

	public void setContactWhatsapp(String contactWhatsapp) {
		this.contactWhatsapp = contactWhatsapp;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) { 
		this.image = image;
	}

	@Override
	public String toString() {
		return "Result [salePrice=" + salePrice + ", area=" + area + ", contactPhone=" + contactPhone
				+ ", contactWhatsapp=" + contactWhatsapp + ", image=" + image + "]";
	}
	
}
