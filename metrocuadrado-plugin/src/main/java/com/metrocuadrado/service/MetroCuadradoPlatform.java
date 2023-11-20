package com.metrocuadrado.service;
 
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpEntity; 
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;     
import org.springframework.web.client.RestTemplate;    
    
import com.google.gson.Gson;
import com.metrocuadrado.dto.MetroCuadradoResponseDTO;   
import com.metrocuadrado.mapper.MetroCuadradoMapper;
import com.metrocuadrado.model.response.Result;

import api.house_finder.dto.RealEstateSearchRequestDTO;
import api.house_finder.dto.RealEstateSearchResponseDTO;
import api.house_finder.model.Location;
import api.house_finder.model.RealEstatePlatform;

public class MetroCuadradoPlatform extends RealEstatePlatform {

	public MetroCuadradoPlatform(String name, String version, boolean enabled) {
		super(name, version, enabled);
	}  
 
	@Override
	public List<RealEstateSearchResponseDTO> realEstateSearch(
			RealEstateSearchRequestDTO realEstateSearchRequestDTO) {    
		     
		String queryParam = MetroCuadradoMapper.mapToMetroCuadradoQueryParams(
				realEstateSearchRequestDTO);    
		    
		RestTemplate restTemplate = new RestTemplate();   
        String resourceUrl = "https://www.metrocuadrado.com/rest-search/search?"+queryParam;
        HttpHeaders headers = new HttpHeaders();    
        headers.set("x-api-key", "P1MfFHfQMOtL16Zpg36NcntJYCLFm8FqFfudnavl"); 
        
        System.out.println("Metrocuadrado Request: "+resourceUrl); 
           
        HttpEntity<Void> requestEntity = new HttpEntity<>(headers);    
        ResponseEntity<MetroCuadradoResponseDTO> response = restTemplate.exchange(
        		resourceUrl, HttpMethod.GET, requestEntity, MetroCuadradoResponseDTO.class);
        System.out.println("MetroCuadrado Service Response: "+
        		new Gson().toJson(response.getBody())); 
          
        List<RealEstateSearchResponseDTO> responseList = new ArrayList<>();
        for (Result result : response.getBody().getResults()) { 
        	RealEstateSearchResponseDTO realEstateSearchResponseDTO = 
					new RealEstateSearchResponseDTO();  
        	realEstateSearchResponseDTO.setArea(result.getMarea()); 
        	realEstateSearchResponseDTO.setContact_phone(result.getContactPhone());
        	realEstateSearchResponseDTO.setContact_whatsapp(result.getWhatsapp());
        	realEstateSearchResponseDTO.setDescription(
        			result.getTitle()+", "+"barrio: "+result.getMbarrio()+", "+
        	result.getMnombrecomunbarrio()+", estado: "+result.getMestadoinmueble() 
        	+".Codigo de Metrocuadrado del inmueble: "+result.getMidinmueble());   
        	realEstateSearchResponseDTO.setLocation(new Location(  
        			realEstateSearchRequestDTO.getLocation().getCity(), 
        			realEstateSearchRequestDTO.getLocation().getLocality()));
        	realEstateSearchResponseDTO.setNum_baths(realEstateSearchRequestDTO.getNumBaths());
        	realEstateSearchResponseDTO.setNum_garages(realEstateSearchRequestDTO.getNumGarages());
        	realEstateSearchResponseDTO.setNum_rooms(realEstateSearchRequestDTO.getNumRooms());
        	realEstateSearchResponseDTO.setOffer_type(realEstateSearchRequestDTO.getOfferType());
        	realEstateSearchResponseDTO.setPhotos(Arrays.asList(result.getImageLink()));
        	DecimalFormat df = new DecimalFormat("#"); 
        	df.setMaximumFractionDigits(0);   
        	realEstateSearchResponseDTO.setPrice(df.format(result.getMvalorventa()));  
        	realEstateSearchResponseDTO.setReal_estate_platform("METROCUADRADO");
        	realEstateSearchResponseDTO.setReal_estate_type(realEstateSearchRequestDTO.getRealEstateType());
        	realEstateSearchResponseDTO.setStratum(realEstateSearchRequestDTO.getStratum());
        	responseList.add(realEstateSearchResponseDTO);  
		}    
         
        System.out.println("Metrocuadrado Response: "+responseList);
        return responseList;   
	}  

}
