package api.house_finder.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class RealEstateSearchResponseDTO { 
	
	@Override
	public String toString() {
		return "RealEstateSearchResponseDTO [price=" + price + ", city=" + city + ", realEstateType=" + realEstateType
				+ ", offerType=" + offerType + ", description=" + description + ", area=" + area + ", roomsNumber="
				+ roomsNumber + ", bathsNumber=" + bathsNumber + ", garagesNumber=" + garagesNumber + ", stratum="
				+ stratum + ", realEstatePlatform=" + realEstatePlatform + ", contactPhone=" + contactPhone
				+ ", contactWhatsapp=" + contactWhatsapp + ", photos=" + photos + "]";
	}

	public RealEstateSearchResponseDTO() { 
	}
	
	public RealEstateSearchResponseDTO(Double price) { 
		this.price = price;
	}
	
	public Double getPrice() {  
		return this.price;
	}
	
	private Double price;
	private String city;
	private String realEstateType;
	private String offerType;
	private String description;
	private Double area;
	private Integer roomsNumber;
	private Integer bathsNumber; 
	private Integer garagesNumber;
	private Integer stratum; 
	private String realEstatePlatform; 
	private String contactPhone;
	private String contactWhatsapp;
	private List<String> photos;
	
}
