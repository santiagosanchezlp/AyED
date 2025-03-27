package TP1.Ej3;

public class Estudiante {
	private String nombre;
	private String apellido;
	private int comision;
	private String email;
	private String direccion;
	
	public Estudiante(String unNombre, String unApellido, int unaComision, String unEmail, String unaDireccion) {
		this.setNombre(unNombre);
		this.setApellido(unApellido);
		this.setComision(unaComision);
		this.setEmail(unEmail);
		this.setDireccion(unaDireccion);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getComision() {
		return comision;
	}
	public void setComision(int comision) {
		this.comision = comision;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String tusDatos() {
		return (this.getNombre() 
				+ " " + this.getApellido() 
				+ ". Comision " + this.getComision() 
				+ ". E-mail " + this.getEmail()
				+ ". Direccion: " + this.getDireccion());
	}
	
}
