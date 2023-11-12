package co.com.fincaraiz.model.response;

public class Hit {
	
	public Source _source;

	public Hit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hit(Source _source) {
		super();
		this._source = _source;
	}

	public Source get_source() {
		return _source;
	}

	public void set_source(Source _source) {
		this._source = _source;
	}

	@Override
	public String toString() {   
		return "Hit [_source=" + _source + "]";
	} 
	
}
