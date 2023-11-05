package com.metrocuadrado.service;

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
		return null;
	}

}
