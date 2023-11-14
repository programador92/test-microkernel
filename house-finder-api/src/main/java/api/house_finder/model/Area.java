package api.house_finder.model;

public class Area { 
 
	private String min;
	private String max;

	public Area() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Area(String min, String max) {
		super();
		this.min = min;
		this.max = max;
	}

	public String getMin() {
		return min;
	}

	public void setMin(String min) {
		this.min = min;
	}

	public String getMax() {
		return max;
	}

	public void setMax(String max) {
		this.max = max;
	}

	@Override
	public String toString() { 
		return "Area [min=" + min + ", max=" + max + "]";
	}
	
}
