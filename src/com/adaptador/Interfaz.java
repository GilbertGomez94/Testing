package com.adaptador;

/**
 * Esta es la clase que se necesita adaptar al padre de todos (Datos).
 * @author zedin
 *
 */
public class Interfaz {
	private String nombre;
	private String apellido;
	
	
	/**
	 * Se extrae el nombre completo introducido por el usuario.
	 * @param nombreCompleto Representa el nombre completo del usuario.
	 */
	public void ExtraerDatos(String nombreCompleto){
		setNombre( nombreCompleto.split( " " )[0] );
		setApellido( nombreCompleto.split( " " )[1] );
		MostrarDatos();
	}
	/**
	 * Muestra el nombre separado del usuario.
	 */
	public void MostrarDatos(){
		System.out.println( "Su nombre es: " + getNombre() );
		System.out.println( "Su apellido es: " + getApellido() );
	}

	/**
	 * Constructor de la clase.
	 * @param nombre Representa el nombre del usuario.
	 * @param apellido Representa el apellido del usuario.
	 */
	public Interfaz(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public Interfaz() {	}


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
}
