package logico;

public abstract class Componente {
	
	protected String serie;
	protected String modelo;
	protected String marca;
	protected float precioCompra;
	protected float precioVenta;
	protected int cantMinima;
	protected int cantMaxima;
	protected int cantReal;
	
	public Componente(String serie, String modelo, String marca, float precioCompra, float precioVenta,
			int cantMinima, int cantMaxima, int cantReal) {
		super();
		this.serie = serie;
		this.modelo = modelo;
		this.marca = marca;
		this.precioVenta = precioVenta;
		this.precioCompra = precioCompra;
		this.cantMinima = cantMinima;
		this.cantMaxima = cantMaxima;
		this.cantReal = cantReal;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}
	

	public float getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(float precioCompra) {
		this.precioCompra = precioCompra;
	}

	public int getCantMinima() {
		return cantMinima;
	}

	public void setCantMinima(int cantMinima) {
		this.cantMinima = cantMinima;
	}

	public int getCantMaxima() {
		return cantMaxima;
	}

	public void setCantMaxima(int cantMaxima) {
		this.cantMaxima = cantMaxima;
	}

	public int getCantReal() {
		return cantReal;
	}

	public void setCantReal(int cantReal) {
		this.cantReal = cantReal;
	}

	public boolean chequearpedido()  {
		boolean res = false;
		if(cantReal<cantMinima) {
			res = true;
		}
		
		return res;
	}

public float Calbeneficio() {
		
		
		return precioVenta - precioCompra;
	}

}
