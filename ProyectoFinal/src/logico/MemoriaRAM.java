package logico;

public class MemoriaRAM extends Componente {

	private float cantMemoria;
	private String tipomemoria;
	private boolean Gb;
		
	public MemoriaRAM(String serie, String modelo, String marca, float precioVenta, float precioCompra, int cantMinima,
			int cantMaxima, int cantReal, float cantMemoria, String tipomemoria, boolean gb) {
		super(serie, modelo, marca, precioVenta, cantMinima, cantMaxima, cantReal);
		this.cantMemoria = cantMemoria;
		this.tipomemoria = tipomemoria;
		Gb = gb;
	}
	public float getCantidadMem() {
		return cantMemoria;
	}
	public void setCantidadMem(float cantidadMem) {
		this.cantMemoria = cantidadMem;
	}
	public String getTipo() {
		return tipomemoria;
	}
	public void setTipo(String tipo) {
		this.tipomemoria = tipo;
	}
	public boolean isGb() {
		return Gb;
	}
	public void setGb(boolean gb) {
		Gb = gb;
	}
	

}
