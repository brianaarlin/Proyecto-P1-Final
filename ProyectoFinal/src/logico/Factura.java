package logico;

import java.util.ArrayList;
import java.util.Date;

public class Factura {
	
	private String cod;
	private Date fecha;
	private ArrayList<Componente>componentes;
	private ArrayList<Combo>combo;
	private float total;
	private Persona cliente;
	private Vendedor vendedor;
	private boolean estado;
	
	
	public Factura(String cod, float total,
			Persona cliente, Vendedor vendedor, boolean estado) {
		super();
		this.cod = cod;
		this.fecha = new Date();
		this.componentes = new ArrayList<>();
		this.combo = new ArrayList<>();
		this.total = total;
		this.cliente = cliente;
		this.vendedor = vendedor;
		this.estado = estado;
		
		
	}


	public String getCod() {
		return cod;
	}


	public void setCod(String cod) {
		this.cod = cod;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public ArrayList<Componente> getComponentes() {
		return componentes;
	}


	public void setComponentes(ArrayList<Componente> componentes) {
		this.componentes = componentes;
	}


	public ArrayList<Combo> getCombo() {
		return combo;
	}


	public void setCombo(ArrayList<Combo> combo) {
		this.combo = combo;
	}


	public float getTotal() {
		return total;
	}


	public void setTotal(float total) {
		this.total = total;
	}


	public Persona getCliente() {
		return cliente;
	}


	public void setCliente(Persona cliente) {
		this.cliente = cliente;
	}


	public Vendedor getVendedor() {
		return vendedor;
	}


	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}


	public boolean isEstado() {
		return estado;
	}


	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
	
	
	



}
