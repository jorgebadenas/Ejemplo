package personas;

import java.time.LocalDateTime;

public class Persona {
	private String nombre;
	private String dni;
	private LocalDateTime nacimiento;
	/**
	 * @param nombre
	 * @param dni
	 * @param nacimiento
	 */
	public Persona(String nombre, String dni, LocalDateTime nacimiento) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.nacimiento = nacimiento;
	}
	
	public Persona() { }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public LocalDateTime getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(LocalDateTime nacimiento) {
		this.nacimiento = nacimiento;
	}
	

}
