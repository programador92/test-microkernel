package app.house_finder.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

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

		List<CompletableFuture<List<RealEstateSearchResponseDTO>>> completableFuturelist = 
				new ArrayList<>();
		List<RealEstateSearchResponseDTO> realEstateList = new ArrayList<>();
		
		for (RealEstatePlatform realEstatePlatform : realEstatePlatformList) {
			System.out.println("Plugin "+realEstatePlatform.getName()+" enabled: "+
					realEstatePlatform.isEnabled());   
			if(realEstatePlatform.isEnabled()) {
				CompletableFuture<List<RealEstateSearchResponseDTO>> completableFuture =
						CompletableFuture.supplyAsync(
								(Supplier<List<RealEstateSearchResponseDTO>>) 
								() -> realEstatePlatform.realEstateSearch(
										realEstateSearchRequestDTO));
				completableFuturelist.add(completableFuture);
			}
		}  

		for (CompletableFuture<List<RealEstateSearchResponseDTO>> completableFuture : completableFuturelist) {
			realEstateList.addAll(completableFuture.join());
		} 
		 
		Collections.sort(realEstateList, 
				Comparator.comparing(RealEstateSearchResponseDTO::getPrice));
		     
		return realEstateList;    
	} 

}
