package co.com.fincaraiz.model.response;

public class Image { 
	
	private String full_size;

	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Image(String full_size) {
		super();
		this.full_size = full_size;
	}

	public String getFull_size() {
		return full_size;
	}

	public void setFull_size(String full_size) {
		this.full_size = full_size;
	}

	@Override
	public String toString() { 
		return "Image [full_size=" + full_size + "]";
	}
	
}
