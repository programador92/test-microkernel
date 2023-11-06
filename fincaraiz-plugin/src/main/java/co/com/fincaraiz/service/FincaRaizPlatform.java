package co.com.fincaraiz.service;

import java.util.ArrayList;
import java.util.List;

import api.house_finder.dto.RealEstateSearchRequestDTO;
import api.house_finder.dto.RealEstateSearchResponseDTO;
import api.house_finder.model.RealEstatePlatform;

public class FincaRaizPlatform extends RealEstatePlatform {
 
	public FincaRaizPlatform(String name, String version, boolean enabled) {
		super(name, version, enabled);
	} 

	@Override
	public List<RealEstateSearchResponseDTO> realEstateSearch(
			RealEstateSearchRequestDTO realEstateSearchRequestDTO) {
		
		List<RealEstateSearchResponseDTO> list = new ArrayList<>();
		list.add(new RealEstateSearchResponseDTO(1000000d)); 
		return list;
	}   

}
