package logico;

import java.util.ArrayList;

public class Combo {
	
	private ArrayList<Componente> componentes;
	private String nombre;
	private String cod;
	
	public Combo(ArrayList<Componente> componentes, String nombre, String cod) {
		super();
		this.componentes = componentes;
		this.nombre = nombre;
		this.cod = cod;
	}

	public ArrayList<Componente> getComponentes() {
		return componentes;
	}

	public void setComponentes(ArrayList<Componente> componentes) {
		this.componentes = componentes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}
	
	public float calcularprecio() {
		float res = 0.0f;
		for(Componente c : componentes) {
			res+=c.getPrecioVenta();
		}
		return (res-(res*0.1f));
	}

	public void insertarcomponentes(Componente c) {
		componentes.add(c);
	}
	public float calCompra() {
		float total = 0.0f;
		for(Componente x : componentes) {
			total += x.getPrecioCompra();
		}
		return total;
	}

}
