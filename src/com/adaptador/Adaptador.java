package com.adaptador;

/**
 * Clase adaptadora de Interfaz, gracias a esta, interfaz se logra adaptar al padre.
 * @author zedin
 *
 */

public class Adaptador extends Datos {
	private Interfaz interfaz;
	
	/**
	 * Metodo sobreescrito del padre, a traves del cual la clase Interfaz se adapta al mismo.
	 */
	@Override
	public void DarNombre(String nombreCompleto) {
		// TODO Auto-generated method stub
		interfaz.ExtraerDatos(nombreCompleto);
	}
	/**
	 * Constructor de la clase.
	 */
	public Adaptador() {
		super();
		// TODO Auto-generated constructor stub
		this.interfaz = new Interfaz();
	}
	
}
