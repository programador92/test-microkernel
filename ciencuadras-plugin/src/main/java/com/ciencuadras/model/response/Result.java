package com.ciencuadras.model.response;

public class Result {
 
	private Integer salePrice;  
	private String area;    
	private String contactPhone; 
	private String contactWhatsapp;
	private String image; 
	private String department;
	private String city;
	private String locality;
	private String neighborhood;
	private String code;
	private String userName;
	private String userType;
	private String antiquity;
	private String address;
	private String realStateEmail;
	private String realEstateType;
	private String offerType;
	
	public Result() { 
		super();
		// TODO Auto-generated constructor stub
	}

	public Result(Integer salePrice, String area, String contactPhone, String contactWhatsapp, String image,
			String department, String city, String locality, String neighborhood, String code, String userName,
			String userType, String antiquity, String address, String realStateEmail, String realEstateType,
			String offerType) {
		super();
		this.salePrice = salePrice;
		this.area = area;
		this.contactPhone = contactPhone;
		this.contactWhatsapp = contactWhatsapp;
		this.image = image;
		this.department = department;
		this.city = city;
		this.locality = locality;
		this.neighborhood = neighborhood;
		this.code = code;
		this.userName = userName;
		this.userType = userType;
		this.antiquity = antiquity;
		this.address = address;
		this.realStateEmail = realStateEmail;
		this.realEstateType = realEstateType;
		this.offerType = offerType;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getAntiquity() {
		return antiquity;
	}

	public void setAntiquity(String antiquity) {
		this.antiquity = antiquity;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRealStateEmail() {
		return realStateEmail;
	}

	public void setRealStateEmail(String realStateEmail) {
		this.realStateEmail = realStateEmail;
	}

	public String getRealEstateType() {
		return realEstateType;
	}

	public void setRealEstateType(String realEstateType) {
		this.realEstateType = realEstateType;
	}

	public String getOfferType() {
		return offerType;
	}

	public void setOfferType(String offerType) {
		this.offerType = offerType;
	}

	@Override
	public String toString() {  
		return "Result [salePrice=" + salePrice + ", area=" + area + ", contactPhone=" + contactPhone
				+ ", contactWhatsapp=" + contactWhatsapp + ", image=" + image + ", department=" + department + ", city="
				+ city + ", locality=" + locality + ", neighborhood=" + neighborhood + ", code=" + code + ", userName="
				+ userName + ", userType=" + userType + ", antiquity=" + antiquity + ", address=" + address
				+ ", realStateEmail=" + realStateEmail + ", realEstateType=" + realEstateType + ", offerType="
				+ offerType + "]";
	} 
	
}
