package logico;

public class Microprocesadores extends Componente {

	private String tipoconector;
	private float velocidad;
	private boolean GHz;
		
	
	public Microprocesadores(String serie, String modelo, String marca, float precioVenta, float precioCompra,
			int cantMinima, int cantMaxima, int cantReal, String tipoconector, float velocidad, boolean gHz) {
		super(serie, modelo, marca,precioCompra, precioVenta, cantMinima, cantMaxima, cantReal);
		this.tipoconector = tipoconector;
		this.velocidad = velocidad;
		GHz = gHz;
	}

	public String getConector() {
		return tipoconector;
	}
	public void setConector(String conector) {
		this.tipoconector = conector;
	}
	public float getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(float velocidad) {
		this.velocidad = velocidad;
	}
	public boolean isGHz() {
		return GHz;
	}
	public void setGHz(boolean gHz) {
		GHz = gHz;
	}
	
	


}
