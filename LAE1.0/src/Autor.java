

import java.util.Date;

public class Autor {

	private int id_autor;
	private String nombre;
	private String apellidos;
	private String nacionalidad;
	private String f_nacimiento;
	
	
	public Autor(int id_autor, String nombre, String apellidos, String nacionalidad, String f_nacimiento) {
		this.id_autor = id_autor;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nacionalidad = nacionalidad;
		this.f_nacimiento = f_nacimiento;
	}


	public int getId_autor() {
		return id_autor;
	}


	public void setId_autor(int id_autor) {
		this.id_autor = id_autor;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getNacionalidad() {
		return nacionalidad;
	}


	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}


	public String getF_nacimiento() {
		return f_nacimiento;
	}


	public void setF_nacimiento(String f_nacimiento) {
		this.f_nacimiento = f_nacimiento;
	}
	
	
	
	
	
}
