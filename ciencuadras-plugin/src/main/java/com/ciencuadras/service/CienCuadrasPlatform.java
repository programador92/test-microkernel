package com.ciencuadras.service;

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
		 
		return null;
	}

}
