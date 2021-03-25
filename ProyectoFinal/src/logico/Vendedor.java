package logico;

public class Vendedor extends Persona {

	private String codigo;
	private float totalventas;
	private float sueldo;
	private String usuario;
	private String contrasena;
	
	public Vendedor(String nombre, String cedula, String telefono, String direccion, String codigo, float totalventas,
			float sueldo, String usuario, String contrasena) {
		super(nombre, cedula, telefono, direccion);
		this.codigo = codigo;
		this.totalventas = totalventas;
		this.sueldo = sueldo;
		this.usuario = usuario;
		this.contrasena = contrasena;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public float getTotalventas() {
		return totalventas;
	}

	public void setTotalventas(float totalventas) {
		this.totalventas = totalventas;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	
}
