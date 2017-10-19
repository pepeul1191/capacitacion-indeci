package pe.edu.ulima.model;

import java.io.Serializable;

public class Contacto implements Serializable{
	private Long dni;
	private String nombre;
	private String paterno;
	private String materno;
	private String email;
	
	public Contacto(Long dni, String nombre, String paterno, String materno, String email) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.paterno = paterno;
		this.materno = materno;
		this.email = email;
	}
	
	public Long getDni() {
		return dni;
	}
	
	public void setDni(Long dni) {
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getPaterno() {
		return paterno;
	}
	
	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}
	
	public String getMaterno() {
		return materno;
	}
	
	public void setMaterno(String materno) {
		this.materno = materno;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}
