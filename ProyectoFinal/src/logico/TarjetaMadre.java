package logico;

import java.util.ArrayList;

public class TarjetaMadre extends Componente {

	private String tipoconector;
	private String tipoRam;
	private ArrayList<String>listaconexiones;

	public TarjetaMadre(String serie, String modelo, String marca, float precioVenta, float precioCompra,
			int cantMinima, int cantMaxima, int cantReal, String tipoconector, String tipoRam,
			ArrayList<String> listaconexiones) {
		super(serie, modelo, marca,precioCompra, precioVenta, cantMinima, cantMaxima, cantReal);
		this.tipoconector = tipoconector;
		this.tipoRam = tipoRam;
		this.listaconexiones = listaconexiones;
	}

	public String getConector() {
		return tipoconector;
	}
	
	public void setConector(String conector) {
		this.tipoconector = conector;
	}
	public String getTipoRam() {
		return tipoRam;
	}
	public void setTipoRam(String tipoRam) {
		this.tipoRam = tipoRam;
	}
	public ArrayList<String> getConexiones() {
		return listaconexiones;
	}
	public void setConexiones(ArrayList<String> conexiones) {
		this.listaconexiones = conexiones;
	}
	


}
