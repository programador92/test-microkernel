package co.com.fincaraiz.mapper;

import java.util.Arrays;

import api.house_finder.dto.RealEstateSearchRequestDTO;
import api.house_finder.model.City;
import api.house_finder.model.Locality;
import api.house_finder.model.OfferType;
import api.house_finder.model.RealEstateType;
import co.com.fincaraiz.dto.FincaRaizRequestDTO;
import co.com.fincaraiz.model.request.Area;
import co.com.fincaraiz.model.request.Bath;
import co.com.fincaraiz.model.request.CityEnum;
import co.com.fincaraiz.model.request.Field;
import co.com.fincaraiz.model.request.Filter;
import co.com.fincaraiz.model.request.Garage;
import co.com.fincaraiz.model.request.LocalityEnum;
import co.com.fincaraiz.model.request.Location;
import co.com.fincaraiz.model.request.Offer;
import co.com.fincaraiz.model.request.Order;
import co.com.fincaraiz.model.request.Price;
import co.com.fincaraiz.model.request.PropertyType;
import co.com.fincaraiz.model.request.Room;
import co.com.fincaraiz.model.request.Stratum;

public class FincaRaizMapper {
	
	public static FincaRaizRequestDTO mapToFincaRaizRequestDTO(
			RealEstateSearchRequestDTO realEstateSearchRequestDTO) {
		
		String offerStr = "";
		if( realEstateSearchRequestDTO.getOfferType().equals(OfferType.SELL) ) {
			offerStr = co.com.fincaraiz.model.request.OfferType.SELL.getDescription();
		} else {
			offerStr = co.com.fincaraiz.model.request.OfferType.RENT.getDescription();
		} 
		Offer offer = new Offer(Arrays.asList(offerStr));  
	
		String propertyTypeStr = "";
		if( realEstateSearchRequestDTO.getRealEstateType().equals(RealEstateType.HOUSE) ) {
			propertyTypeStr = co.com.fincaraiz.model.request.PropertyTypeEnum.HOUSE.getDescription();
		} else {
			propertyTypeStr = co.com.fincaraiz.model.request.PropertyTypeEnum.APARTMENT.getDescription();
		} 
		PropertyType propertyType = new PropertyType(Arrays.asList(propertyTypeStr));
		  
		co.com.fincaraiz.model.request.City city = null;
		co.com.fincaraiz.model.request.Locality locality = null;
		Location location = null;
		if(realEstateSearchRequestDTO.getLocation().getCity().equals(City.BOGOTA)) {
			if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.USAQUEN)) {
				locality = new co.com.fincaraiz.model.request.Locality(Arrays.asList(LocalityEnum.USAQUEN.getDescription()));
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.CHAPINERO)) {
				locality = new co.com.fincaraiz.model.request.Locality(Arrays.asList(LocalityEnum.CHAPINERO.getDescription()));
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.SANTA_FE)) {
				locality = new co.com.fincaraiz.model.request.Locality(Arrays.asList(LocalityEnum.SANTA_FE.getDescription()));
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.SAN_CRISTOBAL)) {
				locality = new co.com.fincaraiz.model.request.Locality(Arrays.asList(LocalityEnum.SAN_CRISTOBAL.getDescription()));
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.USME)) {
				locality = new co.com.fincaraiz.model.request.Locality(Arrays.asList(LocalityEnum.USME.getDescription()));
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.TUNJUELITO)) {
				locality = new co.com.fincaraiz.model.request.Locality(Arrays.asList(LocalityEnum.TUNJUELITO.getDescription()));
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.BOSA)) {
				locality = new co.com.fincaraiz.model.request.Locality(Arrays.asList(LocalityEnum.BOSA.getDescription()));
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.KENNEDY)) {
				locality = new co.com.fincaraiz.model.request.Locality(Arrays.asList(LocalityEnum.KENNEDY.getDescription()));
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.FONTIBON)) {
				locality = new co.com.fincaraiz.model.request.Locality(Arrays.asList(LocalityEnum.FONTIBON.getDescription()));
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.ENGATIVA)) {
				locality = new co.com.fincaraiz.model.request.Locality(Arrays.asList(LocalityEnum.ENGATIVA.getDescription()));
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.SUBA)) {
				locality = new co.com.fincaraiz.model.request.Locality(Arrays.asList(LocalityEnum.SUBA.getDescription()));
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.BARRIOS_UNIDOS)) {
				locality = new co.com.fincaraiz.model.request.Locality(Arrays.asList(LocalityEnum.BARRIOS_UNIDOS.getDescription()));
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.TEUSAQUILLO)) {
				locality = new co.com.fincaraiz.model.request.Locality(Arrays.asList(LocalityEnum.TEUSAQUILLO.getDescription()));
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.MARTIRES)) {
				locality = new co.com.fincaraiz.model.request.Locality(Arrays.asList(LocalityEnum.MARTIRES.getDescription()));
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.ANTONIO_NARINO)) {
				locality = new co.com.fincaraiz.model.request.Locality(Arrays.asList(LocalityEnum.ANTONIO_NARINO.getDescription()));
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.PUENTE_ARANDA)) {
				locality = new co.com.fincaraiz.model.request.Locality(Arrays.asList(LocalityEnum.PUENTE_ARANDA.getDescription()));
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.CANDELARIA)) {
				locality = new co.com.fincaraiz.model.request.Locality(Arrays.asList(LocalityEnum.CANDELARIA.getDescription()));
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.RAFAEL_URIBE_URIBE)) {
				locality = new co.com.fincaraiz.model.request.Locality(Arrays.asList(LocalityEnum.RAFAEL_URIBE_URIBE.getDescription()));
			}else if(realEstateSearchRequestDTO.getLocation().getLocality().equals(Locality.CIUDAD_BOLIVAR)) {
				locality = new co.com.fincaraiz.model.request.Locality(Arrays.asList(LocalityEnum.CIUDAD_BOLIVAR.getDescription()));
			}
			 
		}else {
			if(realEstateSearchRequestDTO.getLocation().getCity().equals(City.MEDELLIN)) {      
				city = new co.com.fincaraiz.model.request.City(
						Arrays.asList(CityEnum.MEDELLIN.getCode(), CityEnum.MEDELLIN.getDescription()));
			}else if(realEstateSearchRequestDTO.getLocation().getCity().equals(City.CALI)) {
				city = new co.com.fincaraiz.model.request.City(
						Arrays.asList(CityEnum.CALI.getCode(), CityEnum.CALI.getDescription()));
			}else if(realEstateSearchRequestDTO.getLocation().getCity().equals(City.BARRANQUILLA)) {
				city = new co.com.fincaraiz.model.request.City(  
						Arrays.asList(CityEnum.BARRANQUILLA.getCode(), CityEnum.BARRANQUILLA.getDescription()));
			}else if(realEstateSearchRequestDTO.getLocation().getCity().equals(City.MANIZALES)) {
				city = new co.com.fincaraiz.model.request.City(
						Arrays.asList(CityEnum.MANIZALES.getCode(), CityEnum.MANIZALES.getDescription()));
			}else if(realEstateSearchRequestDTO.getLocation().getCity().equals(City.CARTAGENA)) {
				city = new co.com.fincaraiz.model.request.City(
						Arrays.asList(CityEnum.CARTAGENA.getCode(), CityEnum.CARTAGENA.getDescription()));
			}else if(realEstateSearchRequestDTO.getLocation().getCity().equals(City.BUCARAMANGA)) {
				city = new co.com.fincaraiz.model.request.City(
						Arrays.asList(CityEnum.BUCARAMANGA.getCode(), CityEnum.BUCARAMANGA.getDescription()));
			}
		} 
		location = new Location(city, locality);  

		Price price = new Price(Double.parseDouble(realEstateSearchRequestDTO.getPrice().getMin()), 
				Double.parseDouble(realEstateSearchRequestDTO.getPrice().getMax()));  
		
		//TODO validate  
		Room room = new Room(Arrays.asList("ROOM_"+realEstateSearchRequestDTO.getNumRooms()));
		
		Stratum stratum = new Stratum(Arrays.asList(realEstateSearchRequestDTO.getStratum().toString()));
		
		Area area = new Area(Double.parseDouble(realEstateSearchRequestDTO.getArea().getMin()), 
				Double.parseDouble(realEstateSearchRequestDTO.getArea().getMax()));
		  
		Bath bath = new Bath(Arrays.asList("BATH_"+realEstateSearchRequestDTO.getNumBaths()));
		
		Garage garage = new Garage(Arrays.asList("GARAGE_"+realEstateSearchRequestDTO.getNumGarages()));
		
		Field fields = new Field();
		fields.setExclude(Arrays.asList());
		fields.setFacets(Arrays.asList());
		fields.setInclude(Arrays.asList(
				"area",
	            "baths.id",
	            "baths.name",
	            "baths.slug",
	            "client.client_type",
	            "client.company_name",
	            "client.first_name",
	            "client.fr_client_id",
	            "client.last_name",
	            "client.logo.full_size",
	            "garages.name",
	            "is_new",
	            "locations.cities.fr_place_id",
	            "locations.cities.name",
	            "locations.cities.slug",
	            "locations.countries.fr_place_id",
	            "locations.countries.name",
	            "locations.countries.slug",
	            "locations.groups.name",
	            "locations.groups.slug",
	            "locations.groups.subgroups.name",
	            "locations.groups.subgroups.slug",
	            "locations.neighbourhoods.fr_place_id",
	            "locations.neighbourhoods.name",
	            "locations.neighbourhoods.slug",
	            "locations.states.fr_place_id",
	            "locations.states.name",
	            "locations.states.slug",
	            "locations.location_point",
	            "locations.location_main.id",
	            "locations.location_main.fr_place_id",
	            "locations.location_main.place_code",
	            "locations.location_main.name",
	            "locations.location_main.slug",
	            "locations.location_main.location_type",
	            "max_area",
	            "max_price",
	            "media.photos.list.image.full_size",
	            "media.photos.list.image.list",
	            "media.photos.list.is_main",
	            "media.videos.list.is_main",
	            "media.videos.list.video",
	            "media.logo.full_size",
	            "min_area",
	            "min_price",
	            "offer.name",
	            "price",
	            "products.configuration.tag_id",
	            "products.configuration.tag_name",
	            "products.label",
	            "products.name",
	            "products.slug",
	            "property_id",
	            "property_type.name",
	            "fr_property_id",
	            "fr_parent_property_id",
	            "rooms.id",
	            "rooms.name",
	            "rooms.slug",
	            "stratum.name",
	            "title"
				));
		fields.setLimit(25);
		fields.setOffset(0);
		Order order = new Order("price", "asc"); 
		fields.setOrdering(Arrays.asList(order)); 
		fields.setPlatform(40);
		fields.setWithAlgorithm(true);    
		
		Filter filter = new Filter(offer, propertyType, location, 
				price, room, stratum, area, bath, garage);
		
		return new FincaRaizRequestDTO(filter, fields);  
	}
	
}
