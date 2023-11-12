package co.com.fincaraiz.model.request;

public class Order {
	
	private String field;
	private String type;
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Order(String field, String type) {
		super();
		this.field = field;
		this.type = type;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Order [field=" + field + ", type=" + type + "]";
	}
	
}
