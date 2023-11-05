package co.com.fincaraiz.service;

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
		
		
		return null;
	} 

}
