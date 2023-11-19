package co.com.fincaraiz.model.response;

public class Client {  
	
	private String company_name;
	private String client_type;
	private String first_name;
	private String last_name;   
	
	public Client() {      
		super();
	}

	public Client(String company_name, String client_type, String first_name, String last_name) {
		super();
		this.company_name = company_name;
		this.client_type = client_type;
		this.first_name = first_name;
		this.last_name = last_name;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getClient_type() {
		return client_type;
	}

	public void setClient_type(String client_type) {
		this.client_type = client_type;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {  
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	@Override
	public String toString() {
		return "Client [company_name=" + company_name + ", client_type=" + client_type + ", first_name=" + first_name
				+ ", last_name=" + last_name + "]";
	}
	
}
