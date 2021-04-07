package logico;

public class Cliente extends Persona {
	
	private float credito;
	private boolean estado;
	private int DiasCredito;

	
	public Cliente(String nombre, String cedula, String telefono, String direccion, float credito, boolean estado,
			int diasCredito) {
		super(nombre, cedula, telefono, direccion);
		this.credito = credito;
		this.estado = true;
		DiasCredito = diasCredito;
	}


	public float getCredito() {
		return credito;
	}


	public void setCredito(float credito) {
		this.credito = credito;
	}


	public boolean isEstado() {
		return estado;
	}


	public void setEstado(boolean estado) {
		this.estado = estado;
	}


	public int getDiasCredito() {
		return DiasCredito;
	}


	public void setDiasCredito(int diasCredito) {
		DiasCredito = diasCredito;
	}

	

	
	

}
