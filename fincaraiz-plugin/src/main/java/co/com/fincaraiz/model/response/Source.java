package co.com.fincaraiz.model.response;

public class Source {
	
	private Listing listing;

	public Source() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Source(Listing listing) {
		super();
		this.listing = listing;
	}

	public Listing getListing() {
		return listing;
	}

	public void setListing(Listing listing) {
		this.listing = listing;
	}

	@Override
	public String toString() {
		return "Source [listing=" + listing + "]";
	}
	
}
