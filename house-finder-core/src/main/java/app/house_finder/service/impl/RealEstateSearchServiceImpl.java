package app.house_finder.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.house_finder.dto.RealEstateSearchRequestDTO;
import api.house_finder.dto.RealEstateSearchResponseDTO;
import api.house_finder.model.RealEstatePlatform;
import app.house_finder.service.RealEstateSearchService;

@Service
public class RealEstateSearchServiceImpl implements RealEstateSearchService{
	
	@Autowired
	private List<RealEstatePlatform> realEstatePlatformList;
	
	@Override
	public List<RealEstateSearchResponseDTO> realEstateSearch(
			RealEstateSearchRequestDTO realEstateSearchRequestDTO) {

		for (RealEstatePlatform realEstatePlatform : realEstatePlatformList) {
			System.out.println("Name: "+realEstatePlatform.getName()+" enabled: "+
					realEstatePlatform.isEnabled());
		}  
		
		List<RealEstateSearchResponseDTO> list = new ArrayList<>();
		list.add(new RealEstateSearchResponseDTO(1000500d)); 

		return list;   
	}

}
