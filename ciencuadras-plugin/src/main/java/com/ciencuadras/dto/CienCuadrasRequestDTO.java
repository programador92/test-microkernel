package com.ciencuadras.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)  
public class CienCuadrasRequestDTO {   
	
	private String radio;
	private int size;
	private int sizeMap;
	private String transactionType;
	private int fromNear;
	private int from;
	private int sizeNear;
	private boolean project;
	private int offer;
	private String department;
	private String city;
	private String locality;   
	private String generalSearch;
	private String sortOrder;
	private boolean colombiansAbroad;
	private boolean expandSearch;
	private List<String> realEstateType;
	private List<String> area;
	private List<String> rooms;
	private List<String> bathrooms;
	private List<String> garages;
	private List<String> stratum;
	private List<Integer> salePrice; 
	private String sortField;

	public CienCuadrasRequestDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CienCuadrasRequestDTO(String radio, int size, int sizeMap, String transactionType, int fromNear, int from,
			int sizeNear, boolean project, int offer, String department, String city, String generalSearch,
			String sortOrder, boolean colombiansAbroad, boolean expandSearch, List<String> realEstateType,
			List<String> area, List<String> rooms, List<String> bathrooms, List<String> garages, List<String> stratum,
			List<Integer> salePrice, String sortField) {
		super();
		this.radio = radio;
		this.size = size;
		this.sizeMap = sizeMap;
		this.transactionType = transactionType;
		this.fromNear = fromNear;
		this.from = from;
		this.sizeNear = sizeNear;
		this.project = project;
		this.offer = offer;
		this.department = department;
		this.city = city;
		this.generalSearch = generalSearch;
		this.sortOrder = sortOrder;
		this.colombiansAbroad = colombiansAbroad;
		this.expandSearch = expandSearch;
		this.realEstateType = realEstateType;
		this.area = area;
		this.rooms = rooms;
		this.bathrooms = bathrooms;
		this.garages = garages;
		this.stratum = stratum;
		this.salePrice = salePrice;
		this.sortField = sortField;
	}

	public String getRadio() {
		return radio;
	}

	public void setRadio(String radio) {
		this.radio = radio;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getSizeMap() {
		return sizeMap;
	}

	public void setSizeMap(int sizeMap) {
		this.sizeMap = sizeMap;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public int getFromNear() {
		return fromNear;
	}

	public void setFromNear(int fromNear) {
		this.fromNear = fromNear;
	}

	public int getFrom() {
		return from;
	}

	public void setFrom(int from) {
		this.from = from;
	}

	public int getSizeNear() {
		return sizeNear;
	}

	public void setSizeNear(int sizeNear) {
		this.sizeNear = sizeNear;
	}

	public boolean isProject() {
		return project;
	}

	public void setProject(boolean project) {
		this.project = project;
	}

	public int getOffer() {
		return offer;
	}

	public void setOffer(int offer) {
		this.offer = offer;
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

	public String getGeneralSearch() {
		return generalSearch;
	}

	public void setGeneralSearch(String generalSearch) {
		this.generalSearch = generalSearch;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public boolean isColombiansAbroad() {
		return colombiansAbroad;
	}

	public void setColombiansAbroad(boolean colombiansAbroad) {
		this.colombiansAbroad = colombiansAbroad;
	}

	public boolean isExpandSearch() {
		return expandSearch;
	}

	public void setExpandSearch(boolean expandSearch) {
		this.expandSearch = expandSearch;
	}

	public List<String> getRealEstateType() {
		return realEstateType;
	}

	public void setRealEstateType(List<String> realEstateType) {
		this.realEstateType = realEstateType;
	}

	public List<String> getArea() {
		return area;
	}

	public void setArea(List<String> area) {
		this.area = area;
	}

	public List<String> getRooms() {
		return rooms;
	}

	public void setRooms(List<String> rooms) {
		this.rooms = rooms;
	}

	public List<String> getBathrooms() {
		return bathrooms;
	}

	public void setBathrooms(List<String> bathrooms) {
		this.bathrooms = bathrooms;
	}

	public List<String> getGarages() {
		return garages;
	}

	public void setGarages(List<String> garages) {
		this.garages = garages;
	}

	public List<String> getStratum() {
		return stratum;
	}

	public void setStratum(List<String> stratum) {
		this.stratum = stratum;
	}

	public List<Integer> getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(List<Integer> salePrice) {
		this.salePrice = salePrice;
	}

	public String getSortField() {
		return sortField;
	}

	public void setSortField(String sortField) {  
		this.sortField = sortField;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	@Override
	public String toString() {
		return "CienCuadrasRequestDTO [radio=" + radio + ", size=" + size + ", sizeMap=" + sizeMap
				+ ", transactionType=" + transactionType + ", fromNear=" + fromNear + ", from=" + from + ", sizeNear="
				+ sizeNear + ", project=" + project + ", offer=" + offer + ", department=" + department + ", city="
				+ city + ", locality=" + locality + ", generalSearch=" + generalSearch + ", sortOrder=" + sortOrder
				+ ", colombiansAbroad=" + colombiansAbroad + ", expandSearch=" + expandSearch + ", realEstateType="
				+ realEstateType + ", area=" + area + ", rooms=" + rooms + ", bathrooms=" + bathrooms + ", garages="
				+ garages + ", stratum=" + stratum + ", salePrice=" + salePrice + ", sortField=" + sortField + "]";
	}
	
}
