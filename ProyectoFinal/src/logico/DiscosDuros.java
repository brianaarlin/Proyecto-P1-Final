package logico;

public class DiscosDuros extends Componente {

	private float capacidad;
	private boolean Gb;
	private String tipoconexion;


	public DiscosDuros(String serie, String modelo, String marca, float precioVenta, float precioCompra, int cantMinima,
			int cantMaxima, int cantReal, float capacidad, boolean gb, String tipoconexion) {
		super(serie, modelo, marca,precioCompra, precioVenta, cantMinima, cantMaxima, cantReal);
		this.capacidad = capacidad;
		Gb = gb;
		this.tipoconexion = tipoconexion;
	}

	public float getAlmacenamiento() {
		return capacidad;
	}

	public void setAlmacenamiento(float almacenamiento) {
		this.capacidad = almacenamiento;
	}

	public boolean isGb() {
		return Gb;
	}

	public void setGb(boolean gb) {
		Gb = gb;
	}

	public String getConexion() {
		return tipoconexion;
	}

	public void setConexion(String conexion) {
		this.tipoconexion = conexion;
	}
	

}
