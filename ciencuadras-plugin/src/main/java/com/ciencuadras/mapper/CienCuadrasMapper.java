package com.ciencuadras.mapper;

import java.util.Arrays;

import com.ciencuadras.dto.CienCuadrasRequestDTO;
import com.ciencuadras.model.request.LocationEnum;
import com.ciencuadras.model.request.RealEstateTypeEnum;
import com.ciencuadras.model.request.TransactionTypeEnum; 

import api.house_finder.dto.RealEstateSearchRequestDTO;
import api.house_finder.model.City;
import api.house_finder.model.Locality;
import api.house_finder.model.OfferType;
import api.house_finder.model.RealEstateType; 
 
public class CienCuadrasMapper { 
	
	public static CienCuadrasRequestDTO mapToCienCuadrasRequestDTO(
			RealEstateSearchRequestDTO realEstateSearchRequestDTO) {  
		  
		String offerStr = "";       
		if( realEstateSearchRequestDTO.getOfferType().equals(OfferType.SELL) ) {
			offerStr = TransactionTypeEnum.SELL.getDescription();
		} else { 
			offerStr = TransactionTypeEnum.RENT.getDescription(); 
		}  
	
		String propertyTypeStr = "";
		if( realEstateSearchRequestDTO.getRealEstateType().equals(RealEstateType.HOUSE) ) {
			propertyTypeStr = RealEstateTypeEnum.HOUSE.getDescription();
		} else { 
			propertyTypeStr = RealEstateTypeEnum.APARTMENT.getDescription(); 
		} 
		
		String locality = null;   
		LocationEnum location = null;    
		if(realEstateSearchRequestDTO.getLocation().getCity().equals(City.BOGOTA)) {
			location = LocationEnum.BOGOTA;    
			if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.USAQUEN)) { 
				locality = com.ciencuadras.model.request.LocalityEnum.USAQUEN.getDescription();
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.CHAPINERO)) {
				locality = com.ciencuadras.model.request.LocalityEnum.CHAPINERO.getDescription(); 
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.SANTA_FE)) {
				locality = com.ciencuadras.model.request.LocalityEnum.SANTA_FE.getDescription();  
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.SAN_CRISTOBAL)) {
				locality = com.ciencuadras.model.request.LocalityEnum.SAN_CRISTOBAL.getDescription();  
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.USME)) {
				locality = com.ciencuadras.model.request.LocalityEnum.USME.getDescription();
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.TUNJUELITO)) {
				locality = com.ciencuadras.model.request.LocalityEnum.TUNJUELITO.getDescription(); 
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.BOSA)) {
				locality = com.ciencuadras.model.request.LocalityEnum.BOSA.getDescription();  
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.KENNEDY)) {
				locality = com.ciencuadras.model.request.LocalityEnum.KENNEDY.getDescription();   
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.FONTIBON)) {
				locality = com.ciencuadras.model.request.LocalityEnum.FONTIBON.getDescription();  
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.ENGATIVA)) {
				locality = com.ciencuadras.model.request.LocalityEnum.ENGATIVA.getDescription();
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.SUBA)) {
				locality = com.ciencuadras.model.request.LocalityEnum.SUBA.getDescription();
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.BARRIOS_UNIDOS)) {
				locality = com.ciencuadras.model.request.LocalityEnum.BARRIOS_UNIDOS.getDescription(); 
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.TEUSAQUILLO)) {
				locality = com.ciencuadras.model.request.LocalityEnum.TEUSAQUILLO.getDescription();
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.MARTIRES)) { 
				locality = com.ciencuadras.model.request.LocalityEnum.MARTIRES.getDescription();
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.ANTONIO_NARINO)) {
				locality = com.ciencuadras.model.request.LocalityEnum.ANTONIO_NARINO.getDescription();
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.PUENTE_ARANDA)) {
				locality = com.ciencuadras.model.request.LocalityEnum.PUENTE_ARANDA.getDescription();
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.CANDELARIA)) {
				locality = com.ciencuadras.model.request.LocalityEnum.CANDELARIA.getDescription(); 
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.RAFAEL_URIBE_URIBE)) {
				locality = com.ciencuadras.model.request.LocalityEnum.RAFAEL_URIBE_URIBE.getDescription(); 
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.CIUDAD_BOLIVAR)) {
				locality = com.ciencuadras.model.request.LocalityEnum.CIUDAD_BOLIVAR.getDescription(); 
			}    
			 
		}else {
			if(realEstateSearchRequestDTO.getLocation().getCity().equals(City.MEDELLIN)) {      
				location = LocationEnum.MEDELLIN; 
			}else if(realEstateSearchRequestDTO.getLocation().getCity().equals(City.CALI)) {
				location = LocationEnum.CALI;
			}else if(realEstateSearchRequestDTO.getLocation().getCity().equals(City.BARRANQUILLA)) {
				location = LocationEnum.BARRANQUILLA; 
			}else if(realEstateSearchRequestDTO.getLocation().getCity().equals(City.MANIZALES)) {
				location = LocationEnum.MANIZALES;  
			}else if(realEstateSearchRequestDTO.getLocation().getCity().equals(City.CARTAGENA)) {
				location = LocationEnum.CARTAGENA; 
			}else if(realEstateSearchRequestDTO.getLocation().getCity().equals(City.BUCARAMANGA)) {
				location = LocationEnum.BUCARAMANGA;  
			}
		} 
		
		CienCuadrasRequestDTO cienCuadrasRequestDTO = new CienCuadrasRequestDTO();
		cienCuadrasRequestDTO.setRadio("2km");
		cienCuadrasRequestDTO.setSize(10);
		cienCuadrasRequestDTO.setSizeMap(70);
		cienCuadrasRequestDTO.setTransactionType(offerStr);
		cienCuadrasRequestDTO.setFromNear(0);
		cienCuadrasRequestDTO.setFrom(0);
		cienCuadrasRequestDTO.setSizeNear(20);
		cienCuadrasRequestDTO.setProject(false);
		cienCuadrasRequestDTO.setOffer(0);
		cienCuadrasRequestDTO.setDepartment(location.getDepartment());
		cienCuadrasRequestDTO.setCity(location.getCity()); 
		cienCuadrasRequestDTO.setLocality(locality);
		cienCuadrasRequestDTO.setGeneralSearch("");
		cienCuadrasRequestDTO.setSortOrder("asc");
		cienCuadrasRequestDTO.setColombiansAbroad(false);
		cienCuadrasRequestDTO.setExpandSearch(false);
		cienCuadrasRequestDTO.setRealEstateType(Arrays.asList(propertyTypeStr));
		cienCuadrasRequestDTO.setArea(Arrays.asList(
				realEstateSearchRequestDTO.getArea().getMin(),
				realEstateSearchRequestDTO.getArea().getMax()));
		cienCuadrasRequestDTO.setRooms(Arrays.asList(
				realEstateSearchRequestDTO.getNumRooms().toString())); 
		cienCuadrasRequestDTO.setBathrooms(Arrays.asList(
				realEstateSearchRequestDTO.getNumBaths().toString()));
		cienCuadrasRequestDTO.setGarages((Arrays.asList(
				realEstateSearchRequestDTO.getNumGarages().toString()))); 
		cienCuadrasRequestDTO.setStratum(((Arrays.asList( 
				realEstateSearchRequestDTO.getStratum().toString())))); 
		cienCuadrasRequestDTO.setSalePrice((((Arrays.asList(  
				Integer.parseInt(realEstateSearchRequestDTO.getPrice().getMin()),
				Integer.parseInt(realEstateSearchRequestDTO.getPrice().getMax())))))); 
		cienCuadrasRequestDTO.setSortField("sale_price");     
		    
		return cienCuadrasRequestDTO;
	}
	
}
