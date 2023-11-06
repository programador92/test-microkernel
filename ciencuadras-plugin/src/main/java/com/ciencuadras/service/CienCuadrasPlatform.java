package com.ciencuadras.service;

import java.util.ArrayList;
import java.util.List;

import api.house_finder.dto.RealEstateSearchRequestDTO;
import api.house_finder.dto.RealEstateSearchResponseDTO;
import api.house_finder.model.RealEstatePlatform;

public class CienCuadrasPlatform extends RealEstatePlatform {

	public CienCuadrasPlatform(String name, String version, boolean enabled) {
		super(name, version, enabled); 
	}

	@Override
	public List<RealEstateSearchResponseDTO> realEstateSearch(
			RealEstateSearchRequestDTO realEstateSearchRequestDTO) {
		 
		List<RealEstateSearchResponseDTO> list = new ArrayList<>();
		list.add(new RealEstateSearchResponseDTO(3000000d)); 
		return list;
	}

}
