package co.com.fincaraiz.model.response;

public class ImageList { 
	
	private Image image;

	public ImageList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ImageList(Image image) {
		super();
		this.image = image;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	@Override
	public String toString() { 
		return "ImageList [image=" + image + "]";
	}
	
}
