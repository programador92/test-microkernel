package api.house_finder.dto;

import api.house_finder.model.Area;
import api.house_finder.model.Price;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RealEstateSearchRequestDTO {

	private String location;
	private String realEstateType;
	private String offerType;
	private Price price;
	private Area area; 
	private Integer roomsNumber;
	private Integer bathsNumber; 
	private Integer garagesNumber;
	private Integer stratum;  
	
}
