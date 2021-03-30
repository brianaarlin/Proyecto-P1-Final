package logico;

import java.util.ArrayList;

public class Tienda {

	private ArrayList<Combo>combos;
	private ArrayList<Componente>componentes;
	private ArrayList<Factura>facturas;
	private ArrayList<Persona>personas;
	private ArrayList<Proveedor>proveedores;
	private ArrayList<OrdenCompra>ordenes;
	
	
	public Tienda() {
		super();
		this.combos = new ArrayList<Combo>();
		this.componentes = new ArrayList<Componente>();
		this.facturas = new ArrayList<Factura>();
		this.personas = new ArrayList<Persona>();
		this.proveedores = new ArrayList<Proveedor>();
		this.ordenes = new ArrayList<OrdenCompra>();
	}


	public ArrayList<Combo> getCombos() {
		return combos;
	}
	
	public void insertarCombo(Combo combo) {
		combos.add(combo);
	}

	public void setCombos(ArrayList<Combo> combos) {
		this.combos = combos;
	}


	public ArrayList<Componente> getComponentes() {
		return componentes;
	}
	
	public void insertarComponente(Componente componente) {
		this.componentes.add(componente);
	}

	public void setComponentes(ArrayList<Componente> componentes) {
		this.componentes = componentes;
	}


	public ArrayList<Factura> getFacturas() {
		return facturas;
	}
	
	public void insertarFactura(Factura factura) {
		this.facturas.add(factura);
	}


	public void setFacturas(ArrayList<Factura> facturas) {
		this.facturas = facturas;
	}


	public ArrayList<Persona> getPersonas() {
		return personas;
	}


	public void setPersonas(ArrayList<Persona> personas) {
		this.personas = personas;
	}


	public ArrayList<Proveedor> getProveedores() {
		return proveedores;
	}


	public void setProveedores(ArrayList<Proveedor> proveedores) {
		this.proveedores = proveedores;
	}


	public ArrayList<OrdenCompra> getOrdenes() {
		return ordenes;
	}


	public void setOrdenes(ArrayList<OrdenCompra> ordenes) {
		this.ordenes = ordenes;
	}
	
	public Cliente buscarCliente(String cedula) {
		Cliente cliente = null;
		int i = 0;
		boolean encontrado = false;
		while (i<personas.size() && !encontrado) {
			if(personas.get(i).getCedula().equalsIgnoreCase(cedula) && personas.get(i) instanceof Cliente) {
				encontrado = true;
				cliente =(Cliente) personas.get(i);
			}
			i++;
		}
		return cliente;
	}
	
	public Factura buscarFactura(String codigo) {
		Factura factura = null;
		int i = 0;
		boolean encontrado = false;
		while (i<facturas.size() && !encontrado) {
			if(facturas.get(i).getCod().equalsIgnoreCase(codigo)) {
				encontrado = true;
				factura = facturas.get(i);
			}
			i++;
		}
		return factura;
	}
	
	public Componente buscarComponente(String serie) {
		Componente componente = null;
		int i = 0;
		boolean encontrado = false;
		while (i<componentes.size() && !encontrado) {
			if(componentes.get(i).getSerie().equalsIgnoreCase(serie)) {
				encontrado = true;
				componente = componentes.get(i);
			}
			i++;
		}
		return componente;
	}
	
	public Combo buscarCombo(String codigo) {
		Combo combo = null;
		int i = 0;
		boolean encontrado = false;
		while (i<combos.size() && !encontrado) {
			if(combos.get(i).getCod().equalsIgnoreCase(codigo)) {
				encontrado = true;
				combo = combos.get(i);
			}
			i++;
		}
		return combo;
	}
	
	
}
