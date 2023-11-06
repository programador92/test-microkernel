package app.house_finder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.house_finder.dto.*;
import app.house_finder.service.RealEstateSearchService;

@RestController
@RequestMapping("/v1/real-estate")
public class RealEstateController { 
	
	@Autowired
	private RealEstateSearchService realEstateSearchService;
	
	@PostMapping("/search")  
	public List<RealEstateSearchResponseDTO> search(
			RealEstateSearchRequestDTO realEstateSearchRequestDTO) { 
		System.out.println("search service");      
		List<RealEstateSearchResponseDTO> resp = realEstateSearchService.realEstateSearch(realEstateSearchRequestDTO);
		System.out.println("Respuesta "+resp);
		return resp; 
	} 
	
}
