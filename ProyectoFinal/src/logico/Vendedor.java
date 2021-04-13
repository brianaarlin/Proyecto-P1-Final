package logico;

public class Vendedor extends Persona {

	private String codigo;
	private float totalventas;
	private float sueldo;
	private String user;
	private String pass;
	
	public Vendedor(String nombre, String cedula, String telefono, String direccion, float totalventas,
			float sueldo, String user, String pass) {
		super(nombre, cedula, telefono, direccion);
		this.codigo = codigo;
		this.totalventas = totalventas;
		this.sueldo = sueldo;
		this.user = user;
		this.pass = pass;
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
		return user;
	}

	public void setUsuario(String usuario) {
		this.user = usuario;
	}

	public String getContrasena() {
		return pass;
	}

	public void setContrasena(String contrasena) {
		this.pass = contrasena;
	}
	
	
}
