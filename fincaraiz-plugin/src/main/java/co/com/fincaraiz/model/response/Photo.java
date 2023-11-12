package co.com.fincaraiz.model.response;

import java.util.List;

public class Photo {
	
	private List<ImageList> list; 

	public Photo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Photo(List<ImageList> list) {
		super();
		this.list = list;
	}

	public List<ImageList> getList() {
		return list;
	}

	public void setList(List<ImageList> list) {
		this.list = list;
	}

	@Override
	public String toString() {    
		return "Photo [list=" + list + "]";
	}

}
