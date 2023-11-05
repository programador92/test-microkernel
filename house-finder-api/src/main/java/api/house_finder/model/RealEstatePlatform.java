package api.house_finder.model;

import java.util.List;

import api.house_finder.dto.RealEstateSearchRequestDTO;
import api.house_finder.dto.RealEstateSearchResponseDTO;

public abstract class RealEstatePlatform {   
	
	private String name;
	private String version;
	private boolean enabled;

	public RealEstatePlatform(String name, String version, boolean enabled) {
		super();
		this.name = name;
		this.version = version;
		this.enabled = enabled;
	}
	
	public abstract List<RealEstateSearchResponseDTO> realEstateSearch(
			RealEstateSearchRequestDTO realEstateSearchRequestDTO);
	  
	public String getName() {
		return name;
	}

	public String getVersion() {
		return version;
	}

	public boolean isEnabled() {
		return enabled;
	}

}  
