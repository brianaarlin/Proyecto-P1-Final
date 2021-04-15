package logico;

import java.util.ArrayList;

public class Tienda {

	private int cod_componente = 1;
	private int cod_proveedores = 1;
	private int cod_combos = 1;
	private int cod_facturas = 1;
	private int cod_OrdenC = 1;
	
	private Persona user= null;
	
	private ArrayList<Combo> combos;
	private ArrayList<Componente> componentes;
	private ArrayList<Factura> facturas;
	private ArrayList<Persona> personas;
	private ArrayList<Proveedor> proveedores;
	private ArrayList<OrdenCompra> ordenes;

	private int totalDisco = 0;
	private int totalMotherboard = 0;
	private int totalMemoriaRam = 0;
	private int totalMicroprocesadores = 0;
	public static Tienda tienda = null;

	public Tienda() {
		super();
		this.combos = new ArrayList<Combo>();
		this.componentes = new ArrayList<Componente>();
		this.facturas = new ArrayList<Factura>();
		this.personas = new ArrayList<Persona>();
		this.proveedores = new ArrayList<Proveedor>();
		this.ordenes = new ArrayList<OrdenCompra>();

	}
	
	public static Tienda getInstance() {
		if (tienda == null) {
			tienda = new Tienda();
		}
		return tienda;

	}

	
	
	public Persona getUser() {
		return user;
	}

	public void setUser(Persona user) {
		this.user = user;
	}

	public int getCod_OrdenC() {
		return cod_OrdenC;
	}



	public void setCod_OrdenC(int cod_OrdenC) {
		this.cod_OrdenC = cod_OrdenC;
	}


	public ArrayList<Combo> getCombos() {
		return combos;
	}

	public void insertarCombo(Combo combo) {
		combos.add(combo);
		setCod_combos(getCod_combos()+1);
	}

	public void setCombos(ArrayList<Combo> combos) {
		this.combos = combos;
	}

	public ArrayList<Componente> getComponentes() {
		return componentes;
	}

	public void insertarComponente(Componente componente) {
		this.componentes.add(componente);
		setCod_componente(getCod_componente()+1);
	}

	public void setComponentes(ArrayList<Componente> componentes) {
		this.componentes = componentes;
	}

	public ArrayList<Factura> getFacturas() {
		return facturas;
	}

	public void insertarFactura(Factura factura) {
		this.facturas.add(factura);
		setCod_facturas(getCod_facturas()+1);
	}

	public void setFacturas(ArrayList<Factura> facturas) {
		this.facturas = facturas;
	}

	public ArrayList<Persona> getPersonas() {
		return personas;
	}
	
	public void insertarPersona(Persona persona) {
		this.personas.add(persona);
	}

	public void setPersonas(ArrayList<Persona> personas) {
		this.personas = personas;
	}

	public ArrayList<Proveedor> getProveedores() {
		return proveedores;
	}

	public void insertarProveedor(Proveedor proveedor) {
		proveedores.add(proveedor);
		setCod_proveedores(getCod_proveedores()+1);
	}

	public void setProveedores(ArrayList<Proveedor> proveedores) {
		this.proveedores = proveedores;
	}

	public ArrayList<OrdenCompra> getOrdenes() {
		return ordenes;
	}
	
	public void InsertarOrden(OrdenCompra orden) {
		this.ordenes.add(orden);
		setCod_OrdenC(getCod_OrdenC()+1);
	}

	public void setOrdenes(ArrayList<OrdenCompra> ordenes) {
		this.ordenes = ordenes;
	}

	public int getCod_componente() {
		return cod_componente;
	}

	public void setCod_componente(int cod_componente) {
		this.cod_componente = cod_componente;
	}

	public int getCod_proveedores() {
		return cod_proveedores;
	}

	public void setCod_proveedores(int cod_proveedores) {
		this.cod_proveedores = cod_proveedores;
	}

	public int getCod_combos() {
		return cod_combos;
	}

	public void setCod_combos(int cod_combos) {
		this.cod_combos = cod_combos;
	}

	public int getCod_facturas() {
		return cod_facturas;
	}

	public void setCod_facturas(int cod_facturas) {
		this.cod_facturas = cod_facturas;
	}

	public int getTotalDisco() {
		return totalDisco;
	}

	public void setTotalDisco(int totalDisco) {
		this.totalDisco = totalDisco;
	}

	public int getTotalMotherboard() {
		return totalMotherboard;
	}

	public void setTotalMotherboard(int totalMotherboard) {
		this.totalMotherboard = totalMotherboard;
	}

	public int getTotalMemoriaRam() {
		return totalMemoriaRam;
	}

	public void setTotalMemoriaRam(int totalMemoriaRam) {
		this.totalMemoriaRam = totalMemoriaRam;
	}

	public int getTotalMicroprocesadores() {
		return totalMicroprocesadores;
	}

	public void setTotalMicroprocesadores(int totalMicroprocesadores) {
		this.totalMicroprocesadores = totalMicroprocesadores;
	}

	public Cliente buscarCliente(String cedula) {
		Cliente cliente = null;
		int i = 0;
		boolean encontrado = false;
		while (i < personas.size() && !encontrado) {
			if (personas.get(i).getCedula().equalsIgnoreCase(cedula) && personas.get(i) instanceof Cliente) {
				encontrado = true;
				cliente = (Cliente) personas.get(i);
			}
			i++;
		}
		return cliente;
	}
	


	public Factura buscarFactura(String codigo) {
		Factura factura = null;
		int i = 0;
		boolean encontrado = false;
		while (i < facturas.size() && !encontrado) {
			if (facturas.get(i).getCod().equalsIgnoreCase(codigo)) {
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
		while (i < componentes.size() && !encontrado) {
			if (componentes.get(i).getSerie().equalsIgnoreCase(serie)) {
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
		while (i < combos.size() && !encontrado) {
			if (combos.get(i).getCod().equalsIgnoreCase(codigo)) {
				encontrado = true;
				combo = combos.get(i);
			}
			i++;
		}
		return combo;
	}

	public Proveedor buscarProveedores(String serie) {
		Proveedor proveedor = null;
		int i = 0;
		int j = 0;
		boolean encontrado1 = false;
		boolean encontrado = false;
		while (i < proveedores.size() && !encontrado) {
			j = 0;
			while (j < proveedores.get(i).getComponentes().size() && !encontrado1) {
				if (proveedores.get(i).getComponentes().get(j).getSerie().equalsIgnoreCase(serie)) {
					encontrado = true;
					encontrado1 = true;
					proveedor = proveedores.get(i);
				}
				j++;
			}
			i++;
		}
		return proveedor;
	}

	public boolean HacerPedido(String serie) {
		boolean res = false;
		Componente componente = buscarComponente(serie);
		if (componente != null) {
			Proveedor proveedor = buscarProveedores(serie);
			if (proveedor != null) {
				res = componente.chequearpedido();
			}
		}
		return res;
	}

	public float CreditoCliente(Cliente client) {
		float r = 0;
		for (Factura f : facturas) {
			if (f.getCliente().cedula.equalsIgnoreCase(client.cedula) && f.isEstado()) {
				r += f.getTotal();
			}
		}

		return client.getCredito() - r;
	}

	public Proveedor buscarProveedor(String id) {
		int i = 0;
		boolean encontrado = false;
		Proveedor aux = null;
		while (i < proveedores.size() && !encontrado) {
			if (proveedores.get(i).getCodigo().equalsIgnoreCase(id)) {
				aux = proveedores.get(i);
				encontrado = true;
			}
			i++;
		}
		return aux;
	}

	public void VenderCombo(Combo combito) {
		Combo comb = buscarCombo(combito.getCod());
		for (Componente comp : combito.getComponentes()) {
			VenderComponente(comp);
		}

	}

	public void VenderComponente(Componente comp) {
		//Componente a = buscarComponente(comp.serie);
		//a.setCantReal(a.getCantReal() - 1);
		comp.setCantReal(comp.getCantReal()-1);
		
		if (comp instanceof DiscosDuros) {
			setTotalDisco(getTotalDisco() + 1);
		}

		if (comp instanceof TarjetaMadre) {
			setTotalMotherboard(getTotalMotherboard() + 1);
		}
		if (comp instanceof Microprocesadores) {
			setTotalMicroprocesadores(getTotalMicroprocesadores() + 1);
		}

		if (comp instanceof MemoriaRAM) {
			setTotalMemoriaRam(getTotalMemoriaRam() + 1);
		}

	}

	public boolean ChequearCombo(Combo combito) {
		boolean x = true;
		int cantidad = 0;
		int i = 0;
		int j = 0;
		while (i < combito.getComponentes().size() && x) {
			j = i + 1;
			cantidad = combito.getComponentes().get(i).getCantReal() - 1;
			if (cantidad > 0) {
				while (j < combito.getComponentes().size() && x) {
					if (combito.getComponentes().get(i).equals(combito.getComponentes().get(j))) {
						cantidad--;
						if (cantidad == -1) {
							x = false;
						}
					}
					j++;
				}
			} else {
				x = false;
			}
			i++;
		}
		return x;
	}

	public void DevolverCombo(Combo combito) {
		for (Componente comp : combito.getComponentes()) {
			comp.setCantReal(comp.getCantReal() + 1);

			if (comp instanceof DiscosDuros) {
				setTotalDisco(getTotalDisco() - 1);
			}

			if (comp instanceof TarjetaMadre) {
				setTotalMotherboard(getTotalMotherboard() - 1);
			}
			if (comp instanceof Microprocesadores) {
				setTotalMicroprocesadores(getTotalMicroprocesadores() - 1);
			}

			if (comp instanceof MemoriaRAM) {
				setTotalMemoriaRam(getTotalMemoriaRam() - 1);
			}

		}

	}
	
	public void PagarDeudaCliente(Cliente aux) {
		double total=0;
		ArrayList<String>s=new ArrayList<String>();
		for(Factura f : facturas) {
			if(f.getCliente().equals(aux) && f.isEstado()) {
				s.add(f.getCod());
				f.setEstado(false);
				total+=f.calcualBenf();
			}
		}
	}

}
