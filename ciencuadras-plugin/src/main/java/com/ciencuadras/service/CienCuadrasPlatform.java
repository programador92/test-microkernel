package com.ciencuadras.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.ciencuadras.dto.CienCuadrasRequestDTO;
import com.ciencuadras.dto.CienCuadrasResponseDTO;
import com.ciencuadras.dto.TokenResponseDTO;
import com.ciencuadras.mapper.CienCuadrasMapper;
import com.ciencuadras.model.response.Result;
import com.google.gson.Gson;

import api.house_finder.dto.RealEstateSearchRequestDTO;
import api.house_finder.dto.RealEstateSearchResponseDTO;
import api.house_finder.model.Location; 
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
		String token = "Bearer "+getToken().getAccess_token();
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", token);
		HttpEntity entity = new HttpEntity<>(cienCuadrasRequestDTO, headers);

		ResponseEntity<CienCuadrasResponseDTO> response =
				restTemplate.postForEntity(
						"https://api-backend.ciencuadras.com/prod/search-results/v1",
						entity,  
						CienCuadrasResponseDTO.class);   
		System.out.println("Ciencuadras Service Response: "+
						new Gson().toJson(response.getBody()));    
		 
		List<RealEstateSearchResponseDTO> responseList = new ArrayList<>();
		for (Result result: response.getBody().getData().getResults()) {    
			RealEstateSearchResponseDTO realEstateSearchResponseDTO = 
					new RealEstateSearchResponseDTO(); 
			realEstateSearchResponseDTO.setPrice(result.getSalePrice().toString());
			realEstateSearchResponseDTO.setLocation(
					new Location(realEstateSearchRequestDTO.getLocation().getCity(), 
							realEstateSearchRequestDTO.getLocation().getLocality()));
			realEstateSearchResponseDTO.setReal_estate_type( 
					realEstateSearchRequestDTO.getRealEstateType());
			realEstateSearchResponseDTO.setOffer_type(
					realEstateSearchRequestDTO.getOfferType());
			realEstateSearchResponseDTO.setDescription(getDescription(result)); 
			realEstateSearchResponseDTO.setArea(result.getArea());
			realEstateSearchResponseDTO.setNum_rooms(
					realEstateSearchRequestDTO.getNumRooms());
			realEstateSearchResponseDTO.setNum_baths(
					realEstateSearchRequestDTO.getNumBaths()); 
			realEstateSearchResponseDTO.setNum_garages(
					realEstateSearchRequestDTO.getNumGarages()); 
			realEstateSearchResponseDTO.setStratum(
					realEstateSearchRequestDTO.getStratum());   
			realEstateSearchResponseDTO.setReal_estate_platform("CIENCUADRAS");
			realEstateSearchResponseDTO.setContact_phone(result.getContactPhone());
			realEstateSearchResponseDTO.setContact_whatsapp(result.getContactWhatsapp());
			realEstateSearchResponseDTO.setPhotos(Arrays.asList(result.getImage()));
			responseList.add(realEstateSearchResponseDTO);
		}   
		System.out.println("Ciencuadras Response: "+responseList);        
		 
		return responseList;
	}
	
	private TokenResponseDTO getToken() {  
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		headers.add( 
				"Authorization",
				"Basic MXRjbW03MzQyajY2NjFvNDRnZ2JvNGoxNnA6MTlnYW1hOXJxaXRodHE4OWZkN3NoYzl2Y2xtdXVtbWFoYmJnOTc1ZjJpNzB0dDFrc21saA==");
		headers.add("Content-Type", "application/x-www-form-urlencoded");

		MultiValueMap<String, String> bodyParamMap = new LinkedMultiValueMap<>();
		bodyParamMap.add("grant_type", "client_credentials");

		HttpEntity entity = new HttpEntity<>(bodyParamMap, headers);

		ResponseEntity<TokenResponseDTO> response =
				restTemplate.postForEntity(
						"https://ciencuadras-prod-api-auth.auth.us-east-1.amazoncognito.com/oauth2/token",
						entity,  
						TokenResponseDTO.class); 
		System.out.println("Token Service Response: "+
				new Gson().toJson(response.getBody()));   
		return response.getBody();    
	} 
	
	public String getDescription(Result result) {   
		return result.getRealEstateType()+" en "
				+result.getOfferType().toLowerCase()+". Ubicada en "
				+result.getLocality()+", "+result.getCity()+", "+result.getDepartment()
				+". Vecindario "+result.getNeighborhood().toLowerCase()+"."
				+"Antiguedad: "+result.getAntiquity()+", "    
				+"Direccion: "+result.getAddress()+". Anuncio publicado por "
				+result.getUserType()+"-"+result.getUserName()+", correo: "
				+result.getRealStateEmail()+". Codigo de Ciencuadras del inmueble: "
				+result.getCode();  
	}

}
