package co.com.fincaraiz.model.request;

import java.util.List;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
 
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Field {   
	
	private List<String> exclude; 
	private List<String> facets;
	private List<String> include;  
	private Integer limit;
	private Integer offset;
	private List<Order> ordering;
	private Integer platform;
	private Boolean withAlgorithm;
	
	public Field() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Field(List<String> exclude, List<String> facets, List<String> include, Integer limit, Integer offset,
			List<Order> ordering, Integer platform, Boolean withAlgorithm) {
		super();
		this.exclude = exclude;
		this.facets = facets;
		this.include = include;
		this.limit = limit;
		this.offset = offset;
		this.ordering = ordering;
		this.platform = platform;
		this.withAlgorithm = withAlgorithm;
	}

	public List<String> getExclude() {
		return exclude;
	}

	public void setExclude(List<String> exclude) {
		this.exclude = exclude;
	}

	public List<String> getFacets() {
		return facets;
	}

	public void setFacets(List<String> facets) {
		this.facets = facets;
	}

	public List<String> getInclude() {
		return include;
	}

	public void setInclude(List<String> include) {
		this.include = include;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public List<Order> getOrdering() {
		return ordering;
	}

	public void setOrdering(List<Order> ordering) {
		this.ordering = ordering;
	}

	public Integer getPlatform() {
		return platform;
	}

	public void setPlatform(Integer platform) {
		this.platform = platform;
	}

	public Boolean getWithAlgorithm() {
		return withAlgorithm;
	}

	public void setWithAlgorithm(Boolean withAlgorithm) {
		this.withAlgorithm = withAlgorithm;
	}

	@Override
	public String toString() {
		return "Field [exclude=" + exclude + ", facets=" + facets + ", include=" + include + ", limit=" + limit
				+ ", offset=" + offset + ", ordering=" + ordering + ", platform=" + platform + ", withAlgorithm="
				+ withAlgorithm + "]";
	} 	
	
}
