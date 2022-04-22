package Ejercicios_GIT;

public class Alumno {
	private String nombre;
	private String apellido;
	private String dni;
	
	//Constructor
	public Alumno(String nombre, String apellido, String dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
	
	//Método toString
	public String toString() {
		return "Alumno: " +nombre+apellido+ " - DNI: " +dni;
	}
	
	
}
