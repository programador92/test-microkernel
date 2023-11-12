package api.house_finder.model;

public class Area { 
 
	private Double min;
	private Double max;

	public Area() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Area(Double min, Double max) {
		super();
		this.min = min;
		this.max = max;
	}

	public Double getMin() {
		return min;
	}

	public void setMin(Double min) {
		this.min = min;
	}

	public Double getMax() {
		return max;
	}

	public void setMax(Double max) {
		this.max = max;
	}

	@Override
	public String toString() {
		return "Area [min=" + min + ", max=" + max + "]";
	}
	
}
