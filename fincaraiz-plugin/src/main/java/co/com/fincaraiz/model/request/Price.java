package co.com.fincaraiz.model.request;

public class Price { 
	
	private Double gte;
	private Double lte;
	
	public Price() { 
		super();
		// TODO Auto-generated constructor stub
	}

	public Price(Double gte, Double lte) {
		super();
		this.gte = gte;
		this.lte = lte;
	}

	public Double getGte() {
		return gte;
	}

	public void setGte(Double gte) {
		this.gte = gte;
	}

	public Double getLte() {
		return lte;
	}

	public void setLte(Double lte) {
		this.lte = lte;
	}

	@Override
	public String toString() {
		return "Price [gte=" + gte + ", lte=" + lte + "]";
	}
	
}
