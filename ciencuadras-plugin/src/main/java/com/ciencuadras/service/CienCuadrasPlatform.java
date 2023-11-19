package com.ciencuadras.service;

import java.util.ArrayList;
import java.util.List;

import com.ciencuadras.dto.CienCuadrasRequestDTO;
import com.ciencuadras.mapper.CienCuadrasMapper;
import com.google.gson.Gson;

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
		  
		CienCuadrasRequestDTO cienCuadrasRequestDTO = CienCuadrasMapper
				.mapToCienCuadrasRequestDTO(realEstateSearchRequestDTO);  
		System.out.println("Ciencuadras Request: "+new Gson().toJson(cienCuadrasRequestDTO));
		    
		//call token
		
		List<RealEstateSearchResponseDTO> list = new ArrayList<>();
		list.add(new RealEstateSearchResponseDTO()); 
		return list;
	}

}
