package api.house_finder.model;

public class Price {  

	private Double min;
	private Double max;

	public Price() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Price(Double min, Double max) {
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
		return "Price [min=" + min + ", max=" + max + "]";
	}
	
}
