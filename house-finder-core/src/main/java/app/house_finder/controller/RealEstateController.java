package app.house_finder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import api.house_finder.dto.*;
import app.house_finder.service.RealEstateSearchService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1/real-estate")
public class RealEstateController { 
	
	@Autowired
	private RealEstateSearchService realEstateSearchService;
	
	@PostMapping("/search")   
	public List<RealEstateSearchResponseDTO> search( 
			@RequestBody RealEstateSearchRequestDTO realEstateSearchRequestDTO) { 
		System.out.println("Init search service");    
		System.out.println("search service request: " 
				+new Gson().toJson(realEstateSearchRequestDTO));          
		List<RealEstateSearchResponseDTO> response = realEstateSearchService
				.realEstateSearch(realEstateSearchRequestDTO);
		System.out.println("search service response: "
				+new Gson().toJson(response));    
		System.out.println("End search service"); 
		return response;  
	} 
	
}
