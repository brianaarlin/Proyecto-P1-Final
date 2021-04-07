package logico;

public class Administrativo extends Persona {
	
	private String usuario;
	private String contrasena;
	private float sueldo;
	
	public Administrativo(String nombre, String cedula, String telefono, String direccion, String usuario, String contrasena,
			float sueldo) {
		super(nombre, cedula, telefono, direccion);
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.sueldo = sueldo;
	}

	public String getUser() {
		return usuario;
	}

	public void setUser(String user) {
		this.usuario = user;
	}

	public String getPass() {
		return contrasena;
	}

	public void setPass(String pass) {
		this.contrasena = pass;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}


	
	

}
