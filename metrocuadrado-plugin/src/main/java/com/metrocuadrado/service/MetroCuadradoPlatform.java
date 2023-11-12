package com.metrocuadrado.service;

import java.util.ArrayList;
import java.util.List;

import api.house_finder.dto.RealEstateSearchRequestDTO;
import api.house_finder.dto.RealEstateSearchResponseDTO;
import api.house_finder.model.RealEstatePlatform;

public class MetroCuadradoPlatform extends RealEstatePlatform {

	public MetroCuadradoPlatform(String name, String version, boolean enabled) {
		super(name, version, enabled);
	}  

	@Override
	public List<RealEstateSearchResponseDTO> realEstateSearch(
			RealEstateSearchRequestDTO realEstateSearchRequestDTO) {
		
		List<RealEstateSearchResponseDTO> list = new ArrayList<>();
		list.add(new RealEstateSearchResponseDTO()); 
		return list;
	} 

}
