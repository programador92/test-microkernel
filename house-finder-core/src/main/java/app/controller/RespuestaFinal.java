package app.controller;

public class RespuestaFinal {

	private String respuesta;
	private long tiempo;
	
	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	public long getTiempo() {
		return tiempo;
	}

	public void setTiempo(long tiempo) {
		this.tiempo = tiempo;
	}

	public RespuestaFinal(String respuesta, long tiempo) {
		super();
		this.respuesta = respuesta;
		this.tiempo = tiempo;
	}
	
	public RespuestaFinal() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
}
