package com.metrocuadrado.mapper;

import api.house_finder.dto.RealEstateSearchRequestDTO;
import api.house_finder.model.City;
import api.house_finder.model.Locality;
import api.house_finder.model.OfferType;
import api.house_finder.model.RealEstateType; 

public class MetroCuadradoMapper {
	
	public static String mapToMetroCuadradoQueryParams(
			RealEstateSearchRequestDTO realEstateSearchRequestDTO) {  
				  
		String queryParam = "";
		if(realEstateSearchRequestDTO.getOfferType().equals(OfferType.SELL)) {
			queryParam = "realEstateBusinessList=venta";
		}else {
			queryParam = "realEstateBusinessList=arriendo";
		}      
		
		queryParam = queryParam+"&saleRange="+realEstateSearchRequestDTO.getPrice().getMin();   
		queryParam = queryParam+"&saleRange="+realEstateSearchRequestDTO.getPrice().getMax();   
		   
		if(realEstateSearchRequestDTO.getLocation().getCity().equals(City.BOGOTA)) { 
			queryParam = queryParam+"&city=bogot\u00e1";          
			if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.USAQUEN)) {
				queryParam = queryParam+"&neighborhood="+com.metrocuadrado.model.request.LocalityEnum.USAQUEN.getDescription(); 
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.CHAPINERO)) {
				queryParam = queryParam+"&neighborhood="+com.metrocuadrado.model.request.LocalityEnum.CHAPINERO.getDescription();
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.SANTA_FE)) {
				queryParam = queryParam+"&neighborhood="+com.metrocuadrado.model.request.LocalityEnum.SANTA_FE.getDescription();
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.SAN_CRISTOBAL)) {
				queryParam = queryParam+"&neighborhood="+com.metrocuadrado.model.request.LocalityEnum.SAN_CRISTOBAL.getDescription();
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.USME)) {
				queryParam = queryParam+"&neighborhood="+com.metrocuadrado.model.request.LocalityEnum.USME.getDescription();
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.TUNJUELITO)) {
				queryParam = queryParam+"&neighborhood="+com.metrocuadrado.model.request.LocalityEnum.TUNJUELITO.getDescription();
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.BOSA)) {
				queryParam = queryParam+"&neighborhood="+com.metrocuadrado.model.request.LocalityEnum.BOSA.getDescription();
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.KENNEDY)) {
				queryParam = queryParam+"&neighborhood="+com.metrocuadrado.model.request.LocalityEnum.KENNEDY.getDescription();
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.FONTIBON)) {
				queryParam = queryParam+"&neighborhood="+com.metrocuadrado.model.request.LocalityEnum.FONTIBON.getDescription();
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.ENGATIVA)) {
				queryParam = queryParam+"&neighborhood="+com.metrocuadrado.model.request.LocalityEnum.ENGATIVA.getDescription();
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.SUBA)) {
				queryParam = queryParam+"&neighborhood="+com.metrocuadrado.model.request.LocalityEnum.SUBA.getDescription();
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.BARRIOS_UNIDOS)) {
				queryParam = queryParam+"&neighborhood="+com.metrocuadrado.model.request.LocalityEnum.BARRIOS_UNIDOS.getDescription();
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.TEUSAQUILLO)) {
				queryParam = queryParam+"&neighborhood="+com.metrocuadrado.model.request.LocalityEnum.TEUSAQUILLO.getDescription();
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.MARTIRES)) {
				queryParam = queryParam+"&neighborhood="+com.metrocuadrado.model.request.LocalityEnum.MARTIRES.getDescription();
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.ANTONIO_NARINO)) {
				queryParam = queryParam+"&neighborhood="+com.metrocuadrado.model.request.LocalityEnum.ANTONIO_NARINO.getDescription();
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.PUENTE_ARANDA)) {
				queryParam = queryParam+"&neighborhood="+com.metrocuadrado.model.request.LocalityEnum.PUENTE_ARANDA.getDescription();
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.CANDELARIA)) {
				queryParam = queryParam+"&neighborhood="+com.metrocuadrado.model.request.LocalityEnum.CANDELARIA.getDescription();
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.RAFAEL_URIBE_URIBE)) {
				queryParam = queryParam+"&neighborhood="+com.metrocuadrado.model.request.LocalityEnum.RAFAEL_URIBE_URIBE.getDescription();
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.CIUDAD_BOLIVAR)) {
				queryParam = queryParam+"&neighborhood="+com.metrocuadrado.model.request.LocalityEnum.CIUDAD_BOLIVAR.getDescription();
			}
		}else {
			if(realEstateSearchRequestDTO.getLocation().getCity().equals(City.MEDELLIN)) {      
				queryParam = queryParam+"&city="+com.metrocuadrado.model.request.CityEnum.MEDELLIN.getDescription();
			}else if(realEstateSearchRequestDTO.getLocation().getCity().equals(City.CALI)) {
				queryParam = queryParam+"&city="+com.metrocuadrado.model.request.CityEnum.CALI.getDescription();
			}else if(realEstateSearchRequestDTO.getLocation().getCity().equals(City.BARRANQUILLA)) {
				queryParam = queryParam+"&city="+com.metrocuadrado.model.request.CityEnum.BARRANQUILLA.getDescription();
			}else if(realEstateSearchRequestDTO.getLocation().getCity().equals(City.MANIZALES)) {
				queryParam = queryParam+"&city="+com.metrocuadrado.model.request.CityEnum.MANIZALES.getDescription();
			}else if(realEstateSearchRequestDTO.getLocation().getCity().equals(City.CARTAGENA)) {
				queryParam = queryParam+"&city="+com.metrocuadrado.model.request.CityEnum.CARTAGENA.getDescription();
			}else if(realEstateSearchRequestDTO.getLocation().getCity().equals(City.BUCARAMANGA)) {
				queryParam = queryParam+"&city="+com.metrocuadrado.model.request.CityEnum.BUCARAMANGA.getDescription();
			}
		} 
		
		if( realEstateSearchRequestDTO.getRealEstateType().equals(RealEstateType.HOUSE) ) {
			queryParam = queryParam+"&realEstateTypeList="+com.metrocuadrado.model.request.RealEstateTypeListEnum.HOUSE.getDescription();
		} else {
			queryParam = queryParam+"&realEstateTypeList="+com.metrocuadrado.model.request.RealEstateTypeListEnum.APARTMENT.getDescription();
		} 
		  
		queryParam = queryParam+"&from=0&size=50";
		queryParam = queryParam+"&roomList="+realEstateSearchRequestDTO.getNumRooms();
		queryParam = queryParam+"&bathroomList="+realEstateSearchRequestDTO.getNumBaths();
		queryParam = queryParam+"&garageList="+realEstateSearchRequestDTO.getNumGarages();
		queryParam = queryParam+"&stratumList="+realEstateSearchRequestDTO.getStratum();
		queryParam = queryParam+"&order-by-results=precio|asc";
		queryParam = queryParam+"&areaRange="+realEstateSearchRequestDTO.getArea().getMin(); 
		queryParam = queryParam+"&areaRange="+realEstateSearchRequestDTO.getArea().getMax();   
		queryParam = queryParam+"&sortField=precio&sortOrder=asc";   
		 
		return queryParam;   
	}
	
}
