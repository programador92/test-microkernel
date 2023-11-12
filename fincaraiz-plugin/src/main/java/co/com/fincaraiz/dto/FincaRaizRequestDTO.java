package co.com.fincaraiz.dto;

import co.com.fincaraiz.model.request.Field;
import co.com.fincaraiz.model.request.Filter;

public class FincaRaizRequestDTO { 
	
	private Filter filter;
	private Field fields;
	
	public FincaRaizRequestDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public FincaRaizRequestDTO(Filter filter, Field fields) {
		super();
		this.filter = filter;
		this.fields = fields;
	}

	public Filter getFilter() {
		return filter;
	}

	public void setFilter(Filter filter) {
		this.filter = filter;
	}

	public Field getFields() {
		return fields;
	}

	public void setFields(Field fields) {  
		this.fields = fields;
	}

	@Override
	public String toString() {
		return "FincaRaizRequestDTO [filter=" + filter + ", fields=" + fields + "]";
	}
	
}
