package co.com.fincaraiz.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpEntity; 
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;

import api.house_finder.dto.RealEstateSearchRequestDTO;
import api.house_finder.dto.RealEstateSearchResponseDTO;
import api.house_finder.model.Location;
import api.house_finder.model.RealEstatePlatform;
import co.com.fincaraiz.dto.FincaRaizRequestDTO;
import co.com.fincaraiz.dto.FincaRaizResponseDTO;
import co.com.fincaraiz.mapper.FincaRaizMapper;
import co.com.fincaraiz.model.response.Hit;
import co.com.fincaraiz.model.response.ImageList;

public class FincaRaizPlatform extends RealEstatePlatform {
 
	public FincaRaizPlatform(String name, String version, boolean enabled) {
		super(name, version, enabled);
	}   
 
	@Override
	public List<RealEstateSearchResponseDTO> realEstateSearch(
			RealEstateSearchRequestDTO realEstateSearchRequestDTO) { 
		
		FincaRaizRequestDTO fincaRaizRequestDTO = FincaRaizMapper
				.mapToFincaRaizRequestDTO(realEstateSearchRequestDTO);
		System.out.println("Fincaraiz Request: "+new Gson().toJson(fincaRaizRequestDTO));
		   
		RestTemplate restTemplate = new RestTemplate();
        String resourceUrl = "https://api.fincaraiz.com.co/document/api/1.0/listing/search";
        HttpEntity<FincaRaizRequestDTO> request = 
        		new HttpEntity<FincaRaizRequestDTO>(fincaRaizRequestDTO);
        FincaRaizResponseDTO fincaRaizResponseDTO = restTemplate   
               .postForObject(resourceUrl, request, FincaRaizResponseDTO.class);    
		System.out.println("Fincaraiz Service Response: "+new Gson().toJson(fincaRaizResponseDTO));    
		   
		List<RealEstateSearchResponseDTO> responseList = new ArrayList<>();
		for (Hit hit: fincaRaizResponseDTO.getHits().getHits()) { 
			RealEstateSearchResponseDTO realEstateSearchResponseDTO = 
					new RealEstateSearchResponseDTO(); 
			realEstateSearchResponseDTO.setPrice( 
					hit.get_source().getListing().getPrice());
			realEstateSearchResponseDTO.setLocation( 
					new Location(realEstateSearchRequestDTO.getLocation().getCity(), 
							realEstateSearchRequestDTO.getLocation().getLocality()));
			realEstateSearchResponseDTO.setReal_estate_type(
					realEstateSearchRequestDTO.getRealEstateType());
			realEstateSearchResponseDTO.setOffer_type(
					realEstateSearchRequestDTO.getOfferType());
			realEstateSearchResponseDTO.setDescription(getDescription(hit));
			realEstateSearchResponseDTO.setArea(   
					hit.get_source().getListing().getArea()); 
			realEstateSearchResponseDTO.setNum_rooms(
					realEstateSearchRequestDTO.getNumRooms());
			realEstateSearchResponseDTO.setNum_baths(
					realEstateSearchRequestDTO.getNumBaths());
			realEstateSearchResponseDTO.setNum_garages(
					realEstateSearchRequestDTO.getNumGarages());
			realEstateSearchResponseDTO.setStratum( 
					realEstateSearchRequestDTO.getStratum());  
			realEstateSearchResponseDTO.setReal_estate_platform("FINCARAIZ");
			realEstateSearchResponseDTO.setContact_phone(null);
			realEstateSearchResponseDTO.setContact_whatsapp(null); 
			  
			List<String> photosList = new ArrayList<String>();   
			if(hit.get_source().getListing().getMedia().getPhotos() != null) {  
				for (ImageList image : hit.get_source().getListing()
						.getMedia().getPhotos().get(0).getList()) { 
					photosList.add(image.getImage().getFull_size());
				}
			}
			
			realEstateSearchResponseDTO.setPhotos(photosList);   
			responseList.add(realEstateSearchResponseDTO);
		}   
		System.out.println("Fincaraiz Response: "+responseList);  
		  
		return responseList; 
	}   

	public String getDescription(Hit hit) {
		String title = hit.get_source().getListing().getTitle()+".";
		String state = "Estado del inmueble: "+ 
		(hit.get_source().getListing().isIs_new() == true ? "Nuevo.": "Usado.");
		String publisher = "Anuncio publicado por "; 
		if(hit.get_source().getListing().getClient()
				.getClient_type().equalsIgnoreCase("BROKER")) { 
			publisher = publisher + "agencia inmobiliaria: "+hit.get_source().getListing()
					.getClient().getCompany_name()+".";
		}else {  
			publisher = publisher + "agente privado: "+hit.get_source().getListing()
					.getClient().getFirst_name()+" "+hit.get_source().getListing()
					.getClient().getLast_name()+"."; 
		}		  
		String code = "Codigo de Fincaraiz del inmueble: "+hit.get_source()
		.getListing().getFr_property_id().toString(); 
		  
		return title+state+publisher+code;   
	}
	
} 
