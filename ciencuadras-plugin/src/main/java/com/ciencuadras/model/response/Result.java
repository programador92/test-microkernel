package com.ciencuadras.model.response;

public class Result {
 
	private int salePrice;
	private String area;  
	
	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Result(int salePrice, String area) {
		super();
		this.salePrice = salePrice;
		this.area = area;
	}

	public int getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(int salePrice) {
		this.salePrice = salePrice;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {  
		this.area = area;
	}

	@Override
	public String toString() {    
		return "Result [salePrice=" + salePrice + ", area=" + area + "]";
	}
	
}
