package com.adaptador;

/**
 * Clase que extiende de Datos y se encarga de unir el nombre introducido por el usuario.
 * @author zedin
 *
 */
public class Unir extends Datos{
	/**
	 * Metodo que se encarga de unir la cadena de texto.
	 */
	@Override
	public void DarNombre(String nombreCompleto) {
		// TODO Auto-generated method stub
		System.out.println( "El nombre que usted ingreso fue: " + nombreCompleto );
		System.out.println( "El nombre unido es: " + nombreCompleto.replace(" ", "") );
	}

}
